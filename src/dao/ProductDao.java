package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;


public class ProductDao {
	
	String[] pics = {"http://ecx.images-amazon.com/images/I/41ChBvGQcmL._SX300_.jpg",
					 "http://ecx.images-amazon.com/images/I/3163xXyncJL._SX300_.jpg",
					 "http://ecx.images-amazon.com/images/I/41n1MUaOzfL._SY300_.jpg",
					 "http://ecx.images-amazon.com/images/I/41SJYCTdlqL._SX300_.jpg"};
	
	public Product findProduct(String id) {
//		Product fakeProduct = new Product("B000A2BGLU", 47.99, "http://ecx.images-amazon.com/images/I/51W2g6g5eyL._SL500_.jpg", 22030 );
//		return fakeProduct;
//		
//		
		java.sql.Connection connection = DAOHelper.getBaseDaoInstance().getConnection();
		Statement stmt=null;
		ResultSet result=null;
		
		Product res = null;
		try {
			stmt = connection.createStatement();
			result = stmt.executeQuery("select * from product where id = '" + id +"'");
			while (result.next()){
				Product temp = new Product();
				temp.setID(result.getString(1));
				temp.setPrice(result.getDouble(2));
				temp.setSalesRank(result.getInt(3));
				temp.setImUrl(result.getString(4));
				res = temp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DAOHelper.getBaseDaoInstance().closeConnection(connection);
			DAOHelper.getBaseDaoInstance().closeResult(result);
			DAOHelper.getBaseDaoInstance().closeStatement(stmt);
		}
		
		return res;
	}
	
	
	public ArrayList<Product> getRelatedProducts(String id){
		ArrayList<Product> productList = new ArrayList<Product>();
		
		java.sql.Connection connection = DAOHelper.getBaseDaoInstance().getConnection();
		Statement stmt=null;
		ResultSet result=null;
		
		try {
			stmt = connection.createStatement();
			String qqq = " select * from product as p, (select * from similarity where asin1 = '" + id +"') as s"
					+ " where p.id = s.asin2 order by s.s2 desc";
			
			result = stmt.executeQuery(qqq);
			while (result.next()){
				Product temp = new Product();
				temp.setID(result.getString("id"));
				temp.setPrice(result.getDouble("price"));
				temp.setSalesRank(result.getInt("salesRank"));
				temp.setImUrl(result.getString("imUrl"));
				temp.setS1(result.getDouble("s1"));
				temp.setS2(result.getDouble("s2"));
				temp.setS3(result.getDouble("s3"));
				temp.setS4(result.getDouble("s4"));				
				productList.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DAOHelper.getBaseDaoInstance().closeConnection(connection);
			DAOHelper.getBaseDaoInstance().closeResult(result);
			DAOHelper.getBaseDaoInstance().closeStatement(stmt);
		}		
		
//		for (int i = 0; i < 4; i++) {
//			Product fakeProduct = new Product("0439813182", i + 1.23, pics[i], 2000 );
//			productList.add(fakeProduct);
//		}
		
		return productList;
	}
	
	
	
//	private ArrayList<Product> productList;


//	public ArrayList<Product> getProducts() {
//		
//		if(productList==null){	
//			productList = new ArrayList<Product>();
//			java.sql.Connection connection = DAOHelper.getBaseDaoInstance().getConnection();
//			Statement stmt=null;
//			ResultSet result=null;
//			
//			try {
//				stmt = connection.createStatement();
//				result = stmt.executeQuery("select * from products");
//				while (result.next()){
//					Product temp = new Product();
//					temp.setProduct_id(result.getInt(1));
//					temp.setName(result.getString(2));
//					temp.setUpper_cat(result.getString(3));
//					temp.setMiddle_cat(result.getString(4));
//					temp.setLower_cat(result.getString(5));
//					temp.setPrice(result.getDouble(6));
//					Statement statement1 = connection.createStatement();
//					ResultSet totalresult = statement1.executeQuery("select sum(total) as sum from saleItem where product_id='"+temp.getProduct_id()+"'");
//					if(totalresult.next()){
//						temp.setTotal(totalresult.getDouble("sum"));
//					}
//					Statement statement2 = connection.createStatement();
//					ResultSet amountResult = statement2.executeQuery("select sum(amount) as sum from saleItem where product_id='"+temp.getProduct_id()+"'");
//					if(amountResult.next()){
//						int sum = amountResult.getInt("sum");
//						temp.setAmount(sum);
//					}
//					DAOHelper.getBaseDaoInstance().closeStatement(statement1);
//					DAOHelper.getBaseDaoInstance().closeStatement(statement2);
//					productList.add(temp);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				DAOHelper.getBaseDaoInstance().closeConnection(connection);
//				DAOHelper.getBaseDaoInstance().closeResult(result);
//				DAOHelper.getBaseDaoInstance().closeStatement(stmt);
//			}
//			
//			return productList;
//		}else{
//			return productList;
//		}
//		
//	
//	}


}
