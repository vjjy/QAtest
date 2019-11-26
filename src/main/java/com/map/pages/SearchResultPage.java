package com.map.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.maps.utils.MAPSConstants;

public class SearchResultPage  {
	WebDriver driver;
	public SearchResultPage(WebDriver driver){
		 this.driver=driver;
	}
	@FindBy(xpath=MAPSConstants.HEADERTITTLE)
	public WebElement headerTitle;
	
	@FindBy(xpath=MAPSConstants.DIRECTIONICON)
	public WebElement directionlink;
	
	
	public String getheaderTitle(){
		return headerTitle.getText();
		
	}
	public DirectionPage clickOnDirection(){
		directionlink.click();
    	return  PageFactory.initElements(driver, DirectionPage.class);
 
	}
}
