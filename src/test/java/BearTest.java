import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    // Run the method below, before each test case that follows...
    @Before
    public void before() {
        bear = new Bear("Baloo", 25, 93.7, 'f');
    }


    @Test
    public void hasName() {
        // Expected value, actual value
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        // Expected value, actual value
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight() {
        // Expected value, actual value, delta - a tolerance (e.g., the result of a calculation)
        assertEquals(93.7, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernate_true() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void readyToHibernate_false() {
        Bear thinBear = new Bear("Baba", 33, 50, 'm');
        assertEquals(false, thinBear.readyToHibernate());
    }

    // char type - give your bear a gender
    @Test
    public void hasGender() {
        assertEquals('f', bear.getGender());
    }

}
