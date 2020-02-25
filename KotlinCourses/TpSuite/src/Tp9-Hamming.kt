fun countHamming(str1: String, str2: String) :Int {
    var tmp = str1.zip(str2)
    var distance: Int = 0
    tmp.map { v -> (if (v.first != v.second) {distance +=1}) }

    return distance
}

fun main() {
    println( "Distance ${countHamming("azerty", "azrrto")}")

}


// correction
fun compute(dna1: String, dna2: String): Int {
    require(dna1.length == dna2.length) { "longueur doit etre égale"}
    return dna1.zip(dna2).count { (val1, val2) -> val1 != val2 }
}