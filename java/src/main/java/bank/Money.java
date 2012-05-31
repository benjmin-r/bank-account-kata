package bank;

import java.text.MessageFormat;

public class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money other = (Money) obj;
        if ( amount != other.amount )
            return false;
        return true;
    }

    public Money minus(Money minusAmount) {
        return new Money(this.amount - minusAmount.amount);
    }

    public String toString() {
        return MessageFormat.format("Money={0}", this.amount);
    }

}
