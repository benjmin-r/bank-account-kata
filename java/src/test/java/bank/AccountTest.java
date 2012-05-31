package bank;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        this.account = new Account();
    }

    @Test
    public void deposit() {
        this.account.deposit(new Money(100));
        assertEquals(new Money(100), account.getBalance());
    }

    @Test
    public void withdraw() {
        this.account.withdraw(new Money(123));
        assertEquals(new Money(-123), account.getBalance());
    }

    @Test
    public void multiple_deposit_and_withdraw() throws Exception {
        this.account.deposit(new Money(23));
        this.account.deposit(new Money(19));
        this.account.withdraw(new Money(21));

        assertEquals(new Money(21), this.account.getBalance());
    }
}
