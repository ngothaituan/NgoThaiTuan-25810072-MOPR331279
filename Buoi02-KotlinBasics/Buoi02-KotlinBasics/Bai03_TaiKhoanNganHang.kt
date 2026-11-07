// Ngô Thái Tuấn - 25810072

fun main() {
    val soDuBanDau: Long = 5_000_000L
    var soDuHienTai: Long = soDuBanDau

    println("So du ban dau: $soDuBanDau VND")

    val tienGui: Long = 2_000_000L
    soDuHienTai += tienGui
    println("Sau khi gui $tienGui VND, so du: $soDuHienTai VND")

    val tienRut: Long = 1_500_000L
    soDuHienTai -= tienRut
    println("Sau khi rut $tienRut VND, so du: $soDuHienTai VND")

    println("Doi chieu: so du ban dau $soDuBanDau VND, so du hien tai $soDuHienTai VND")
}
