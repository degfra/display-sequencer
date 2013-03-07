package com.lab4tech.displaysequencer.service;

public class HtmlAttribute {
	
	private String label = null;
	
	private String name = null;
	private String value = null;
	
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
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public HtmlAttribute(){
		
	}
	
	public HtmlAttribute(String label, String name, String value){
		this.label = label;
		this.name = name;
		this.value = value;
		
	}
	
	public String toString(){
		
		String attributeCode = this.name + "=\"" + this.value +  "\"" ;
		
		return attributeCode;
		
	}

}