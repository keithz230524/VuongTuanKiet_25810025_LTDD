// Vuong Tuan Kiet - 25810025
fun xuLyVanBan(
    vanBan: String,
    xuLy: (String) -> String
): String {
    return xuLy(vanBan)
}

fun vietHoa(vanBan: String): String {
    return vanBan.uppercase()
}

fun main() {

    // Cach 1: Lambda viet truc tiep
    val ketQua1 = xuLyVanBan(
        "  Kotlin  ",
        { it.trim() }
    )

    // Cach 2: Function reference
    val ketQua2 = xuLyVanBan(
        "hoc kotlin",
        ::vietHoa
    )

    // Cach 3: Trailing lambda
    val ketQua3 = xuLyVanBan("Kotlin") {
        it.reversed()
    }

    println("Ket qua 1: $ketQua1")
    println("Ket qua 2: $ketQua2")
    println("Ket qua 3: $ketQua3")
}