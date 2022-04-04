package com.e_commerce;
//Assignment 16:  (e-commerce application)  
import java.util.Scanner;


public class CompanySeller {

	public static void main(String[] args) {

		char option = '\0';
		double overAllPrice= 0;
		double totalPrice =0;

		System.out.println("E-Commerce Application");

		Product pro = new Product();

		//List<Product> product = new ArrayList<Product>();

		Scanner sc = new Scanner(System.in); 
		do {


			System.out.println("Enter product id: ");
			pro.setpId(sc.nextInt());

			System.out.println("Enter product Name: ");
			pro.setpName(sc.next());

			System.out.println("Enter quantity: ");
			pro.setQty(sc.nextInt()); 

			System.out.println("Enter price (per item): ");
			pro.setPrice(sc.nextDouble());


			totalPrice = pro.setTotalPrice(totalPrice);// invoke from setter/getter methods
			overAllPrice = pro.setOverAllPrice(overAllPrice);


			System.out.println("subtotal for first items = "+pro.getTotalPrice());

			System.out.print("Do you want to add more item? (y or n): ");
			option = sc.next().charAt(0);
			sc.nextLine();
		}
		while(option == 'y' || option == 'Y');


		System.out.println("\nYour invoice:\n" + "Item name: " +( pro.getpName()+","+
				"\tnumber of item: "+pro.getQty()+ "\tprice for this item: "+pro.getPrice()
				+"\tsubtotal price: "+pro.getTotalPrice()+"\tgrand total price: "+pro.getOverAllPrice()));
		
		
		//Customer detail..
		System.out.println("For Customer detail:");
				
		System.out.println("Enter Customer ID: ");
		pro.setCustId(sc.nextInt());
		System.out.println("Customer ID: "+pro.getCustId());
		ProductDAO cust = new ProductDAO();
		try {
			cust.addCustomer(pro);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		
		
		sc.close();
	}

}


