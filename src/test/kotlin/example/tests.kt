package example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RomanNumeralsTest : StringSpec({
    "1 should be I" {
        1.toRomanNumeral() shouldBe("I")
    }
})