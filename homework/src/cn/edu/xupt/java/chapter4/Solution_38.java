package cn.edu.xupt.java.chapter4;

public class Solution_38 {
	public int factorial(int count){
		int result = 1;
		if(count<0){
			System.out.println("Please input an positive integer.");
			return -1;
		}else if(count==0){
			return 1;
		}else{
			for(int i=1;i<=count;i++){
				result*=i;
			}
			return result;
		}
	}
	
	public double caculate_e(int count){
		double result = 1;
		for(int i=1; i<=count; i++){
			result += 1.0/factorial(i);
		}
		return result;
	}
	
	public double caculate_e_x(int count, int val){
		double result = 1;
		for(int i=1; i<=count; i++){
			result += 1.0*Math.pow(val, i)/factorial(i);
		}
		return result;
	}
	
	public static void main(String[] args){
		// Test
		Solution_38 solu = new Solution_38();
		System.out.println(solu.factorial(5));
		System.out.println(solu.caculate_e(5));
		System.out.println(solu.caculate_e_x(10, 3));
	}
}
