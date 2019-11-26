package com.maps.searchtestcase;

import org.openqa.selenium.support.PageFactory;

import com.map.pages.DirectionPage;
import com.map.pages.LandingPage;
import com.map.pages.SearchResultPage;
import com.maps.basetest.BaseTest;
import com.maps.utils.MAPSConstants;

import static org.junit.Assert.*;
 
 

public class SearchTest  extends BaseTest{
 
	@org.junit.Test
	public void testProfile() throws InterruptedException{
	 
		init("Chrome");
		driver.get(MAPSConstants.UAT_HOMEPAGE_URL);
		LandingPage landingpage=PageFactory.initElements(driver, LandingPage.class);
		landingpage.enterText("Dublin");
		SearchResultPage searchresultpage=landingpage.clickonBtn();
		 Thread.sleep(5000);
		
		assertEquals("Dublin",searchresultpage.getheaderTitle());	
 		DirectionPage directionpage=searchresultpage.clickOnDirection();
		 Thread.sleep(5000);		 
 		assertTrue(verifyTextContain(directionpage.getdestinationvalue(),"Dublin"));
 
		
	}

	
}
