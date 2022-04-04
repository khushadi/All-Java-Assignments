
package com.e_commerce1;

import java.util.List;
import java.util.Map;

import com.project.DAOException;

public interface IProductDAO {

	Product addProduct(Product pro) throws DAOException;
	Product addCustomer(Product custInfo) throws DAOException;
	void displayCustomer() throws DAOException;
	
	List<Product> listProduct() throws DAOException;	
	Map<String,Object> addProductWithMap(String pName,List<Product> products) throws DAOException;


	
	
}
