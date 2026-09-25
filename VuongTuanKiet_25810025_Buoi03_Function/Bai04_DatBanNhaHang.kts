// Vuong Tuan Kiet - 25810025
fun datBan(tenKhachHang:String, soLuongKhach: Int, loaiBan:String="Ban thuong"){
    println(
        "Khach hang: $tenKhachHang - " +
                "So luong khach: $soLuongKhach - " +
                "Loai ban: $loaiBan"
    )
}

fun main() {
    // 1. Dung gia tri mac dinh
    datBan("Kiet", 2)

    // 2. Truyen day du theo thu tu
    datBan("An", 4, "Ban VIP")

    // 3. Truyen bang ten tham sao
    datBan(tenKhachHang = "Nhu", soLuongKhach = 10, loaiBan = "Ngoai troi")
}

main()