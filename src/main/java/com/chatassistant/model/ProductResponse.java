package com.chatassistant.model;

import java.util.List;

public class ProductResponse {
	
	private List<Product> products;
	private long totalCount;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long l) {
		this.totalCount = l;
	}

}
