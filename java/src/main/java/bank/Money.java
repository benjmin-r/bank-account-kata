package bank;

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

}
