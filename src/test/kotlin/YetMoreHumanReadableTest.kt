import org.amshove.kluent.`should be in range`
import org.amshove.kluent.`should be in`
import org.amshove.kluent.`should not throw`
import org.junit.Test

class YetMoreHumanReadableTest {
    @Test
    fun `Given Kluent, when writing assertion statements, then you are happier`() {
        val list = mutableListOf(1)
        val item = 2
        val number = 12

        list.add(item)

        item `should be in` list

        {
            // ...
        }.`should not throw`(Exception::class)

        number `should be in range` 10..20
    }
}