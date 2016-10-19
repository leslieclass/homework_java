package cn.edu.xupt.java.chpater5;
import java.util.Scanner;

public class Solution_16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int val[] = new int[5];
		for(int j=0; j<5; j++){
			val[j] = input.nextInt();
		}
		for(int i=0;i<val.length;i++){
			for(int j=0; j<val[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
