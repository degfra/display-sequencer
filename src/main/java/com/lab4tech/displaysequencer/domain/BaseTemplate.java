package com.lab4tech.displaysequencer.domain;

import java.util.ArrayList;

import com.lab4tech.displaysequencer.domain.DisplayDoc;
import com.lab4tech.displaysequencer.domain.Ressource;


public class BaseTemplate extends DisplayDoc {
	
	private ArrayList<Ressource> availableRessourcesList = null;

	public ArrayList<Ressource> getAvailableRessourcesList() {
		return availableRessourcesList;
	}

	public void setAvailableRessourcesList(
			ArrayList<Ressource> availableRessourcesList) {
		this.availableRessourcesList = availableRessourcesList;
	}
	
	public BaseTemplate(){
		super();
	}
	
	public BaseTemplate(String docName){
		super(docName);
		
	}

}
