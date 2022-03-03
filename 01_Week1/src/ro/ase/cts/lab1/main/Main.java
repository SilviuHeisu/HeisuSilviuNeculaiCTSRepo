package ro.ase.cts.lab1.main;

import ro.ase.cts.lab1.exceptions.InsufficientFundsException;
import ro.ase.cts.lab1.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {
	System.out.println("Jelllo");
	//syso=System.out
	Profitable profitable;
	try {
		throw new InsufficientFundsException("You need money!");

	}
	catch(InsufficientFundsException ex) {
		System.out.println(ex.getMessage());
		
	}
	finally {
		System.out.println("Exceptions example");
	}
	

	}

}
