// Vuong Tuan Kiet - 25810025
fun main() {
    val nhacCu = listOf(
        "Guitar",
        "Piano",
        "Gong",
        "Violin",
        "Guzheng",
        "Drum"
    )

    // Eager
    val ketLocQuaThongThuong=nhacCu.filter{
        it.startsWith("G")
    }

    println("Loc thong thuong")
    println(ketLocQuaThongThuong)

    // Lazy voi Sequence
    val ketQuaSequence=nhacCu.asSequence().filter {it.startsWith("G")}.toList()

    println("Loc bang Sequence")
    println(ketQuaSequence)
}