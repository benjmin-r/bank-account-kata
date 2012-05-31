package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void should_be_equal_with_same_amount() {
        Money m1 = new Money(101);
        Money m2 = new Money(101);

        assertTrue(m1.equals(m2));
    }

    @Test
    public void should_be_unequal_with_different_amount() {
        Money m1 = new Money(101);
        Money m2 = new Money(102);

        assertFalse(m1.equals(m2));
    }

    @Test
    public void should_subtract_amount() throws Exception {
        Money m1 = new Money(10);
        Money m2 = new Money(6);

        assertEquals(new Money(4), m1.minus(m2));
    }

    @Test
    public void should_subtract_to_negative_amount() throws Exception {
        Money m1 = new Money(10);
        Money m2 = new Money(20);

        assertEquals(new Money(-10), m1.minus(m2));
    }

    @Test
    public void should_add_amount() throws Exception {
        Money m1 = new Money(10);
        Money m2 = new Money(20);

        assertEquals(new Money(30), m1.plus(m2));
    }
}
