public void spendFor(String reason, double amount) {
      require(! "".equals(reason), "There has to be a source!");
    	require(amount >= 0, "Amount " + amount + " is not positive");
    	require(cashOnHand > amount,"You haven't enough \"Asche\"");
    	expenditures.put(reason, this.totalSpentFor(reason) + amount);
    	cashOnHand -= amount;
    }