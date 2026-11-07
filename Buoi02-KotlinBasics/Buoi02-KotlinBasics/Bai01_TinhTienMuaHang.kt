// Phạm Tuấn Anh - 25810054

fun main() {
    val soLuong: Int = 5
    val donGia: Double = 125000.0
    val thueSuat = 0.08
    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * thueSuat
    val tongTien: Double = tienHang + tienThue

    println("So luong: $soLuong")
    println("Don gia: $donGia VND")
    println("Tien hang: $tienHang VND")
    println("Thue 8%: $tienThue VND")
    println("Tong tien phai tra: $tongTien VND")
}
