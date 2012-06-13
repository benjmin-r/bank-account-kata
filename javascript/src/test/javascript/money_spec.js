describe('The Money class',function(){
	
	beforeEach(function() {
		this.addMatchers(additionalMatchers);
	});
	

	describe('comparison',function() {
		it('two objects with same amount are equal', function(){
			var m1 = new Money(100);
			var m2 = new Money(100);
			expect(m1.isEqualTo(m2)).toBe(true);
		});
	});
	
	describe('adding money', function() {
		it('adds two money objects', function() {
			var m1 = new Money(102);
			var m2 = new Money(100);
			expect(m1.plus(m2)).toEqualMoney(new Money(202));
		});
	});

});