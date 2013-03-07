package com.lab4tech.displaysequencer.service;

import java.util.ArrayList;

public class HtmlTagAttributesArrayList extends ArrayList<HtmlAttributesArrayList> {
	
	private String label = null;
	private String name = null;
	
	public HtmlTagAttributesArrayList() {
		
	}
	
	public HtmlTagAttributesArrayList(String label, String name){		
		this.label = label;
		this.name = name;		
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
