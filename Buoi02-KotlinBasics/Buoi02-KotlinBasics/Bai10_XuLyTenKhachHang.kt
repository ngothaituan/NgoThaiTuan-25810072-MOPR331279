//Ngô Thái Tuấn - 25810072

fun xuLyTenKhachHang(tenKhachHang: String?) {
    val doDai: Int? = tenKhachHang?.length
    println("Do dai ten (safe call): $doDai")

    val tenHienThi: String = tenKhachHang ?: "Khach vang lai"
    println("Ten hien thi (Elvis): $tenHienThi")

    val doDaiAnToan: Int = tenKhachHang?.length ?: 0
    println("Do dai an toan (safe call + Elvis): $doDaiAnToan")
}

fun main() {
    println("--- Truong hop co ten ---")
    xuLyTenKhachHang("Tran Thi B")

    println("--- Truong hop ten null ---")
    xuLyTenKhachHang(null)

    println("--- Toan tu !! ---")
    val tenCoGiaTri: String? = "Le Van C"
    println("Do dai (!!, co gia tri): ${tenCoGiaTri!!.length}")

    val tenRong: String? = null
    try {
        println("Do dai (!!, null): ${tenRong!!.length}")
    } catch (e: NullPointerException) {
        println("Loi NullPointerException khi dung !! tren bien null")
    }
}
