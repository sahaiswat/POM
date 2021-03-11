package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ProfilePage;

public class ProfilePageTest extends TestBase{
	
	HomePage homepage;
	ProfilePage profilepage;
	
	public ProfilePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
	initialization();
	
	homepage= new HomePage();
	homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	profilepage=homepage.ClickOnProfile();
	}
	
	 @DataProvider(name = "data1")
	    public Object[][] createData1() {
	     return new Object[][] {
	       { "123/St Stephen's Avenue" }
	     };
	    }
	
	
	@Test(dataProvider="data1")
	
	
	public void UpdateProfileTest(String add) throws InterruptedException  
	{
		
		profilepage=homepage.ClickOnProfile();
		
		profilepage.updateaddress(add);
		
		Boolean flag=profilepage.successmsg();
		Assert.assertTrue(flag);
	
	}
		 	
	
	@AfterMethod
	public void CloseApplication()
	{
		TearDown();
	}
	
}
