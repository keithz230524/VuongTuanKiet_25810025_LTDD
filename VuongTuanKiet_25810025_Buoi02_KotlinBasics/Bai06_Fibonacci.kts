fun Bai06() {
    var first=0
    var second=1
    for (index in 0..5) {
        println("Chi so $index: $first")
        val next=first+second
        first=second
        second=next
    }
}
Bai06()