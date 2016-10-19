package cn.edu.xupt.java.chapter2;
import java.util.Scanner;

public class Solution_28 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		float radius = 0;
		double radius_2, circum, area;
		System.out.println("Please input the radius: ");
		radius = input.nextFloat();
		radius_2 = 2*radius;
		System.out.printf("the r is : %.2f\n", radius_2);
		circum = 2 * Math.PI * radius;
		System.out.printf("the circumference is : %.2f\n", circum);
		area = Math.PI*Math.pow(radius, 2);
		System.out.printf("the area is : %.2f\n", area);
	}
}
