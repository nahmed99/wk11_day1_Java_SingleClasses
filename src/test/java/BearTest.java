import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear = new Bear("Baloo", 25);

    @Test
    public void hasName() {
        // Bear bear = new Bear("Baloo", age);

        // Expected value, actual value
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        // Bear bear = new Bear("Baloo", age);

        // Expected value, actual value
        assertEquals(25, bear.getAge());
    }
}
