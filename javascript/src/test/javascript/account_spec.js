describe('The Account class',function(){
	
	beforeEach(function() {
		this.addMatchers(additionalMatchers);
	});
	
	describe('deposit money',function() {
		it('balance increases by money deposited', function(){
			var m1 = new Money(100);
			var account = new Account();
			account.deposit(m1);
			
			expect(account.balance).toEqualMoney(new Money(100));
		});
	});

});