import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class Configuration {
    @Before
    fun before() {
        println("before")
    }

    @Test
    fun justRunIt() {
    }

    @After
    fun after() {
        println("after")
    }

    companion object {
        @JvmStatic
        @BeforeClass
        fun beforeClass() {
            println("beforeClass")
        }

        @JvmStatic
        @AfterClass
        fun afterClass() {
            println("afterClass")
        }
    }
}