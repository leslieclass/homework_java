package cn.edu.xupt.java.chapter2;
import java.util.Scanner;

public class Solution_24 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int input_num, max_num = 0, min_num=0;
		// input the first number
		System.out.print("Please input an integer number: ");
		input_num = input.nextInt();
		if(max_num<input_num){
			max_num = input_num;
		}
		if(min_num>input_num){
			min_num = input_num;
		}
		// input the second number
		System.out.print("Please input an integer number: ");
		input_num = input.nextInt();
		if(max_num<input_num){
			max_num = input_num;
		}
		if(min_num>input_num){
			min_num = input_num;
		}
		// input the third number
		System.out.print("Please input an integer number: ");
		input_num = input.nextInt();
		if(max_num<input_num){
			max_num = input_num;
		}
		if(min_num>input_num){
			min_num = input_num;
		}
		// input the fouth number
		System.out.print("Please input an integer number: ");
		input_num = input.nextInt();
		if(max_num<input_num){
			max_num = input_num;
		}
		if(min_num>input_num){
			min_num = input_num;
		}
		// input the fifth number
		System.out.print("Please input an integer number: ");
		input_num = input.nextInt();
		if(max_num<input_num){
			max_num = input_num;
		}
		if(min_num>input_num){
			min_num = input_num;
		}
		System.out.printf("the maximum integer number is %d, and minimum integer is %d", max_num, min_num);
	}
}
