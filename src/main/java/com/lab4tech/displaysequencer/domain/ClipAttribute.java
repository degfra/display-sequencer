package com.lab4tech.displaysequencer.domain;

public class ClipAttribute extends ClipSection {
	
	private String styleName = null;
	private String styleHtmlCode = null;

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getStyleHtmlCode() {
		return styleHtmlCode;
	}

	public void setStyleHtmlCode(String styleHtmlCode) {
		this.styleHtmlCode = styleHtmlCode;
	}
	
	

	public ClipAttribute() {
	
	}

	public ClipAttribute(String name, String HTMLCode) {
		super(name, HTMLCode);
		this.styleName = name;
		this.styleHtmlCode = HTMLCode;
	}

}
