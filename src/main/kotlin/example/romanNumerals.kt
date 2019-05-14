package example

fun Int.toRomanNumeral() : String = when {
    this == 4 -> "IV"
    this == 5 -> "V"
    this == 6 -> "VI"
    else -> (0 until this).joinToString("") { "I" }
}