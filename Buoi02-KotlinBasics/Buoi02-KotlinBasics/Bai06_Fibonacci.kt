// Ngô Thái Tuấn - 25810072

fun main() {
    var soTruoc = 0
    var soHienTai = 1

    println("Cac so Fibonacci nho hon 100:")
    for (viTri in 0..99) {
        val giaTri = if (viTri == 0) 0 else if (viTri == 1) 1 else {
            val tong = soTruoc + soHienTai
            soTruoc = soHienTai
            soHienTai = tong
            tong
        }
        if (giaTri >= 100) break
        println("F($viTri) = $giaTri")
    }
}
