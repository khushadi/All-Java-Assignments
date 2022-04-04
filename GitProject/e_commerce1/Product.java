package com.e_commerce1;

public class Product {
	private int pId;
	private String pName;
	private double price;
	private int qty;
	private double totalPrice; 
	private double overAllPrice;
	private int custId;
	

	


	public Product() {}// no parameter constructor for javaBean rules
	
	 Product(String pname, int qty,double price, double totalPrice) {
   this.pName = pname;
   this.qty = qty;
   this.price = price;
   this.totalPrice = totalPrice;
 }
 

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;

	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double setTotalPrice(double totalPrice) {
		
		
		totalPrice = price * qty;
		
		return this.totalPrice = totalPrice;
	}
	
	public double getOverAllPrice() {
		return overAllPrice;
	}

	public double setOverAllPrice(double overAllPrice) {
		overAllPrice += totalPrice;
		return this.overAllPrice = overAllPrice;
	}
	
	public int getCustId() {
		return custId;
	}

	
	public void setCustId(int custId) {
		this.custId = custId;
	}
}
