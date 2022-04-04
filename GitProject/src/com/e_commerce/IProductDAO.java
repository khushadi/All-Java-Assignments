
package com.e_commerce;

import java.util.List;

 // Assignment 16:  (e-commerce application)

public interface IProductDAO {

	Product addProduct(Product pro) throws DAOException;
	Product addCustomer(Product custInfo) throws DAOException;
	void displayCustomer() throws DAOException;
	List<Product> listProduct() throws DAOException;	
	//void displayFormat()throws DAOException;
	//void display()throws DAOException;
	//public double totalPrice(Product pro) throws DAOException;
	
	
}
