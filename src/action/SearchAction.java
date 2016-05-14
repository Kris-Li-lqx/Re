package action;

import java.util.ArrayList;

import model.Product;
import service.SearchService;

public class SearchAction extends BaseAction {
	private static final long serialVersionUID = 8487878989869650070L;

	private String productID;
	private SearchService searchService;
	private Product currentProduct;
	private ArrayList<Product> relatedProducts;

	public String execute(){
		
		currentProduct = searchService.findProduct(productID);
		
		if (currentProduct == null) {
			return ERROR;
		}
		
		relatedProducts = searchService.getRelatedProducts(productID);
		
		if (relatedProducts.size() == 0) {
			return "norecommendation";
		} else {
			return SUCCESS;
		}
	}
	
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}


	public SearchService getSearchService() {
		return searchService;
	}


	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}


	public ArrayList<Product> getRelatedProducts() {
		return relatedProducts;
	}


	public void setRelatedProducts(ArrayList<Product> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}


	public Product getCurrentProduct() {
		return currentProduct;
	}


	public void setCurrentProduct(Product currentProduct) {
		this.currentProduct = currentProduct;
	}
	
}
