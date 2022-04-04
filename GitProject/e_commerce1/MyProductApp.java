package com.e_commerce1;

import java.util.List;

import com.project.DAOException;
//Assignment 20:  (e-commerce application)
public class MyProductApp {

	public static void main(String[] args) {

IProductDAO proDAO= new ProductDAO();
try {
	List<Product> prodList =proDAO.listProduct();
	for (Product product : prodList) {
		
		System.out.println("\nYour invoice:\n" + "Item number: "+product.getpId()+","+"\titem name: "+product.getpName()+","+"\tprice: "+product.getPrice()+","+"\tquantity: "+product.getQty()+","+"\ttotal price: "+product.getTotalPrice()+","+"\tcustomer ID: "+product.getCustId());
		System.out.println("");	
		
	
	}
	
	
} catch (DAOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
