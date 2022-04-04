package com.e_commerce1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.project.DAOException;

 // Assignment 12:  (e-commerce application)

public class ProductDAO implements IProductDAO{

	//Product pro[] = new Product[2];// all methods are returning to this Employee array




	//int count=0;
	@Override
	public Product addProduct(Product pro) throws DAOException {
		//products.add(pro);
		//count++;
		return pro;

	}
	@Override
	public Map<String, Object> addProductWithMap(String custId, List<Product> products) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> listProduct() throws DAOException {
		// Here i'm putting all data to my collection object and 
		//transferring data DAO model to another model	
		List<Product> prodList=new ArrayList<Product>();
		Connection connection=DBUtil.getDBConnection();
		try {
			Statement statement = connection.createStatement();// step 3
			// step 4 is executeQuery method below 
			ResultSet resultSet= statement.executeQuery("select p_Id, p_Name, price, qty, totalPrice, custID from Product");
			while(resultSet.next()) {
				Product pro = new Product();
				pro.setpId(resultSet.getInt("p_Id"));
				pro.setpName(resultSet.getString("p_Name"));
				pro.setPrice(resultSet.getFloat("price"));
				pro.setQty(resultSet.getInt("qty"));
				pro.setTotalPrice(resultSet.getFloat("totalPrice"));
				pro.setCustId(resultSet.getInt("custId"));
				prodList.add(pro);
			}
			connection.close();// step 5
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

		return prodList;
	}



	@Override
	public void displayCustomer() throws DAOException {
		// TODO Auto-generated method stub

	}


	@Override
	public Product addCustomer(Product custInfo) throws DAOException {

		return custInfo;
	}


}