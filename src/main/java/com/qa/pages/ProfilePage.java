package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.qa.base.TestBase;


public class ProfilePage extends TestBase {
	
	 // Defining locators using Page Factory
	
	//locator for first name

    @FindBy(id = "firstName")
    WebElement firstNameTextBox;
    
   //locator for last name

    @FindBy(id = "lastName")
    WebElement lastNameTextBox;
    
	//locator for age
    
    @FindBy(id = "age")
    WebElement age;
    
    //locator for address
    
    @FindBy(id = "address")
    WebElement address;
	
    //locator for phone
    
    @FindBy(id = "phone")
    WebElement phone;
	
    //locator for hobby
    
    @FindBy(id = "hobby")
    WebElement hobbby;
    
    //locator for gender
    
    @FindBy(id = "gender")
    WebElement gender;
	
    //locator for currentpassword
    
    @FindBy(id = "currentpassword")
    WebElement currentPassword;
    
    //locator for newpassword
    
    @FindBy(id = "newPassword")
    WebElement newpassword;
    
    //locator for confirmpassword
    
    @FindBy(id="newPasswordConfirmation")
    WebElement confirmpassword;
    
    //locator for language
    
    @FindBy(id = "language")
    WebElement language;
    
    //locator for savebutton
    
    @FindBy(css = "button[type='submit']" )
    WebElement savebutton;
    
    //locator for cancelbutton
    
    @FindBy(css = "a[role='button']")
    WebElement cancelbutton;
    
    //locator for success message
    
    @FindBy(css = ".result.alert.alert-success")
    WebElement confirmationMessage;
    
     // Initializing the locators
	
     public ProfilePage()
 	 {
    	 
 	 PageFactory.initElements(driver, this);
 	 
 	}
     
     //Method for updating additional info on the profile page
     
     @Test()
     public void updateaddress(String add) throws InterruptedException 
     {
    	// Thread.sleep(3000);
    	 waitForPageLoaded();

         address.sendKeys(add);    
         savebutton.click();
         
         
     }
     
     @Test
     public boolean successmsg() throws InterruptedException 
     {
    	 waitForPageLoaded();

    	 //Thread.sleep(3000);
    	return confirmationMessage.isDisplayed();
    	 
         
     }
}
     
     
     

     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      

