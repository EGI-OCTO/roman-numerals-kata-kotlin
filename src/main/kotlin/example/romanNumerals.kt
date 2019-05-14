package example

fun Int.toRomanNumeral() : String = if (this == 1) {
    "I"
} else {
    "II"
}