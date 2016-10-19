package cn.edu.xupt.java.chapter4;
import java.util.Scanner;

public class Solution_37 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("Please input the integer: ");
		num = input.nextInt();
		while(num<1000||num>9999){
			System.out.println("Input is illeglly. Please try again: ");
		    num = input.nextInt();
		}
		int num_1 = num/1000;
		int num_2 = (num/100)%10;
		int num_3 = (num/10)%10;
		int num_4 = num%10;
		num_1 =(num_1 + 7)%10;
		num_2 =(num_2 + 7)%10;
		num_3 =(num_3 + 7)%10;
		num_4 =(num_4 + 7)%10;
		String result = Integer.toString(num_3)+Integer.toString(num_4)+Integer.toString(num_1)
							+Integer.toString(num_2);
		System.out.println("the result is :" + result);		
	}
}
