// Vuong Tuan Kiet - 25810025
fun main() {
    val kiemTraDoDai:(String)->Boolean={
        it.length>=8
    }
    println("1234: ${kiemTraDoDai("1234")}")
    println("12345678: ${kiemTraDoDai("12345678")}")
    println("Kotlin123: ${kiemTraDoDai("Kotlin123")}")
}