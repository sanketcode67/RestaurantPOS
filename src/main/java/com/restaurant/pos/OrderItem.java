package com.restaurant.pos;

public class OrderItem {

	private Item item;
	private int qty;


	private int price;
	
	public OrderItem(Item item,int qty)
	{
		this.item= item;
		this.qty = qty;

		this.price = item.getPrice() * qty;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
