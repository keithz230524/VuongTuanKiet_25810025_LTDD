// Vuong Tuan Kiet - 25810025
fun ghiNhatKyCoUnit(hoatDong: String): Unit {
    println("[NHAT KY] $hoatDong")
}

fun ghiNhatKyKhongUnit(hoatDong: String) {
    println("[NHAT KY] $hoatDong")
}

fun main() {
    ghiNhatKyCoUnit("Dang nhap he thong")
    ghiNhatKyKhongUnit("Dang nhap he thong")
}

main()