package com.restaurant.pos;

import java.util.ArrayList;

public class OrderList {

	ArrayList<OrderItem> orderList = new ArrayList<>();
	
	public void addInOrderList(Item item,int qty)
	{
		OrderItem orderItem = new OrderItem(item,qty);
		
		orderList.add(orderItem);
	}
	public void displayOrder()
	{
		System.out.println("Order List");
		for(OrderItem orderItem : orderList)
		{
			System.out.print("  "+orderItem.getItem().getName()+"  ");
			System.out.print("  "+orderItem.getQty()+"  ");
			System.out.print("  "+orderItem.getPrice()+"  ");
			System.out.print("  "+orderItem.getItem().getCatagory()+"  ");
			System.out.println();
		}
	}
	public int calculateTotal()
	{
		int total=0;
		
		for(OrderItem orderItem: orderList)
		{
			total = total + orderItem.getPrice();
		}
		
		return total;
	}
	
	public double calculateGST(int price)
	{
		double gst = price * 0.12;
		
		return gst;
	}
	
	public void displayreceipt()
	{
		displayOrder();
		int total = calculateTotal();
		System.out.println();
		double gst = calculateGST(total);
		System.out.println("GST cost: " + gst);
		double totalBill = total + gst;
		System.out.println("Total Cost: "+ totalBill);
		
		
		
	}
	
}
