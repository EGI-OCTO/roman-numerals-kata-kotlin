package example

fun Int.toRomanNumeral() : String = when {
    this == 4 -> "IV"
    this >= 5 -> "V${(0 until this-5).joinToString("") { "I" }}"
    else -> (0 until this).joinToString("") { "I" }
}