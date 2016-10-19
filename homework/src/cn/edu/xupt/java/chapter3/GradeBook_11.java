package cn.edu.xupt.java.chapter3;

public class GradeBook_11 {
	private String courseName;
	private String teacher_name;
	
	public GradeBook_11(String course, String name){
		courseName = course;
		teacher_name = name;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void displayMessage(){
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
		System.out.printf("This course is presented by: \n%s!\n", getTeacher_name());

	}
	
	public static void main(String args[]){
		GradeBook_11 grade = new GradeBook_11("java", "auroua");
		grade.displayMessage();
	}
}
