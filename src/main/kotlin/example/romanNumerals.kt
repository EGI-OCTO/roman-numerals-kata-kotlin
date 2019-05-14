package example

fun Int.toRomanNumeral() : String = (0 until this).joinToString("") { "I" }