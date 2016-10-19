package cn.edu.xupt.java.chapter4;
import java.util.Scanner;

public class Solution_37_decode {
	public static int get_input(int number){
		if(number>=7){
			return number-7;
		}else{
			return number+10-7;
		}
	}
	public static void main(String[] args){
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
		num_1 = Solution_37_decode.get_input(num_1);
		num_2 = Solution_37_decode.get_input(num_2);
		num_3 = Solution_37_decode.get_input(num_3);
		num_4 = Solution_37_decode.get_input(num_4);
		String result =  Integer.toString(num_3)+Integer.toString(num_4)+Integer.toString(num_1)+Integer.toString(num_2);
		System.out.println("input value is :"+result);
	}
}
