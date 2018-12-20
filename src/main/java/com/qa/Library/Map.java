package com.qa.Library;

public class Map extends Item {

	
	private String area;
	
	
	
	
	
	public Map(String name, int id,String area,boolean checkOut) {
		super(name, id,checkOut);
		this.setArea(area);
		// TODO Auto-generated constructor stub
	}




	
	
	
	
	
	
	
	
	
	
	
	

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	
	
	
	
	
	

}
