function Account() {
	this.balance = new Money(0);
	
	this.deposit = function(moneyAmount) {
		this.balance = this.balance.plus(moneyAmount);
	};
};