package com.map.pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import com.maps.utils.MAPSConstants;
 
 

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver){
		 this.driver=driver;
	}
	@FindBy(id=MAPSConstants.SEARCHBOX)
	public WebElement searchbox;
	
	@FindBy(id=MAPSConstants.SEARCHBUTTON)
	public WebElement searchbutton;
	
	@FindBy(xpath=MAPSConstants.HEADERTITTLE)
	public WebElement headtitle;
	
	@FindBy(xpath=MAPSConstants.DIRECTIONICON)
	public WebElement directionicon;
	
    public void enterText(String textvalue){
    	
    	searchbox.sendKeys(textvalue);
    }
    
    public SearchResultPage clickonBtn(){
    	
    	searchbutton.click();
 
    	return  PageFactory.initElements(driver, SearchResultPage.class);
    }
	
 

	

}
