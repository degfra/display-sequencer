package com.lab4tech.displaysequencer.service;

import com.lab4tech.displaysequencer.service.HtmlAttributesArrayList;

public class HtmlDisplayTagType {
	
	String tagName = new String();
	
	HtmlAttributesArrayList attributesList = null;

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public HtmlAttributesArrayList getAttributesList() {
		return attributesList;
	}

	public void setAttributesList(HtmlAttributesArrayList attributesList) {
		this.attributesList = attributesList;
	}
	
	public HtmlDisplayTagType(){
		
	}
	
	public HtmlDisplayTagType(String tagName, HtmlAttributesArrayList attributesList){
		this.tagName = tagName;
		this.attributesList = attributesList;
	}

}
