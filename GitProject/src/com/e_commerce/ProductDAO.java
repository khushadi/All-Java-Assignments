package com.e_commerce;

import java.util.ArrayList;
import java.util.List;


 // Assignment 16:  (e-commerce application)
 
public class ProductDAO implements IProductDAO{
	
	Product pro[] = new Product[2];// all methods are returning to this Employee array

	
	List<Product> products=new ArrayList<Product>();
	int count=0;
	@Override
	public Product addProduct(Product pro) throws DAOException {
		products.add(pro);
		count++;
		return pro;
				
	}

		@Override
	public void displayCustomer() throws DAOException {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public List<Product> listProduct() throws DAOException {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product addCustomer(Product custInfo) throws DAOException {
		String custName = "Nick Toree";
		String custAddress = "9038 Queens Blvd";
		System.out.println("Customer name:"+custName);	
		System.out.println("Customer address: "+custAddress);
		return custInfo;
	}

	
}