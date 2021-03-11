package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class RegistrationPage  extends TestBase {

    // Defining locators using Page Factory
		
	//locator for username

    @FindBy(id = "username")
    WebElement loginname;
    
   //locator for first name

    @FindBy(id = "firstName")
    WebElement firstname;
    
   //locator for last name

    @FindBy(id = "lastName")
    WebElement lastname;
    
   //locator for password

    @FindBy(id = "password")
    WebElement password;
    
   //locator for confirm password
 
    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;
    
   //locator for register button

    @FindBy(css = "button[class='btn btn-default']")
    WebElement registerButton;
    
   //locator for success message

    @FindBy(css = ".result.alert.alert-success")
    WebElement registrationsuccessfulmessage;
    
    //locators for cancel button
    @FindBy(css = "a[role='button']")
    WebElement cancelbutton;

   // Initializing the locators
	
 		public RegistrationPage()
 		{
 			PageFactory.initElements(driver, this);
 		}
 		
 		
 	// Method for registering the user successfully
		
 			public void registeruser (String name , String fname, String lname, String pass, String confirmpass )  
 			 {
 				loginname.sendKeys(name);
 				firstname.sendKeys(fname);
 				lastname.sendKeys(lname);
 				password.sendKeys(pass);
 				confirmPassword.sendKeys(confirmpass);
 				registerButton.click();
 				
 						 
 			 }
 			
 			 public Boolean SuccessMessage() throws InterruptedException{
 				waitForPageLoaded();   
 			//Thread.sleep(3000);
 		       return registrationsuccessfulmessage.isDisplayed();
 			 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
