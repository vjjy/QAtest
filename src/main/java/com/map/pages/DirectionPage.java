package com.map.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maps.utils.MAPSConstants;

public class DirectionPage {
	
	@FindBy(xpath=MAPSConstants.DESTINATIONBOX)
	public WebElement destinationbox;
	 
	
	
	public String getdestinationvalue(){
		
		return  destinationbox.getAttribute("aria-label");
		
	}
	 
}
