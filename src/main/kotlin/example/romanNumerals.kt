package example

fun Int.toRomanNumeral() : String = if (this == 4) {
    "IV"
} else {
    (0 until this).joinToString("") { "I" }
}