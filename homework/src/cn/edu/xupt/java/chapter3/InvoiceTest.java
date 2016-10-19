package cn.edu.xupt.java.chapter3;

public class InvoiceTest {
	public static void main(String[] args){
		Invoice invo = new Invoice();
		invo.setDept("disk");
		invo.setInstruction("1T");
		invo.setQuantity(3);
		invo.setPrice(300);
		System.out.println(invo.getInvoiceAmount());
		//add negative value test below by youself
	}
}
