// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "Median of 10 for list (10)" {
        median(listOf(10f)) shouldBe 10f
    }

    "Median of 15 for list (10,20)" {
        median(listOf(10f,20f)) shouldBe 15f
    }

    "Median of 25 for list (50,10,25)" {
        median(listOf(50f,10f,25f)) shouldBe 25f
    }

    "Median of 20 for list (50,25,10,15)" {
        median(listOf(50f,25f,10f,15f)) shouldBe 20f
    }
})
