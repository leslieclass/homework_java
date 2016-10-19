package cn.edu.xupt.java.chapter3;

public class Employee {
	public String first_name;
	public String last_name;
	public double salary;
	
	public Employee(String fname, String lname, double _salary){
		first_name = fname;
		last_name = lname;
		salary = _salary;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		if(salary<0){
			this.salary = 0;
		}
	}
	
	public void increaseSalary(double rate){
		salary = salary*(1+rate);
	}
	
	public static void main(String args[]){
		Employee employ = new Employee("Bob", "Dylan", 30000);
		System.out.println("Total year salary is: "+ employ.getSalary()*12);
		employ.increaseSalary(0.3);
		System.out.println("Total year salary after increase 0.3 =="+ employ.getSalary()*12);
	}
}
