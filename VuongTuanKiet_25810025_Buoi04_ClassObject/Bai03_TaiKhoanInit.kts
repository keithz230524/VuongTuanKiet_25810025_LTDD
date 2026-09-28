// VuongTuanKiet - 25810025
class TaiKhoanNganHang(
    val soTaiKhoan: String,
    var soDuBanDau: Double
) {

    init {
        if (soDuBanDau < 0) {
            println("Số dư không hợp lệ")
        } else {
            println(
                "Tạo tài khoản thành công. " +
                        "Số dư ban đầu: $soDuBanDau"
            )
        }
    }
}

fun main() {
    val taiKhoan1 = TaiKhoanNganHang(
        "TK001",
        5_000_000.0
    )

    val taiKhoan2 = TaiKhoanNganHang(
        "TK002",
        -1_000_000.0
    )
}

main()