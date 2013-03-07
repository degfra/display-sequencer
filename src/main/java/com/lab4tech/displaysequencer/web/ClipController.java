package com.lab4tech.displaysequencer.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lab4tech.displaysequencer.domain.Clip;
import com.lab4tech.displaysequencer.domain.DisplayDoc;
import com.lab4tech.displaysequencer.domain.Template;
import com.lab4tech.displaysequencer.service.DisplayDocService;


@Controller
@SessionAttributes("clip")
public class ClipController {
	
	private DisplayDocService displayDocService;
	
//	private int clipChosen;
	
	@Autowired
	public ClipController(DisplayDocService displayDocService) {
		this.displayDocService = displayDocService;
	}
	
	
	@RequestMapping(value="/clipDisplay", method=RequestMethod.POST)
	public String displayClip(@ModelAttribute("clip") Clip clip,
			BindingResult result, Model model){
		
		clip = displayDocService.getNewClip();

		String clipName = (String) result.getFieldValue("clipName");
		
		return clipName;
	}
	
	@RequestMapping(value="/nextClip", method=RequestMethod.POST)
	public String displayNextClip(@ModelAttribute("clip") Clip clip,
			BindingResult result, Model model) {
		
		String nextClipUri = (String) result.getFieldValue("nextClipUri");
		String clipDuration = (String) result.getFieldValue("clipDurationInSeconds");
		String clipOrder = (String) result.getFieldValue("clipOrderNumber");
		
		String clipName = (String) result.getFieldValue("clipName");
		
		model.addAttribute("nextClipUri", nextClipUri);		
		model.addAttribute("clipDurationInSeconds", clipDuration);
		model.addAttribute("clipOrderNumber", clipOrder);
		
		model.addAttribute("clipName", clipName);
		
		return nextClipUri;
	}
	
	@RequestMapping(value="/clipsList", method=RequestMethod.GET)
	public String viewClipsList(Model model){
		
		ArrayList<String> availableClipsList = displayDocService.getClipsNamesList();		
		model.addAttribute("clipNames", availableClipsList);	

		Clip clip = new Clip();
		displayDocService.setNewClip(clip);
		model.addAttribute("clip", clip);
		
		return "runSingleClip";
	}
	
	@RequestMapping(value="/runClip", method=RequestMethod.POST)
	public String runSingleClip(@ModelAttribute("clip") Clip clip,
				BindingResult result, Model model)	{
		
		String chosenClipName = (String) result.getFieldValue("clipName");
		int clipDurationInSeconds = Integer.parseInt((String) result.getFieldValue("clipDurationInSeconds"));
//		String clipDuration = (String) result.getFieldValue("clipDurationInSeconds");
//		int clipDurationInSeconds = Integer.parseInt(clipDuration);
		String nextClipUri = new String();
		String isLoop = (String) result.getFieldValue("isLoop");
		
		if (isLoop.equals("yes")) {
			nextClipUri = chosenClipName;
		}else if (isLoop.equals("No")){
			nextClipUri = "/endClip";
		}
		
		model.addAttribute("nextClipUri", nextClipUri);
		model.addAttribute("clipName", chosenClipName);
		model.addAttribute("clipDurationInSeconds", clipDurationInSeconds);
		
		clip =  new Clip(chosenClipName, clipDurationInSeconds, nextClipUri);
		displayDocService.setNewClip(clip);
		clip = displayDocService.getNewClip();
		model.addAttribute("clip",clip);
						
		return chosenClipName;
	}
	
	@RequestMapping(value="/endClip", method=RequestMethod.GET)
	public String confirmEndClip(@ModelAttribute("clip") Clip clip, 
					BindingResult result, Model model) {
		String clipName = clip.getClipName();
		model.addAttribute("clipName", clipName);
		
		return "endClip";	
	}
			
}
