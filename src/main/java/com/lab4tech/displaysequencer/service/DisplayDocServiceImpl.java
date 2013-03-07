package com.lab4tech.displaysequencer.service;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.lab4tech.displaysequencer.domain.BaseTemplate;
import com.lab4tech.displaysequencer.domain.Clip;
import com.lab4tech.displaysequencer.domain.ClipSection;
import com.lab4tech.displaysequencer.domain.DisplayDoc;
import com.lab4tech.displaysequencer.domain.Ressource;
import com.lab4tech.displaysequencer.domain.Template;
import com.lab4tech.displaysequencer.service.HtmlParserService;



/*
 * SERVICE CLASS : Parsing and/or Generating HTML/JSP code
 * and facilitating the construction of the HTML/JSP documents
 * required by the application
 */
public class DisplayDocServiceImpl implements DisplayDocService { 
	
	private HtmlParserService displayDocParserService = new HtmlParserService();
	private Clip newClip = new Clip();
	
	private static final String JSP = ".jsp";
	private static final String HTML = ".html";
	private static final String CSS = ".css";
	private static final String JS = ".js";
	private static final String PDF = ".pdf";
	
	private ArrayList<DisplayDoc> componentsList;
	private ArrayList<String> componentsUrisList;
	private ArrayList<String> clipsNamesList;

	/*
	 * Getters & Setters
	 */
	public HtmlParserService getDisplayDocParserService() {
		return displayDocParserService;
	}

	public void setDisplayDocParserService(HtmlParserService clipParserService) {
		this.displayDocParserService = clipParserService;
	}
	
	public Clip getNewClip() {
		return newClip;
	}

	public void setNewClip(Clip newClip) {
		this.newClip = newClip;
	}

	public ArrayList<DisplayDoc> getComponentsList() {
		return componentsList;
	}

	public void setComponentsList(ArrayList<DisplayDoc> componentsList) {
		this.componentsList = componentsList;
	}

	public void setComponentsUrisList(ArrayList<String> componentsUrisList) {
		this.componentsUrisList = componentsUrisList;
	}
	
	public void setClipsNamesList(ArrayList<String> clipsNamesList) {
		this.clipsNamesList = clipsNamesList;
	}
	

	/*
	 * Constructor w/o arguments
	 */
	public DisplayDocServiceImpl(){
		
	}
	
	 @Autowired
	 public DisplayDocServiceImpl(HtmlParserService displayDocParserService,  Clip newClip){
		 this.displayDocParserService = displayDocParserService;
		 this.newClip = newClip;
		}
	
	@Override
	public ArrayList<DisplayDoc> getAvailableComponentsList(){
		
		componentsList = new ArrayList<DisplayDoc>();
		// TODO DisplayDocDAO
		/*
		ResultSet searchresult = DisplayDocDAO.searchAvailableTemplates();
		while (searchResult.hasNext()){
		componentsList.add(searchresult.get(i))
		*/
		componentsList.add(new BaseTemplate("baseFull_1920_template"));
		componentsList.add(new BaseTemplate("baseLeftsidebar_1920_template"));
		componentsList.add(new BaseTemplate("baseRightsidebar_1920_template"));
		componentsList.add(new BaseTemplate("baseSidebars_1920_template"));
		
		return componentsList;
		
	}
	
	public String createDocUri(String docName, String docType){
		StringBuilder uri = new StringBuilder();
		uri.append(docName);
		
		if(docType == JSP){		
			uri.append(JSP);
		}
		if(docType.equals(HTML)){
			uri.append(HTML);
		}
		if(docType.equals(CSS)){
			uri.append(CSS);
		}
		if(docType.equals(JS)){
			uri.append(JS);
		}
		if(docType.equals(PDF)){
			uri.append(PDF);
		}
		
		String uriText = uri.toString();
		return uriText;
	}
	
	
	public ArrayList<String> getComponentsUrisList(){
		componentsUrisList = new ArrayList<String>();
		
		ArrayList<DisplayDoc> availableComponentsList = this.getAvailableComponentsList();
		int componentsCount = availableComponentsList.size();
		
		for(int i = 0 ; i < componentsCount ; i++){
			DisplayDoc component =  availableComponentsList.get(i);
			String docName = component.getDocName();
			String docType = JSP;
			String componentUri = this.createDocUri(docName, docType);
			component.setDocUri(componentUri);
			
			System.out.println(component.getDocUri());
			
			componentsUrisList.add(componentUri);
		}
		
		return componentsUrisList;
	}
	
	public void setClipTemplateUri(DisplayDoc newClip, String templateUri){
		newClip.setDocUri(templateUri);		
	}
	
	
	/*
	 * Generates specific timer countDown() script for each screen type (iframeIndex)
	 */
	public String getTimerCallHtml(String iframeIndex){
		
		StringBuilder timerScriptCall = new StringBuilder();
		
		timerScriptCall.append("<span id='timer");
		timerScriptCall.append(iframeIndex);
		timerScriptCall.append("'>");
		timerScriptCall.append("</span>");
		timerScriptCall.append("<script>");
		timerScriptCall.append("var count");
		timerScriptCall.append(iframeIndex);
		timerScriptCall.append("= document.clipForm.clipDuration.value;");
		timerScriptCall.append("countDown");
		timerScriptCall.append(iframeIndex);
		timerScriptCall.append("();");				
		timerScriptCall.append("</script>");

		String timerScriptCallHtml = null;
		timerScriptCallHtml = timerScriptCall.toString();
		
		return timerScriptCallHtml;
	}

	
	@Override
	public void updateClipSection(String clipSectionName, String clipSectionEditCode) {
			if (clipSectionName.equals("header")){
				getNewClip().getHeaderSection().setClipSectionHTMLCode(clipSectionEditCode);
			}else if (clipSectionName.equals("leftsidebar")){
				getNewClip().getLeftsidebarSection().setClipSectionHTMLCode(clipSectionEditCode);
			}else if (clipSectionName.equals("rightsidebar")){
				getNewClip().getRightsidebarSection().setClipSectionHTMLCode(clipSectionEditCode);
			}else if (clipSectionName.equals("main")){
				getNewClip().getMainSection().setClipSectionHTMLCode(clipSectionEditCode);
			}else if (clipSectionName.equals("footer")){
				getNewClip().getFooterSection().setClipSectionHTMLCode(clipSectionEditCode);
			}

	}
	
	@Override
	public void updateClipStyleAttribute(String clipAttributeName, String clipAttributeEditCode) {
			if (clipAttributeName.equals("style")){
				getNewClip().getStyleAttribute().setStyleHtmlCode(clipAttributeEditCode);
				displayDocParserService.setAttributeHTMLCode(clipAttributeEditCode);
			}
	}

	@Override
	public void parseClipSectionsHTMLCode(ArrayList<ClipSection> clipSectionsList) {
		ArrayList<ClipSection> sectionsList = newClip.getClipSectionsList();
		int sectionsCount = sectionsList.size();
		
		for (int i = 0 ; i < sectionsCount ; i++) {
			
			String sectionName = sectionsList.get(i).getClipSectionName();
			String sectionHtmlCode = sectionsList.get(i).getClipSectionHTMLCode();
			displayDocParserService.parseSectionsHTMLCode(sectionName, sectionHtmlCode);
		}

	}
	
	@Override
	public void parseClipAttributeHTMLCode(String attributeName, String attributeHTMLCode) {
		
		displayDocParserService.parseAttributeHTMLCode(attributeName, attributeHTMLCode);
		
	}
	
	@Override
	public void parseBaseClip(String displayDocUri) {
		
		displayDocParserService.parseDisplayDocHtml(displayDocUri);
		
	}
	
	public void updateClipSectionsList(){
		
		ArrayList<ClipSection> clipSectionsList = new ArrayList<ClipSection>();
		
		clipSectionsList.add(newClip.getHeaderSection());
		clipSectionsList.add(newClip.getLeftsidebarSection());
		clipSectionsList.add(newClip.getRightsidebarSection());
		clipSectionsList.add(newClip.getMainSection());
		clipSectionsList.add(newClip.getFooterSection());
		
		newClip.setClipSectionsList(clipSectionsList);
		
	}
	
	/*
	 * Generates the Clip's HTML code via the clipParserService
	 * Names end saves the Clip as a file.jsp in at the webapp root
	 */
	public void saveClipFile(String clipName, String clipHtmlOutput){
		
//		String filePath = HtmlParserService.getWEBAPP_Clips_PATH();
		String filePath = displayDocParserService.getWebappClipsPath();
		String clipDocUri = createDocUri(clipName, JSP);
		Path newClipPath = Paths.get(filePath + clipDocUri);
		
		System.out.println(clipDocUri);
		
		Charset ISO88591Charset = Charset.forName("ISO-8859-1");
		
		try(BufferedWriter bufferedWriter =
				Files.newBufferedWriter(newClipPath, ISO88591Charset, StandardOpenOption.CREATE);
			PrintWriter printWriter =
					new PrintWriter(bufferedWriter)){
			printWriter.println(clipHtmlOutput);						
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
		// TODO Call ClipDAO instance to save Clip in DB
		
	}
	
	/*
	 * Lists all available Clips Names
	 */
	@Override
	public ArrayList<String> getClipsNamesList(){
		
		ArrayList<String> clipsNamesList = new ArrayList<String>();
		
		clipsNamesList.add("_Clip_1");
		clipsNamesList.add("_Clip_2");
		clipsNamesList.add("_Clip_3");
		clipsNamesList.add("_Clip_4");

		return  clipsNamesList;
	}
	
}
