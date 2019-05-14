package example

fun Int.toRomanNumeral() : String = when {
    this >= 10 -> "X${(this-10).toRomanNumeral()}"
    this == 9 -> "IX"
    this >= 5 -> "V${(this-5).toRomanNumeral()}"
    this == 4 -> "IV"
    else -> (0 until this).joinToString("") { "I" }
}