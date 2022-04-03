package cts.g1098.heisu.stage6.models;

import cts.g1098.heisu.stage6.enumerations.AccountType;
import cts.g1098.heisu.stage6.exceptions.InvalidLoanValue;


public class Account {

	private double	loanValue,rate;	
	private int	daysActive;
	private AccountType accountType;
	
	public double getLoan() {
		return loanValue;
	}
	
	
	public double getRate() {
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
			throw new InvalidLoanValue();
		else
		{
			this.loanValue = loanValue;
		}
	}
	
	public String toString() {
		return "Loan: "+this.loanValue+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}
	
	

	public static double calculateTotalFee(Account[] 	accounts)
	{
	double totalFee=0.0;
	
	
	for	(int	i=0;i<accounts.length;i++)	{
	
	if(accounts[i].accountType==AccountType.PREMIUM||accounts[i].accountType==AccountType.SUPER_PREMIUM)	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			accounts[i].loanValue*Math.pow(accounts[i].rate,(accounts[i].daysActive/365)) - accounts[i].loanValue);	//	interest-principal
	}
	return	totalFee;
	}

	public Account(double value, double rate, AccountType account_Type) throws Exception {
		if(value<0)
			throw new InvalidLoanValue();
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = account_Type;
	}
	
	
}
