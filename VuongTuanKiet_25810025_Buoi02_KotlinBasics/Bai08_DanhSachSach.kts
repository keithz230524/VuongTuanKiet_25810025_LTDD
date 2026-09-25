fun Bai08() {
    val books=mutableListOf(
        "Sach Abc",
        "Sach Bcv",
        "Sach Kkk",
        "Sach Zcv",
        "Sach Mda"
    )

    println("Danh sach ban dau: $books")

    books.add("Sach Van")
    books.add("Sach Toan")

    books.removeAt(2)

    books.sort()

    println("Danh sach sau khi xu ly: $books")
}
Bai08()