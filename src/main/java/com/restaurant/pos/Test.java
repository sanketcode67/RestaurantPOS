package com.restaurant.pos;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Menu myMenu = new Menu();
		
		myMenu.addItem(001, "Veg Sandwitch", 70, "Veg");
		myMenu.addItem(002, "Masala Dosa", 75, "Veg");
		myMenu.addItem(003, "Idly", 35, "Veg");
		myMenu.addItem(004, "Bonda", 25, "Veg");
		myMenu.addItem(005, "Paneer Butter Masala", 150, "Veg");
		
		myMenu.displayMenu();
		
		System.out.println();
		Scanner scn = new Scanner(System.in);
		OrderList myOrder = new OrderList();
		
		
		while(true)
		{
			System.out.println("Enter id of the item you want?");
			int id = scn.nextInt();
			System.out.println("Item Quantity:");
			int qty = scn.nextInt();
			
			System.out.println();
			System.out.println();
			Item item = myMenu.findItem(id);
			myOrder.addInOrderList(item,qty);
			
			System.out.println("Do u want continue....Y or N");
				char ch=scn.next().charAt(0);
				if(ch == 'N')
					break;
					
		}
		
		System.out.println("Sir,Do u want 1.Take Away 2.Dining");
		int orderMode = scn.nextInt();
		
		if(orderMode == 1)
		{
			Item item = new Item(100, "Parcel Charge",10, "");
			myOrder.addInOrderList(item,1);
			
		}
		
		
		
		
		System.out.println();
		System.out.println();
		
		myOrder.displayreceipt();
		
      
	}
}
