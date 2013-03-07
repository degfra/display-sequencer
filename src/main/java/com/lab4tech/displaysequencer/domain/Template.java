package com.lab4tech.displaysequencer.domain;

import com.lab4tech.displaysequencer.service.DisplayDocService;
import com.lab4tech.displaysequencer.service.DisplayDocServiceImpl;
import com.lab4tech.displaysequencer.service.HtmlDisplayTagsArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class Template extends DisplayDoc {
	
	private ArrayList<BaseTemplate> availableBaseTemplatesList = new ArrayList<BaseTemplate>();
	private ArrayList<String> availableBaseTemplatesUrisList = new ArrayList<String>();
	private BaseTemplate baseTemplate = new BaseTemplate();
	private String baseTemplateUri = new String();
	private String backgroundColor = "CCCCCC";

	private String headerEditor = new String("Entête");
	private String mainEditor = new String("Zone principale");
	private String leftSidebarEditor = new String("Colonne de gauche");
	private String rightSidebarEditor = new String("Colonne de droite");
	private String footerEditor = new String("Pied de page");
	
	private String headerTagsAndAttributes = null;
	
	private HtmlDisplayTagsArrayList displayTags = null;
	
	public ArrayList<BaseTemplate> getAvailableBaseTemplatesList() {
		return availableBaseTemplatesList;
	}
	
	public void setAvailableBaseTemplatesList(
			ArrayList<BaseTemplate> availableBaseTemplatesList) {
		this.availableBaseTemplatesList = availableBaseTemplatesList;
	}
	
	public ArrayList<String> getAvailableBaseTemplatesUrisList() {
		return availableBaseTemplatesUrisList;
	}
	
	public void setAvailableBaseTemplatesUrisList(
			ArrayList<String> availableBaseTemplatesUrisList) {
		this.availableBaseTemplatesUrisList = availableBaseTemplatesUrisList;
	}
	
	public BaseTemplate getBaseTemplate() {
		return baseTemplate;
	}
	public void setBaseTemplate(BaseTemplate baseTemplate) {
		this.baseTemplate = baseTemplate;
	}
	public String getBaseTemplateUri() {
		return baseTemplateUri;
	}
	public void setBaseTemplateUri(String baseTemplateUri) {
		this.baseTemplateUri = baseTemplateUri;
	}
	
	public HtmlDisplayTagsArrayList getDisplayTags() {
		return displayTags;
	}
	
	public void setDisplayTags(HtmlDisplayTagsArrayList displayTags) {
		this.displayTags = displayTags;
	}
	
	public String getHeaderTagsAndAttributes() {
		return headerTagsAndAttributes;
	}

	public void setHeaderTagsAndAttributes(String headerTagsAndAttributes) {
		this.headerTagsAndAttributes = headerTagsAndAttributes;
	}

	public String getHeaderEditor() {
		return headerEditor;
	}

	public void setHeaderEditor(String headerEditor) {
		this.headerEditor = headerEditor;
	}

	public String getMainEditor() {
		return mainEditor;
	}

	public void setMainEditor(String mainEditor) {
		this.mainEditor = mainEditor;
	}

	public String getLeftSidebarEditor() {
		return leftSidebarEditor;
	}

	public void setLeftSidebarEditor(String leftSidebarEditor) {
		this.leftSidebarEditor = leftSidebarEditor;
	}

	public String getRightSidebarEditor() {
		return rightSidebarEditor;
	}

	public void setRightSidebarEditor(String rightSidebarEditor) {
		this.rightSidebarEditor = rightSidebarEditor;
	}

	public String getFooterEditor() {
		return footerEditor;
	}

	public void setFooterEditor(String footerEditor) {
		this.footerEditor = footerEditor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	

	/*
	 * Constructors
	 */
	public Template(){
		super();
	}
	
	public Template(String baseTemplateUri) {
		this.baseTemplateUri = baseTemplateUri;
	}
	
	public Template(ArrayList<String> availableBaseTemplatesUris ){
		this.availableBaseTemplatesUrisList = availableBaseTemplatesUris;
	}
	
	public Template(String baseTemplateUri, HtmlDisplayTagsArrayList displayTags){
		this.baseTemplateUri = baseTemplateUri;
		this.displayTags = displayTags;
	}
	
	

}
