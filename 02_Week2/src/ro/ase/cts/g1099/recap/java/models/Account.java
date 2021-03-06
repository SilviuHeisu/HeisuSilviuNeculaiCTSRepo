package ro.ase.cts.g1099.recap.java.models;

import ro.ase.cts.g1099.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1099.recap.java.exceptions.InsufficientFundsException;

public abstract class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	public abstract void deposit(double ammount) throws IllegalTransferException;
	public abstract void withdraw(double ammount) throws IllegalTransferException, InsufficientFundsException;
	public abstract void transfer(Account destination,double ammount) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
	
	
	
	
	

}
