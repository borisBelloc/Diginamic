var listOfColor =
    listOf(
        "noir",
        "marron",
        "rouge",
        "orange",
        "jaune"
    )

fun getCode(couleur: String): Int {
     if (listOfColor.contains(couleur)) {
         return listOfColor.indexOf(couleur)
     }
    return 404
}


fun main() {
    var c1 = getCode("noir")
    println(c1)


}