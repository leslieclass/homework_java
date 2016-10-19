package cn.edu.xupt.java.chapter3;

public class Invoice {
	private String dept;
	private String instruction;
	private int quantity;
	private double price;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getInvoiceAmount(){
		double total_price = getQuantity()*getPrice();
		if(total_price<0||getQuantity()<0){
			total_price = 0.0;
		}
		return total_price;
	}
}
