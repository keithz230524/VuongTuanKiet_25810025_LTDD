// Vuong Tuan Kiet - 25810025
fun dinhDangDiaChi(tenNguoiNhan:String, diaChi:String,  phuongXa:String="Khong ro", soDienThoai:String="Khong co", thanhPho:String="TPHCM"): String {
    return "$tenNguoiNhan - $diaChi, $phuongXa, $thanhPho - SDT: $soDienThoai"
}

fun main() {
    val ketQua = dinhDangDiaChi(
        "Vuong Tuan Kiet",
        "123 Vo Van Ngan",
        phuongXa = "Thu Duc",
        soDienThoai = "99139",
        thanhPho = "TP. Ho Chi Minh"
    )

    println(ketQua)
}

main()
