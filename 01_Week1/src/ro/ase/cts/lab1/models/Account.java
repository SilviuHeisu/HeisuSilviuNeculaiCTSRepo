package ro.ase.cts.lab1.models;

public abstract class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	public abstract void Deposit(double ammount);
	public abstract void Withdraw(double ammount);
	public abstract void Transfer(Account destionation,double ammount);
	public abstract double getBalance();

}
