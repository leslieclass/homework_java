package cn.edu.xupt.java.chapter2;
import java.util.Scanner;

public class Solution_30 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num, num_5, num_4, num_3, num_2, num_1, temp;
		System.out.println("Please input the number: ");
		num = input.nextInt();
		num_5 = num/10000;
		temp = num%10000;
		num_4 = temp/1000;
		temp = temp%1000;
		num_3 = temp/100;
		temp = temp%100;
		num_2 = temp/10;
		num_1 = temp%10;
		System.out.printf("The number can be decomposed into\n%d  %d  %d  %d  %d\n", 
				num_5, num_4, num_3, num_2, num_1);
	}
}
