package com.lab4tech.displaysequencer.web;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.SessionScope;

import com.lab4tech.displaysequencer.domain.BaseTemplate;
import com.lab4tech.displaysequencer.domain.Clip;
import com.lab4tech.displaysequencer.domain.ClipSection;
import com.lab4tech.displaysequencer.domain.DisplayDoc;
import com.lab4tech.displaysequencer.domain.Template;
import com.lab4tech.displaysequencer.service.DisplayDocService;
import com.lab4tech.displaysequencer.service.HtmlDisplayTagsArrayList;

@Controller
//@RequestMapping("/editor")
@SessionAttributes({"template", "clip"})
public class TemplateEditorController {
	
	private static final Logger logger = LoggerFactory.getLogger(TemplateEditorController.class);
	private int baseTemplateChosen;
	private String baseTemplateLogicalName;
	private String baseClipLogicalName;
	private String baseTemplateUri;
	private int count = 0;
	
	private String headerEditCode = null;
	private String mainEditCode = null;
	private String leftSidebarEditCode = null;
	private String rightSidebarEditCode = null;
	private String footerEditCode = null;
	private String backgroundColor = null;
	private String clipBackgroundColor = null;
	private String clipName = null;
	private String clipDurationInSeconds = null;
	private String clipOrderNumber = null;
	
	
	private DisplayDocService displayDocService;

	@Autowired
	public TemplateEditorController(DisplayDocService displayDocService) {
		this.displayDocService = displayDocService;
	}
	
	@RequestMapping(value="/editor", method=RequestMethod.GET)
	public String setupBaseTemplateChoiceForm(Model model){
		
		ArrayList<String> availableBaseTemplatesUrisList = displayDocService.getComponentsUrisList();		
		model.addAttribute("baseTemplateUris", availableBaseTemplatesUrisList);	

		model.addAttribute("template", new Template());
		
		baseTemplateChosen = 0;
		
		model.addAttribute("baseTemplateChosen", baseTemplateChosen);
		return "editor";
		
	}
	
	@RequestMapping(value="/editor", method=RequestMethod.POST)
	public String submitBaseTemplateChoiceForm(@ModelAttribute("template") Template template,  
			BindingResult result, Model model){
		
		this.baseTemplateUri = (String) result.getFieldValue("baseTemplateUri");
		
		if (!baseTemplateUri.equals("")){
			baseTemplateChosen = 1;
		}else{
			baseTemplateChosen = 2;
		}
		
		model.addAttribute("baseTemplateChosen", baseTemplateChosen);
		model.addAttribute("baseTemplateUri", baseTemplateUri);	
		
		int suffixIndex = baseTemplateUri.indexOf('.');
		this.baseTemplateLogicalName = baseTemplateUri.substring(0, suffixIndex);
		
		return baseTemplateLogicalName;
	}
	
	@RequestMapping(value="/templateEditing", method=RequestMethod.POST)
	public String submitTemplateEditCode(@ModelAttribute("template") Template template,  
			BindingResult result, Model model){
		
		headerEditCode = (String) result.getFieldValue("headerEditor");	
		mainEditCode = (String) result.getFieldValue("mainEditor");
		leftSidebarEditCode = (String) result.getFieldValue("leftSidebarEditor");
		rightSidebarEditCode = (String) result.getFieldValue("rightSidebarEditor");
		footerEditCode = (String) result.getFieldValue("footerEditor");
		
		backgroundColor = (String) result.getFieldValue("backgroundColor");
		clipBackgroundColor = "background-color: #" + backgroundColor;
		
		displayDocService.updateClipSection("header", headerEditCode);
		displayDocService.updateClipSection("main", mainEditCode);
		displayDocService.updateClipSection("leftsidebar", leftSidebarEditCode);
		displayDocService.updateClipSection("rightsidebar", rightSidebarEditCode);
		displayDocService.updateClipSection("footer", footerEditCode);
		
		displayDocService.updateClipStyleAttribute("background-color:", clipBackgroundColor);
		
			count = count +1 ;
			System.out.println(count + ".- Template Header Edit Code : " + headerEditCode);
			System.out.println(count + ".- Template Main Edit Code : " + mainEditCode);
			System.out.println(count + ".- Template LeftSidebar Edit Code : " + leftSidebarEditCode);
			System.out.println(count + ".- Template rightSidebar Edit Code : " + rightSidebarEditCode);
			System.out.println(count + ".- Template Footer Edit Code : " + footerEditCode);
			
			System.out.println(count + ".- Background Color : " + backgroundColor);
		
		return baseTemplateLogicalName;
	}
	
	@RequestMapping(value="/clipEditPreview", method=RequestMethod.GET)
	public String setupPreviewClip(Model model){
		
		Clip newClip = displayDocService.getNewClip();
		model.addAttribute("clip", newClip);
		
		model.addAttribute("headerHTMLCode", headerEditCode);
		model.addAttribute("mainHTMLCode", mainEditCode);
		model.addAttribute("leftSidebarHTMLCode", leftSidebarEditCode);
		model.addAttribute("rightSidebarHTMLCode", rightSidebarEditCode);
		model.addAttribute("footerHTMLCode", footerEditCode);
		
		displayDocService.updateClipSectionsList();
		
		model.addAttribute("clipBackgroundColor", clipBackgroundColor);
		
			System.out.println(count + ".- Clip Background Color : " + clipBackgroundColor);

		int docTypeIndex = baseTemplateLogicalName.indexOf("template");
		StringBuilder baseClipName = new StringBuilder(baseTemplateLogicalName.substring(0, docTypeIndex));
		baseClipName.append("clip");
		baseClipLogicalName = baseClipName.toString();
		
		return baseClipLogicalName;
//		return "baseSidebars_1920_clip";
	}
	
	@RequestMapping(value="/saveClip", method=RequestMethod.POST)
	public String saveClip( @ModelAttribute("clip") Clip clip, HttpServletRequest request, 
			BindingResult result, Model model){
		
		this.clipName = (String) result.getFieldValue("clipName");
		model.addAttribute("clipName", this.clipName);
		ArrayList<ClipSection> clipSectionsList = displayDocService.getNewClip().getClipSectionsList();
		
		int clipDurationInSeconds = displayDocService.getNewClip().getClipDurationInSeconds();
		model.addAttribute("clipDurationInSeconds", clipDurationInSeconds);
		int clipOrderNumber = displayDocService.getNewClip().getClipOrderNumber();
		model.addAttribute("clipOrderNumber", clipOrderNumber);
		String nextClipUri = displayDocService.getNewClip().getNextClipUri();
		model.addAttribute("nextClipUri", nextClipUri);
		
		displayDocService.parseClipSectionsHTMLCode(clipSectionsList);
		
		displayDocService.updateClipStyleAttribute("style", clipBackgroundColor);
		
		String baseClipUri = baseClipLogicalName + ".jsp";
			System.out.println("saveClip : " + baseClipUri);
		displayDocService.parseBaseClip(baseClipUri);
		
		String clipHtmlOutput =
				displayDocService.getDisplayDocParserService().updateClipSectionsHTMLCode();
		
		displayDocService.saveClipFile(clipName, clipHtmlOutput);
		
		// TODO  Call ClipDAO to save it in DB
		
		return "clipSuccess";
	}


}
