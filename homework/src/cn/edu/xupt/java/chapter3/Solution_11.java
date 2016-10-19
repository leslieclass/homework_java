package cn.edu.xupt.java.chapter3;

public class Solution_11 {
	public static void main(String args[]){
		GradeBook_11 gradeBook1 = new GradeBook_11("CS101 Introduction to Java Programming", "teacher1");
		GradeBook_11 gradeBook2 = new GradeBook_11("CS102 Data Structures in Java", "teacher2");
		
		gradeBook1.displayMessage();
		System.out.println("");
		gradeBook2.displayMessage();
	}
}
