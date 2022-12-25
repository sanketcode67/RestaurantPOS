package com.restaurant.pos;

import java.util.ArrayList;

public class Menu {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public void addItem(int id,String name,int price,String catagory)
	{
		Item newItem = new Item(id, name, price, catagory);
		
		itemList.add(newItem);
		
	}
	
	public void displayMenu()
	{
		for(Item item : itemList)
		{
			System.out.print("  "+item.getId()+"  ");
			System.out.print("  "+item.getName()+"  ");
			System.out.print("  "+item.getPrice()+"  ");
			System.out.print("  "+item.getCatagory()+"  ");
			System.out.println();
		}
	}
	public Item findItem(int id)
	{
		 Item returnItem = null;
		for(Item item : itemList)
		{
			if(item.getId()==id)
			{
				returnItem = item;
			}
		}
		return returnItem;
		
	}
}
