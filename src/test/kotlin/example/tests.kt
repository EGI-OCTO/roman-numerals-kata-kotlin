package example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RomanNumeralsTest : StringSpec({
    "1 should be I" {
        1.toRomanNumeral() shouldBe("I")
    }
    "2 should be II" {
        2.toRomanNumeral() shouldBe("II")
    }
    "3 should be III" {
        3.toRomanNumeral() shouldBe("III")
    }
    "4 should be IV" {
        4.toRomanNumeral() shouldBe("IV")
    }
    "5 should be V" {
        5.toRomanNumeral() shouldBe("V")
    }
    "6 should be VI" {
        6.toRomanNumeral() shouldBe("VI")
    }
    "7 should be VII" {
        7.toRomanNumeral() shouldBe("VII")
    }
    "8 should be VIII" {
        8.toRomanNumeral() shouldBe("VIII")
    }
    "9 should be IX" {
        9.toRomanNumeral() shouldBe("IX")
    }
})