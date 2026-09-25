// Vuong Tuan Kiet - 25810025
fun main() {

    // map
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubledNumbers = numbers.map {
        it * 2
    }

    println("Danh sach ban dau:")
    println(numbers)

    println("Danh sach sau khi nhan doi:")
    println(doubledNumbers)


    // flatten
    val nestedNumbers = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8)
    )

    val flatNumbers = nestedNumbers.flatten()

    println("\nDanh sach long nhau:")
    println(nestedNumbers)

    println("Danh sach sau khi flatten:")
    println(flatNumbers)
}