package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	HomePage homepage;
	
	TestUtil testutil;

	// Defining locators using Page Factory
	
		//locator for login text box
		
		@FindBy(css="button[class='btn btn-success']")
		WebElement loginbutton;
		
		//locator for Register button
		
		@FindBy(css="a[class='btn btn-success-outline']")
		WebElement register;
		
		//locator for username
		
		@FindBy (xpath="//input[@name='login']")
		WebElement username;
		
		//locator for password
		
		@FindBy(xpath = "//input[@name='password']")
		WebElement password;
		
		//locator for buggy rating button
		
		@FindBy(css="a[class='navbar-brand']")
		WebElement ratingbutton;
		
		//locator for popularmake
		
		@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[1]//h3[1]")
		WebElement popularmake;
		
		//locator for popularmodel
		
		@FindBy(xpath="//img[@title='Diablo']")
		WebElement popularmodel;
		
		//locator for overallrating
		
		@FindBy(css="img[src='/img/overall.jpg']")
		WebElement overallrating;
		
		// locator for user login text
		
		@FindBy(css="span[class='nav-link disabled']")
		WebElement userlogintext;
	
		//locator for logout button
		
		@FindBy(xpath="//a[normalize-space()='Logout']")
		WebElement logout;
	
		// locator for profile button
		
		@FindBy(xpath = "//*[contains(text(),'Profile')]")
		WebElement profile;
			
			
		// Initializing the locators
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		
		// Method for passing username, password and clicking login button
		
		public  void login (String loginid, String pass)  
		 {
			
			username.sendKeys(loginid);
			password.sendKeys(pass);
			loginbutton.click();
					 
		 }
		
		// Method for validation user is logged in by displaying username
		
		public String Userlogin1() throws InterruptedException
		{
			waitForPageLoaded();
			//waitForPageLoaded();
			String text= userlogintext.getText();
			return text;
		}
		
		// Method for validating user is logged in by displaying logout button 
		
		public boolean Userlogin2() throws InterruptedException
		{
			waitForPageLoaded();
			//waitForPageLoaded();
			return logout.isDisplayed();
			
		}
		
				
		// Method to click profile button
		
		public ProfilePage ClickOnProfile() throws InterruptedException
		{
			waitForPageLoaded();
			//Thread.sleep(5000);
			profile.click();
			return new ProfilePage();
		}
		
		// Method to click register button
		
		public RegistrationPage ClickOnRegister() throws InterruptedException
		{
			waitForPageLoaded();
		//Thread.sleep(3000);			
		register.click();
		return new RegistrationPage();
		}
		
		
		// Method to click popular model 
		
		        public  PopularModelPage ClickOnPopularmodel() throws InterruptedException
		        {
		        	waitForPageLoaded();
		        	//Thread.sleep(3000);
		        	popularmodel.click();
		            return new PopularModelPage();
		        }
		        
		     
		     
           // Method to get popular make name and vote
		        
		        public  String PopularModelName() throws InterruptedException
		        {
		        	waitForPageLoaded();
		        	//Thread.sleep(3000);
		        	String txt1=popularmake.getAttribute("textContent");
		            return txt1;
		        }
		       
		              
}
