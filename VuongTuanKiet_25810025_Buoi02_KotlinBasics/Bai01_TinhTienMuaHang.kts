fun Bai01() {
    val quantity: Int=3
    val price:Double=15000.0
    val taxRate: Double=0.1

    val subTotal: Double=quantity.toDouble()*price
    val tax: Double=subTotal+taxRate
    val total:Double=subTotal*tax
    println("So luong: $quantity")
    println("Don gia: $price VND")
    println("Tien hang: $subTotal VND")
    println("Thue: $tax VND")
    println("Tong tien: $total VND")
}

Bai01()