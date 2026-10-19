// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 55 gives a pass`() {
        assertEquals("Pass",grade(55))
    }
    @Test
    fun `Mark of 40 gives a pass`() {
        assertEquals("Pass",grade(40))
    }
    @Test
    fun `Mark of 70 gives a distinction`() {
        assertEquals("Distinction",grade(70))
    }
    @Test
    fun `Mark of 85 gives a distinction`() {
        assertEquals("Distinction",grade(85))
    }
    @Test
    fun `Mark of 100 gives a distinction`() {
        assertEquals("Distinction",grade(100))
    }

}
