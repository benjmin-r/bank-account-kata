function Money(amount) {
	this.amount = amount;
	
	this.isEqualTo = function(otherMoneyObj) {
		return this.amount === otherMoneyObj.amount;
	};
	
	this.plus = function(plusAmountMoney) {
		return new Money(this.amount + plusAmountMoney.amount);
	};
	
	this.toString = function() {
		return "{Money amount="+ this.amount +"}";
	};
};