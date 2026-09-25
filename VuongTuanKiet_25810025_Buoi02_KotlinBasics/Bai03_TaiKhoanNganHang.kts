fun Bai03() {
    val initialBalance:Int=5_000_000

    var balance:Int=initialBalance

    println("So du ban dau: $balance VND")

    balance+=2_000_000
    println("Sau khi gui tien: $balance VND")

    balance -= 1_500_000
    println("Sau khi rut tien: $balance VND")

    println("So du ban dau: $initialBalance VND")
}

Bai03()