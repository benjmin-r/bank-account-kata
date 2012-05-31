package bank;

import java.text.MessageFormat;

public class Money {

    private int amount = 0;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money minus(Money minusAmount) {
        return new Money(this.amount - minusAmount.amount);
    }

    public Money plus(Money plusAmount) {
        return new Money(this.amount + plusAmount.amount);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Money={0}", this.amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money other = (Money) obj;
        if ( amount != other.amount )
            return false;
        return true;
    }

}
