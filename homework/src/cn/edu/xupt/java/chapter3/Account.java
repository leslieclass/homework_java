package cn.edu.xupt.java.chapter3;

public class Account {
	// the programm for question 3.12
	private double balance;
	
	public Account(double initialBalance){
		if(initialBalance>0.0){
			balance = initialBalance;
		}
	}
	
	public void credit(double amount){
		balance = balance + amount;
	}
	
	public void debit(double amount){
		if(amount>balance){
			System.out.println("Debit amount exceeded account balance.");
		}else{
			balance = balance - amount;
		}
	}
	
	public double getBalance(){
		return balance;
	}
}
