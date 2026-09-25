// Vuong Tuan Kiet - 25810025
// 1. Tinh binh phuong

fun binhPhuongDayDu(number: Int): Int {
    return number * number
}

fun binhPhuongRutGon(number: Int): Int = number * number


// 2. Tinh chu vi hinh vuong

fun chuViDayDu(canh: Double): Double {
    return canh * 4
}

fun chuViRutGon(canh: Double): Double = canh * 4


// 3. Kiem tra so chan

fun laSoChanDayDu(number: Int): Boolean {
    return number % 2 == 0
}

fun laSoChanRutGon(number: Int): Boolean = number % 2 == 0


fun main() {
    println("Binh phuong:")
    println(binhPhuongDayDu(5))
    println(binhPhuongRutGon(5))

    println("\nChu vi:")
    println(chuViDayDu(4.5))
    println(chuViRutGon(4.5))

    println("\nKiem tra so chan:")
    println(laSoChanDayDu(8))
    println(laSoChanRutGon(8))
}