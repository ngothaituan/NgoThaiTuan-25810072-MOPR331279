// Ngô Thái Tuấn - 25810072

fun main() {
    val danhSachSach = mutableListOf(
        "Dac Nhan Tam",
        "Nha Gia Kim",
        "De Men Phieu Luu Ky",
        "Tuoi Tre Dang Gia Bao Nhieu",
        "Sapiens"
    )

    println("Danh sach ban dau: $danhSachSach")

    danhSachSach.add("Clean Code")
    danhSachSach.add("Atomic Habits")
    danhSachSach.remove("Sapiens")
    danhSachSach.sort()
    println("Danh sach sau khi them, xoa, sap xep: $danhSachSach")
}
