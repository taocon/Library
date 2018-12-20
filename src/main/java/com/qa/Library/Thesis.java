package com.qa.Library;

public class Thesis extends Item implements AuthorInterface {

	
	private int citationPages;
	
	
	
	public Thesis(String name, int id, int citationPages,boolean checkOut) {
		super(name, id,checkOut);
		this.setCitation(citationPages);
	}

	public void addWeight()
	{
		
	}

	
	
	
	
	
	
	
	
	
	
	
	public int getCitation() {
		return citationPages;
	}



	public void setCitation(int citation) {
		this.citationPages = citation;
	}
	
	
	
	
	

}
