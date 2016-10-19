package cn.edu.xupt.java.chapter4;
import java.util.Scanner;

public class Solution_35 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input three non-negative number: ");
		int num1=0, num2=0, num3=0;
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if(num1<0||num2<0||num3<0){
			System.out.println("illegally input, you have one more chance to input: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
		}
		if((num1+num2>num3)&&(Math.abs(num1-num2)<num3)){
			System.out.println("correct");
		}
	}
}
