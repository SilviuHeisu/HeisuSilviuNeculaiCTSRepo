package ro.ase.cts.g1099.recap.java.models;

import ro.ase.cts.g1099.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.recap.java.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account{
protected double balance;
protected String iban;
public BankAccount(String iban) {
	this.iban=iban;
}

@Override
public double getBalance() {
	return this.balance;	
}

@Override
public void deposit(double ammount) throws IllegalTransferException {
	if(ammount<=0)
		{throw new IllegalTransferException();}
	this.balance+=ammount;
	
	
}

@Override
public void withdraw(double ammount) throws IllegalTransferException, InsufficientFundsException {
	if(ammount<=0)
		{throw new IllegalTransferException();}
	if(ammount>this.balance) {
		throw new InsufficientFundsException();
	}
	this.balance-=ammount;
	}
	


@Override
public void transfer(Account destination, double ammount) throws IllegalTransferException, InsufficientFundsException {
	this.withdraw(ammount);
	destination.deposit(ammount);
}




}
