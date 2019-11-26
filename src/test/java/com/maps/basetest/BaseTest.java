package com.maps.basetest;

 
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import com.maps.utils.MAPSConstants;
 

public class BaseTest {
 
	
	public WebDriver driver;
	public void init(String bType){
 
			// local machine
			if(bType.equals("Mozilla")){
				System.setProperty("webdriver.gecko.driver", MAPSConstants.GECOKO_DRIVER_EXE);	
				driver= new FirefoxDriver();
			}
			else if(bType.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", MAPSConstants.CHROME_DRIVER_EXE);
				driver= new ChromeDriver();
			}
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
 
	
 
	 public boolean verifyTextContain(String getestinationvalue,String Expvalue) {
             
		return  getestinationvalue.contains("Expvalue");
	}
	 
}
