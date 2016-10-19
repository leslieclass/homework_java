package cn.edu.xupt.java.chapter4;
import java.util.Scanner;

public class Solution_30 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int temp_u, temp_d;
		System.out.println("Please input the integer number: ");
		int num = input.nextInt();
		if(num<10000||num>99999){
			System.out.println("This number is illegally, Please try again: ");
			num = input.nextInt();
		}else{
			if(num%10==num/10000){
				temp_u = num%10000;
				temp_d = num/10;
				if(temp_u/1000==temp_d%10){
					System.out.println("This number is huiwen");
				}
			}
		}
	}
}
