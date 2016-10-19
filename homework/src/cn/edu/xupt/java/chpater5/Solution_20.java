package cn.edu.xupt.java.chpater5;

public class Solution_20 {
	public static void main(String[] args){
		double init = 4.0;
		double pi = 4;
		int loop_count = 1;
		String result;
		for(int i=3; i<100000; i=i+2){
			pi += Math.pow(-1.0, loop_count)*init/i;
			result = String.format("%.2f", pi);
			if(result.equals("3.14")){
				break;
			}
			loop_count++;
		}
		System.out.println(pi);
		System.out.println(loop_count+1); 
	}
}
