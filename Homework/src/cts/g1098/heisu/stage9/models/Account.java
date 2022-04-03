package cts.g1098.heisu.stage9.models;

import cts.g1098.heisu.stage7.enumerations.AccountType;
import cts.g1098.heisu.stage7.exceptions.InvalidLoanValue;


public class Account {

	private double loanValue, rate;
	private int daysActive;
	private AccountType accountType;

	public double getLoan() {
		return this.loanValue;
	}

	public int getDaysActive() {
		return this.daysActive;
	}

	public double getRate() {
		return this.rate;
	}
	// must have method - the lead has requested it in all classes

	public double getMonthlyRate() {
		return this.loanValue * this.rate;
	}

	public void setDaysActive(int daysActive) {
		this.daysActive = daysActive;
	}

	public void setLoanValue(double loanValue) throws Exception {
		if (loanValue < 0)
			throw new InvalidLoanValue();
		else {
			this.loanValue = loanValue;
		}
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + this.getDaysActive() + "; Type: "
				+ this.accountType + ";";
	}

	public Account(double loanValue, double rate, AccountType accountType) throws Exception {
		if (loanValue < 0)
			throw new InvalidLoanValue();
		else {
			this.loanValue = loanValue;
			this.rate = rate;
			this.accountType = accountType;
		}

	}

}
