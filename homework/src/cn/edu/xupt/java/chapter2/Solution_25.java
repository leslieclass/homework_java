package cn.edu.xupt.java.chapter2;
import java.util.Scanner;

public class Solution_25 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int temp = 0;
		System.out.println("Please input an integer number: ");
		temp = input.nextInt();
		if(temp%2==0){
			System.out.println("This integer number is even.");
		}else{
			System.out.println("This integer number is odd.");
		}
	}
}
