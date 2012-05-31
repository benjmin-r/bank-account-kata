package bank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void should_be_equal_with_same_amount() {
		Money m1 = new Money( 101 );
		Money m2 = new Money( 101 );

		assertTrue( m1.equals( m2 ) );
	}

	@Test
	public void should_be_unequal_with_different_amount() {
		Money m1 = new Money( 101 );
		Money m2 = new Money( 102 );

		assertFalse( m1.equals( m2 ) );
	}
}
