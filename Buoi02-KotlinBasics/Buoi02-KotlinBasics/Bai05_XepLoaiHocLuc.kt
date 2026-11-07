// Ngô Thái Tuấn - 25810072

fun main() {
    val diemTrungBinh: Double = 9.3

    val xepLoai = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuat sac"
        in 7.0..<8.5 -> "Gioi"
        in 5.5..<7.0 -> "Kha"
        in 4.0..<5.5 -> "Trung binh"
        in 0.0..<4.0 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem trung binh: $diemTrungBinh")
    println("Xep loai: $xepLoai")
}
