package com.krush.sorting.blc;

public class Product implements Comparable<Product> 
{
	    private Integer productNumber;
	    private String productName;
	    private Double productPrice;
	    
	       
	    
	    

	public Product(Integer productNumber, String productName, Double productPrice) {
			super();
			this.productNumber = productNumber;
			this.productName = productName;
			this.productPrice = productPrice;
		}





	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}





	@Override
	public int compareTo(Product p2) {
		   
		return this.productName.compareTo(p2.productName);//lexicoGhrafical Compare
		
	}
        

		
}
