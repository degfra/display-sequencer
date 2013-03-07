package com.lab4tech.displaysequencer.domain;

public class ClipSection {
	
	private String clipSectionName;
	private String clipSectionHTMLCode;
	
	
	public String getClipSectionName() {
		return clipSectionName;
	}

	public void setClipSectionName(String clipSectionName) {
		this.clipSectionName = clipSectionName;
	}

	public String getClipSectionHTMLCode() {
		return clipSectionHTMLCode;
	}

	public void setClipSectionHTMLCode(String clipSectionHTMLCode) {
		this.clipSectionHTMLCode = clipSectionHTMLCode;
	}

    /*
     * Constructors
     */
	public ClipSection(){
		
	}
	
	public ClipSection(String name, String HTMLCode){
		this.clipSectionName = name;
		this.clipSectionHTMLCode = HTMLCode;
	}

}
