package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class PopularModelPage extends TestBase{
	
	// Defining locators using Page Factory
	
	//locator for popular model name

	    @FindBy(css= "div:nth-child(2) > h3")
	    WebElement popularname;
	    
	  //locator for vote
	    
	    @FindBy(css="div:nth-child(1) > h4 > strong")
	    WebElement vote;
	    
	    
	 // Initializing the locators
		
	 		public PopularModelPage()
	 		{
	 			PageFactory.initElements(driver, this);
	 		}
	 		
	 		
	 		
	 	// Method for getting the name of popular model
	 		
	 		public String PopularModel() throws InterruptedException
			{
	 			waitForPageLoaded();
				//Thread.sleep(3000);
				String name= popularname.getText();
				return name;
			}
	
      // Method for getting the vote count for popular model
	 		
	 		public String VoteCount() 
			{
	 			
	 			waitForPageLoaded();
				String votecount= vote.getText();
				return votecount;
			}
	

}
