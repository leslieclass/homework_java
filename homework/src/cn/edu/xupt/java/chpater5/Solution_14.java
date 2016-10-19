package cn.edu.xupt.java.chpater5;

public class Solution_14 {
	public static void main(String args[]) {
		double amount; // amount on deposit at end of each year
		double principal = 1000.0; // initial amount before interest
		double rate = 0.05; // interest rate

		// display headers
		System.out.printf("%s%10s%20s\n", "Year", "Rate", "Amount on deposit");
		for(int i=5; i<=10; i++){
			rate = 0.01 * i;
			for (int year = 1; year <= 10; year++) {
				// calculate new amount for specified year
				amount = principal * Math.pow(1.0 + rate, year);

				// display the year and the amount
				System.out.printf("%4d%,10.2f%,20.2f\n", year, rate, amount);
			} // end for
		} // end main
	}
}
