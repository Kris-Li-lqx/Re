package service;

import java.util.ArrayList;

import model.Product;
import dao.ProductDao;

public class SearchService {
	
	private ProductDao productDao;

	public Product findProduct(String id) {
		return productDao.findProduct(id);
	}
	
	public ArrayList<Product> getRelatedProducts(String id){
		return productDao.getRelatedProducts(id);
	}
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	
}
