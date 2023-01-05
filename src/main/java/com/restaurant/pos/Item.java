package com.restaurant.pos;

public class Item {
	
	 //data members
	 	private int id;
	    private String name;


	    private int price;
	    private String catagory;



	    public Item( int id,String name,int price,String catagory)
	    {

	        this.id = id;
	        this.name = name;

	        this.price = price;
	        this.catagory= catagory;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getCatagory() {
			return catagory;
		}

		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
	    
	    
}
