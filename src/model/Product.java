package model;

// Java Bean for product

public class Product{
	private String ID;
	private Double price;
	private String imUrl;
	private int salesRank;
	private Double s1;
	private Double s2;
	private Double s3;
	private Double s4;
	
	public Product(){
		
	}
	
	public Product(String Id, double price, String imUrl, int salesRank){
		this.ID = Id;
		this.price = price;
		this.imUrl = imUrl;
		this.salesRank = salesRank;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	public int getSalesRank() {
		return salesRank;
	}

	public void setSalesRank(int salesRank) {
		this.salesRank = salesRank;
	}

	public Double getS1() {
		return s1;
	}

	public void setS1(Double s1) {
		int temp = (int)( s1 * 10000);
		this.s1 = temp / 10000.0;
	}

	public Double getS2() {		
		return s2;
	}

	public void setS2(Double s2) {
		int temp = (int)( s2 * 10000);		
		this.s2 = temp / 10000.0;
	}

	public Double getS3() {
		return s3;
	}

	public void setS3(Double s3) {
		int temp = (int)( s3 * 10000);				
		this.s3 = temp / 10000.0;
	}

	public Double getS4() {
		return s4;
	}

	public void setS4(Double s4) {
		int temp = (int)( s4 * 10000);				
		this.s4 = temp / 10000.0;
	}
	
}
