fun Bai04() {
    print("Nhap can nang: ")
    val weight: Double=readln().toDouble()

    print("Nhap chieu cao (m): ")
    val height: Double=readln().toDouble()

    val bmi=weight/(height*height)

    val classification:String

    if (bmi<18.5) {
        classification = "Gay"
    } else if (bmi<25) {
        classification="Binh thuong"
    } else if (bmi<30) {
        classification="Thua can"
    } else  {
        classification="Beo phi"
    }

    println("BMI: %.2f".format(bmi))
    println("Phan loai: $classification")
}
Bai04()
