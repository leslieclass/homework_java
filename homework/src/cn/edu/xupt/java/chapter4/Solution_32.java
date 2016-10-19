package cn.edu.xupt.java.chapter4;

public class Solution_32 {
	public static void main(String[] args){
		for(int i=1; i<=8; i++){
			if(i%2==0){
				for(int j=1; j<=8; j++){
					System.out.print("* ");
				}
				System.out.println();				
			}else{
				System.out.print(" ");
				for(int j=1; j<=8; j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
