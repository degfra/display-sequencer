package com.lab4tech.displaysequencer.domain;

import com.lab4tech.displaysequencer.service.DisplayDocService;
import com.lab4tech.displaysequencer.service.DisplayDocServiceImpl;
import com.lab4tech.displaysequencer.service.HtmlDisplayTagsArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;

public class Clip extends DisplayDoc {
	
	private ArrayList<Template> availableTemplatesList = null;
	private Template template = null;
	private String templateUri = null;
	private String nextClipUri = new String("/endClip");
//	private String nextClipUri = new String();
	
	private String clipName = null;
	private String clipUri = null;
	private int clipOrderNumber = 0;
	private int clipDurationInSeconds = 4;
//	private int clipDurationInSeconds = 0;
	private String isLoop = new String();
	
	private String headerHTMLCode = null;
	private String leftSidebarHTMLCode = null;
	private String rightSidebarHTMLCode = null;
	private String mainHTMLCode = null;
	private String footerHTMLCode = null;
	private String clipBackgroundColor = null;
	
	private ClipSection headerSection = new ClipSection("header", headerHTMLCode);
	private ClipSection leftsidebarSection = new ClipSection("leftsidebar", leftSidebarHTMLCode);
	private ClipSection rightsidebarSection = new ClipSection("rightsidebar", rightSidebarHTMLCode);
	private ClipSection mainSection = new ClipSection("main", mainHTMLCode);
	private ClipSection footerSection = new ClipSection("footer", footerHTMLCode);
	
	private ClipAttribute styleAttribute = new ClipAttribute("style", clipBackgroundColor );
	
	private ArrayList<ClipSection> clipSectionsList= new ArrayList<ClipSection>();
	
//	private HtmlDisplayTagsArrayList displayTags = null;
	
	public ArrayList<Template> getAvailableTemplatesList() {
		return availableTemplatesList;
	}
	public void setAvailablaTemplatesList(ArrayList<Template> availableTemplatesList) {
		this.availableTemplatesList = availableTemplatesList;
	}
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public String getTemplateUri() {
		return templateUri;
	}
	public void setTemplateUri(String templateUri) {
		this.templateUri = templateUri;
	}
	
	public ArrayList<ClipSection> getClipSectionsList() {
		return clipSectionsList;
	}
	public void setClipSectionsList(ArrayList<ClipSection> clipSectionsList) {
		this.clipSectionsList = clipSectionsList;
	}
	
	public String getClipUri() {
		return clipUri;
	}
	public void setClipUri(String clipUri) {
		this.clipUri = clipUri;
	}
	public int getClipOrderNumber() {
		return clipOrderNumber;
	}
	public void setClipOrderNumber(int clipOrderNumber) {
		this.clipOrderNumber = clipOrderNumber;
	}
	public int getClipDurationInSeconds() {
		return clipDurationInSeconds;
	}
	
	public void setClipDurationInSeconds(int clipDurationInSeconds) {
		this.clipDurationInSeconds = clipDurationInSeconds;
	}
	
	public String getIsLoop() {
		return isLoop;
	}
	public void setIsLoop(String isLoop) {
		this.isLoop = isLoop;
	}
	public String getHeaderHTMLCode() {
		return headerHTMLCode;
	}
	public void setHeaderHTMLCode(String headerHTMLCode) {
		this.headerHTMLCode = headerHTMLCode;
	}
	public String getMainHTMLCode() {
		return mainHTMLCode;
	}
	public void setMainHTMLCode(String mainHTMLCode) {
		this.mainHTMLCode = mainHTMLCode;
	}
	public String getLeftSidebarHTMLCode() {
		return leftSidebarHTMLCode;
	}
	public void setLeftSidebarHTMLCode(String leftSidebarHTMLCode) {
		this.leftSidebarHTMLCode = leftSidebarHTMLCode;
	}
	public String getRightSidebarHTMLCode() {
		return rightSidebarHTMLCode;
	}
	public void setRightSidebarHTMLCode(String rightSidebarHTMLCode) {
		this.rightSidebarHTMLCode = rightSidebarHTMLCode;
	}
	public String getFooterHTMLCode() {
		return footerHTMLCode;
	}
	public void setFooterHTMLCode(String footerHTMLCode) {
		this.footerHTMLCode = footerHTMLCode;
	}
	public String getClipName() {
		return clipName;
	}
	public void setClipName(String clipName) {
		this.clipName = clipName;
	}
	
	public String getClipBackgroundColor() {
		return clipBackgroundColor;
	}
	public void setClipBackgroundColor(String clipBackgroundColor) {
		this.clipBackgroundColor = clipBackgroundColor;
	}
	
	public ClipSection getHeaderSection() {
		return headerSection;
	}
	public void setHeaderSection(ClipSection headerSection) {
		this.headerSection = headerSection;
	}
	public ClipSection getLeftsidebarSection() {
		return leftsidebarSection;
	}
	public void setLeftsidebarSection(ClipSection leftsidebarSection) {
		this.leftsidebarSection = leftsidebarSection;
	}
	public ClipSection getRightsidebarSection() {
		return rightsidebarSection;
	}
	public void setRightsidebarSection(ClipSection rightsidebarSection) {
		this.rightsidebarSection = rightsidebarSection;
	}
	public ClipSection getMainSection() {
		return mainSection;
	}
	public void setMainSection(ClipSection mainSection) {
		this.mainSection = mainSection;
	}
	public ClipSection getFooterSection() {
		return footerSection;
	}
	public void setFooterSection(ClipSection footerSection) {
		this.footerSection = footerSection;
	}

	public ClipAttribute getStyleAttribute() {
		return styleAttribute;
	}
	public void setStyleAttribute(
			ClipAttribute styleAttribute) {
		this.styleAttribute = styleAttribute;
	}
	
	public String getNextClipUri() {
		return nextClipUri;
	}
	public void setNextClipUri(String nextClipUri) {
		this.nextClipUri = nextClipUri;
	}
	
	
	/*
	 * Constructor
	 */
	public Clip(){
		super();
	}
	
	public Clip(String clipName){
		this.clipName = clipName;
	}
	
	public Clip(String baseTemplateUri, String clipName){
		this.templateUri = templateUri;
		this.clipName = clipName;
	}
	
	public Clip(String clipName, int clipDurationInSeconds, String nextClipUri){
		this.clipName = clipName;
		this.clipDurationInSeconds = clipDurationInSeconds;
		this.nextClipUri = nextClipUri;
	}

}
