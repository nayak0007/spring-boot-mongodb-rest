package com.chatassistant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
    private String id;
	private String name;
	private Object prices;
	private String reviews;
	private double rating;
	private String categories;
	private String primaryCategories;
	private String imageURLs;
	private String brand;
	private String manufacturerNumber;
	private String asins;
	private String dateAdded;
	private String dateUpdated;
	private String keys;
	private String numOfReviews;
	public String getNumOfReviews() {
		return numOfReviews;
	}
	public void setNumOfReviews(String numOfReviews) {
		this.numOfReviews = numOfReviews;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getPrices() {
		return prices;
	}
	public void setPrices(Object prices) {
		this.prices = prices;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getPrimaryCategories() {
		return primaryCategories;
	}
	public void setPrimaryCategories(String primaryCategories) {
		this.primaryCategories = primaryCategories;
	}
	public String getImageURLs() {
		return imageURLs;
	}
	public void setImageURLs(String imageURLs) {
		this.imageURLs = imageURLs;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufacturerNumber() {
		return manufacturerNumber;
	}
	public void setManufacturerNumber(String manufacturerNumber) {
		this.manufacturerNumber = manufacturerNumber;
	}
	public String getAsins() {
		return asins;
	}
	public void setAsins(String asins) {
		this.asins = asins;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	public String getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getKeys() {
		return keys;
	}
	public void setKeys(String keys) {
		this.keys = keys;
	}
	
}
