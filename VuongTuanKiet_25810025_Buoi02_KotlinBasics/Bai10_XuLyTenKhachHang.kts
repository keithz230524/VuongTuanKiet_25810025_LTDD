fun Bai10() {
    print("Nhap ten khach hang: ")

    val customerName: String? = readLine()?.takeIf { it.isNotBlank() }

    // Safe call
    val nameLength: Int? = customerName?.length

    // Elvis
    val displayName: String = customerName ?: "Khach vang lai"

    println("Ten khach hang: $displayName")
    println("Do dai ten: ${nameLength ?: 0}")

    // !! Ko loi la do bien nay chac chan ko null
    val demoName: String? = "Kiet"
    println("Do dai demo voi !!: ${demoName!!.length}")
}
Bai10()