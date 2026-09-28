// VuongTuanKiet - 25810025
open class DongVat(
    val ten: String
) {
    open fun keu(): String {
        return "Dong vat dang keu"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat = listOf(
        Cho("Milu"),
        Meo("Mimi")
    )

    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten}: ${dongVat.keu()}")
    }
}

main()