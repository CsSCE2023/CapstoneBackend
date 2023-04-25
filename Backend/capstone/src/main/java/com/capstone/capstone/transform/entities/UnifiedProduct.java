package com.capstone.capstone.transform.entities;

/*
This class transforms scraped data into a unified format for indexing
*
* */
public class UnifiedProduct {

	String itemName;
	String itemDesc;
	String shopName;
	String address;
	float itemPrice;
	int itemQuantity;
	float itemWeight;



	//constructor
	public UnifiedProduct(String name, String desc, String shopName, String address,float price,int quantity,float weight)
	{
		itemName = name;
		itemDesc = desc;
		shopName = shopName;
		address = address;
		itemPrice = price;
		itemQuantity = quantity;
		itemWeight = weight;
	}
	

}
