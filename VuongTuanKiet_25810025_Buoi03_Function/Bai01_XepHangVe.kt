// Vuong Tuan Kiet - 25810025
fun xepHangVe() {
    print("Nhap tuoi: ")
    val age = readln().toInt()

    val loaiVe = if (age < 18) {
        "Ve tre em"
    } else if (age < 60) {
        "Ve nguoi lon"
    } else {
        "Ve cao tuoi"
    }

    println("Loai ve: $loaiVe")
}