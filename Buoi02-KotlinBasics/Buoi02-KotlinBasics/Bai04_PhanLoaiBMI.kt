// Ngô Thái Tuấn - 25810072

fun main() {
    val canNang: Double = 65.0
    val chieuCao: Double = 1.70

    val bmi: Double = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gay"
    } else if (bmi < 25.0) {
        phanLoai = "Binh thuong"
    } else if (bmi < 30.0) {
        phanLoai = "Thua can"
    } else {
        phanLoai = "Beo phi"
    }

    println("Chi so BMI: ${"%.2f".format(bmi)}")
    println("Phan loai: $phanLoai")
}
