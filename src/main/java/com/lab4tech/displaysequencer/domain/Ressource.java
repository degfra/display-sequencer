package com.lab4tech.displaysequencer.domain;

import java.util.ArrayList;

public class Ressource {
	
	private String htmlTag = null;
	private ArrayList<String> attributeNamesList = null;
	
	public String getHtmlTag() {
		return htmlTag;
	}
	public void setHtmlTag(String htmlTag) {
		this.htmlTag = htmlTag;
	}
	public ArrayList<String> getAttributeNamesList() {
		return attributeNamesList;
	}
	public void setAttributeNamesList(ArrayList<String> attributeNamesList) {
		this.attributeNamesList = attributeNamesList;
	}

}
