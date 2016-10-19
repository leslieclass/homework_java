package cn.edu.xupt.java.chpater5;

public class Solution_23 {
	public static void main(String[] args){
		int x=3, y=5;
		boolean condition1 = !(x<5)&&!(y>=7);
		boolean condition2 = !((x<5)||(y>=7));
		System.out.println(condition1==condition2);
		
		condition1 = !(x==y)||!(y!=5);
		condition2 = !((x==y)&&(y!=5));
		System.out.println(condition1==condition2);
		
		condition1 = !((x<=8)&&(y>4));
		condition2 = !(x<=8)||!(y>4);
		System.out.println(condition1==condition2);
		
		condition1 = !((x>4)||(y<=6));
		condition2 = !(x>4)&&!(y<=6);
		System.out.println(condition1==condition2);
	}
}
