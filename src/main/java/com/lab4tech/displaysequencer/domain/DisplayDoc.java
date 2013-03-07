package com.lab4tech.displaysequencer.domain;

public class DisplayDoc {
	
	protected String docName = null;
	protected String suffix = null;
	protected String docUri = null;
	
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getDocUri() {
		return docUri;
	}
	public void setDocUri(String docUri) {
		this.docUri = docUri;
	}
	
	public DisplayDoc(){
		
	}
	
	public DisplayDoc (String docName) {
		this.docName = docName;
	}
}
