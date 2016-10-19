package cn.edu.xupt.java.chapter2;

public class Solution_31 {
	public static void main(String args[]){
		System.out.printf("%-10s%-10s%-10s\n", "number", "square", "cube");
		for(int i=0; i<=10; i++){
			System.out.printf("%-10d%-10d%-10d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
		}
	}
}
