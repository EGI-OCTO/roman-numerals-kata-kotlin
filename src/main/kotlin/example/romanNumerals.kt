package example

fun Int.toRomanNumeral() : String = when {
    this == 9 -> "IX"
    this >= 5 -> "V${(0 until this-5).joinToString("") { "I" }}"
    this == 4 -> "IV"
    else -> (0 until this).joinToString("") { "I" }
}