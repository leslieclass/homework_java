package cn.edu.xupt.java.chapter3;

public class AccountTest {
	public static void main(String[] args){
		Account acc = new Account(10000);
		System.out.println("init amount is :"+acc.getBalance());
		acc.debit(100);
		System.out.println("after debit, the balance is :"+ acc.getBalance());
		acc.debit(10000);
	}
}
