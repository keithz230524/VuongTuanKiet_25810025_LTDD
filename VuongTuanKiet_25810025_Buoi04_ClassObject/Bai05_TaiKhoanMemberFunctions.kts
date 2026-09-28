// VuongTuanKiet - 25810025
class TaiKhoanNganHang(val soTaiKhoan:String, var soDu:Double) {

    fun napTien(soTien:Double) {
        soDu+=soTien
    }

    fun rutTien(soTien:Double): Boolean {
        return if (soDu>=soTien) {
            soDu-=soTien
            true
        } else {
            false
        }
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang(
        soTaiKhoan = "TK001",
        soDu = 1_000_000.0
    )

    println("So du ban dau: ${taiKhoan.soDu}")

    taiKhoan.napTien(500_000.0)
    println("Sau khi nap: ${taiKhoan.soDu}")

    val rutThanhCong = taiKhoan.rutTien(300_000.0)

    println("Rut tien thanh cong: $rutThanhCong")
    println("Sau khi rut: ${taiKhoan.soDu}")

    val rutLanHai = taiKhoan.rutTien(2_000_000.0)

    println("Rut 2 lan thanh cong: $rutLanHai")
    println("So du cuoi: ${taiKhoan.soDu}")
}

main()