package cts.g1098.heisu.stage7.models;

import cts.g1098.heisu.stage7.enumerations.AccountType;

public class PremiumAccount extends Account{

	public PremiumAccount(double loanValue, double rate, AccountType accountType) throws Exception {
		super(loanValue, rate, accountType);
		
	}
	public static double calculateTotalFee(Account[] 	accounts)
	{
	double totalFee=0.0;
	
	
	for	(int i=0;i<accounts.length;i++)	{
	
	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			accounts[i].getLoan()*Math.pow(accounts[i].getRate(),(accounts[i].getDaysActive()/365)) - accounts[i].getLoan());	//	interest-principal
	}
	return	totalFee;
	}

	

}
