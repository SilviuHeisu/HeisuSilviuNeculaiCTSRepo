package cts.g1098.heisu.stage3;



public class Account {

	private double	loanValue,rate;	
	private int	daysActive,accountType;
	private static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	
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
			throw new Exception();
		else
		{
			this.loanValue = loanValue;
		}
	}
	
	public String toString() {
		return "Loan: "+this.loanValue+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}
	
	public void print() {
		int vb = 10;
	}

	public static double calculateTotalFee(Account[] 	accounts)
	{
	double totalFee=0.0;
	Account	account;
	int temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.accountType==Account.PREMIUM||account.accountType==Account.SUPER_PREMIUM)	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			account.loanValue*Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);	//	interest-principal
	}
	return	totalFee;
	}

	public Account(double value, double rate, int account_Type) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = account_Type;
	}
	
	
}
