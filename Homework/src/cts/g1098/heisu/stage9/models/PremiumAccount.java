package cts.g1098.heisu.stage9.models;

import cts.g1098.heisu.stage7.enumerations.AccountType;

public final class PremiumAccount extends Account {

	public PremiumAccount(double loanValue, double rate, AccountType accountType) throws Exception {
		super(loanValue, rate, accountType);

	}

	public static double calculateTotalFee(PremiumAccount[] accounts) {
		double totalFee = 0.0;

		for (int i = 0; i < accounts.length; i++) {

			totalFee += getInterestPrincipal(accounts[i]);
		}
		return totalFee;
	}

	public static double getInterestPrincipal(PremiumAccount account) {
		return .0125 * (
		account.getLoan() * (Math.pow(account.getRate(), (account.getDaysActive() / 365)) - 1)); // interest-principal
	}

}
