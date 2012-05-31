package bank;

public class Account {

    private Money balance = new Money(0);

    public Money getBalance() {
        return this.balance;
    }

    public void deposit(Money amount) {
        this.balance = this.balance.plus(amount);
    }

    public void withdraw(Money amount) {
        this.balance = this.balance.minus(amount);
    }

}
