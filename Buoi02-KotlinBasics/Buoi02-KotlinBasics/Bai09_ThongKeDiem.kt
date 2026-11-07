// Ngô Thái Tuấn - 25810072

fun main() {
    val diemSo = arrayOf(7.5, 8.0, 6.5, 9.0, 5.0, 8.5, 4.5, 10.0, 7.0, 6.0)

    var tong = 0.0
    var diemCaoNhat = diemSo[0]
    var diemThapNhat = diemSo[0]

    for (diem in diemSo) {
        tong += diem
        if (diem > diemCaoNhat) diemCaoNhat = diem
        if (diem < diemThapNhat) diemThapNhat = diem
    }

    val diemTrungBinh = tong / diemSo.size

    println("Diem trung binh: ${"%.2f".format(diemTrungBinh)}")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}
