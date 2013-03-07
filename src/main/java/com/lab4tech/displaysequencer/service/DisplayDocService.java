package com.lab4tech.displaysequencer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.lab4tech.displaysequencer.domain.Clip;
import com.lab4tech.displaysequencer.domain.ClipSection;
import com.lab4tech.displaysequencer.domain.DisplayDoc;

public interface DisplayDocService {
	
	public ArrayList<DisplayDoc> getAvailableComponentsList();
	public ArrayList<String> getComponentsUrisList();
	public String createDocUri(String docName, String docType);
	public void setClipTemplateUri(DisplayDoc displayDoc, String templateUri);
	public void setNewClip(Clip newClip);
	
	public void updateClipSection(String clipSectionName, String clipSectionEditCode);
	public void updateClipStyleAttribute(String clipAttributeName, String clipAttributeEditCode);
	public void updateClipSectionsList();
	public Clip getNewClip();
	public HtmlParserService getDisplayDocParserService();
	public void parseClipSectionsHTMLCode(ArrayList<ClipSection> clipSectionsList);
	public void parseClipAttributeHTMLCode(String attributeName, String attributeHTMLCode);
	public void parseBaseClip(String displayDocUri);
	
	public void saveClipFile(String clipName, String clipHtmlOutput);
	
	public ArrayList<String> getClipsNamesList();

}
