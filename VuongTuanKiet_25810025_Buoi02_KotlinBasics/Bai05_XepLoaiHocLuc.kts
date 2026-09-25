fun Bai05() {
    print("Nhap diem trung binh: ")
    val score: Double=readln().toDouble()

    val classification=when (score) {
        in 8.5..10.0 -> "Xuat sac"
        in 7.0..<8.5 -> "Gioi"
        in 6.0..<7.0 -> "Kha"
        in 5.0..<6.0 -> "Trung binh"
        in 0.0..<5.0 -> "Yeu"
        else -> "Diem khong hop le"
    }
    println("Diem trung binh: $score")
    println("Xep loai: $classification")
}
Bai05()