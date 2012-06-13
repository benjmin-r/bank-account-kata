var additionalMatchers = {
	toEqualMoney: function(expected) {
	    var actual = this.actual;
	    this.message = function () {
	    	return "Expected " + actual + " to be equal to " + expected;
	    };
		return this.actual.isEqualTo(expected);
	},
};