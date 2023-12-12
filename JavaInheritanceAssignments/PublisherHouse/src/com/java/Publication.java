package com.java;

abstract class Publication {
	int noOfPages;
	int price;
	String publisherName;
	
	public Publication(int noOfPages, int price, String publisherName) {
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public void showDetails() {
		System.out.println(this.noOfPages+ " "+ this.price+ " "+this.publisherName);
	}
	
}
