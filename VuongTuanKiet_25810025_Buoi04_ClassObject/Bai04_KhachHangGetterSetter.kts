// VuongTuanKiet - 25810025
class KhachHang(var ho:String, var ten:String) {
    var hoTen: String
        get()="$ho $ten"
        set(value) {
            val parts=value.trim().split(" ", limit=2)

            ho=parts[0]

            ten=if (parts.size>1) {
                parts[1]
            } else {
                ""
            }
        }
}

fun main() {
    val khachHang=KhachHang(
        ho="Nguyen",
        ten = "Nhu"
    )
    println("Ho ten ban dau: ${khachHang.hoTen}")

    khachHang.ten="Kiet"
    println("Sua khi doi ten: ${khachHang.hoTen}")

    khachHang.hoTen="Nguyen Van"

    println("Ho: ${khachHang.ho}")
    println("Ten: ${khachHang.ten}")
    println("Ho ten: ${khachHang.hoTen}")
}

main()