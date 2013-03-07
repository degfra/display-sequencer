package com.lab4tech.displaysequencer.service;

import java.util.ArrayList;

public class HtmlTagsResource {
	
	private ArrayList<String> htmlPartTags = null;
	private ArrayList<String> htmlTitleTags = null;
	private ArrayList<String> htmlListTags = null;
	private ArrayList<String> htmlImageTags = null;
	private ArrayList<String> htmlVideoTags = null;

	
	public HtmlTagsResource() {
		
	}

	public ArrayList<String> getHtmlPartTags() {
		htmlPartTags = new ArrayList<String>();
		htmlPartTags.add("<div>");
		htmlPartTags.add("<p>");		
		return htmlPartTags;
	}

	public void setHtmlPartTags(ArrayList<String> htmlPartTags) {
		this.htmlPartTags = htmlPartTags;
	}

	public ArrayList<String> getHtmlTitleTags() {
		htmlTitleTags.add("<h1>");
		htmlTitleTags.add("<h2>");
		htmlTitleTags.add("<h3>");
		htmlTitleTags.add("<h4>");
		htmlTitleTags.add("<h5>");
		htmlTitleTags.add("<h6>");
		return htmlTitleTags;
	}

	public ArrayList<String> getHtmlListTags() {
		htmlListTags.add("<li>");
		htmlListTags.add("<ul>");
		htmlListTags.add("<ol>");
		return htmlListTags;
	}

	public void setHtmlListTags(ArrayList<String> htmlListTags) {
		this.htmlListTags = htmlListTags;
	}

	public ArrayList<String> getHtmlImageTags() {
		htmlImageTags.add("<img>");
		return htmlImageTags;
	}

	public ArrayList<String> getHtmlVideoTags() {
		htmlVideoTags.add("<iframe>");
		htmlVideoTags.add("<embed>");
		return htmlVideoTags;
	}
	
	
	
	

}
