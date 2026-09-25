fun Bai09() {
    val scores = arrayOf(
        8.0, 7.5, 9.0, 6.5, 8.5,
        5.5, 7.0, 9.5, 6.0, 8.0
    )

    var total=0.0
    var highest=scores[0]
    var lowest=scores[0]

    for (score in scores) {
        total+=score

        if (score>highest) {
            highest=score
        }

        if (score<lowest) {
            lowest=score
        }
    }

    val average=total/scores.size
    println("Diem trung binh: %.2f".format(average))
    println("Diem cao nhat: $highest")
    println("Diem thap nhat: $lowest")
}

Bai09()