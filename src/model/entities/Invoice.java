package model.entities;

import model.exceptions.InvalidQuantityException;
import model.exceptions.InvalidPriceException;

public class Invoice {
	private String number;
	private String description;
	private int itemQuantity;
	private double itemPrice;
	
	public Invoice(String number, String description, int itemQuantity, double itemPrice) {
		if (itemQuantity <= 0) {
			throw new InvalidQuantityException("The item quantity must be greater than zero!");
		}
		
		if (itemPrice <= 0.0) {
			throw new InvalidPriceException("The item price must be greater than zero!");
		}
		
		this.number = number;
		this.description = description;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		if (itemQuantity <= 0) {
			throw new InvalidQuantityException("The item quantity must be greater than zero!");
		}
		
		this.itemQuantity = itemQuantity;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		if (itemPrice <= 0.0) {
			throw new InvalidPriceException("The item price must be greater than zero!");
		}
		
		this.itemPrice = itemPrice;
	}
	
	public double getInvoiceAmount() {
		return itemQuantity * itemPrice;
	}
}
