package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

import com.qa.pages.RegistrationPage;
import com.qa.util.TestUtil;

public class RegistrationPageTest extends TestBase {
	
	
	
		
		HomePage homepage;
	
		RegistrationPage regpage;
		
		TestUtil testutil;
		
		String sheetname="Register";
		
		String sheetname2="Login";
		
		public RegistrationPageTest()
		{
			super();
		}
		
		@BeforeMethod
		public void SetUp() throws InterruptedException
		{
		initialization();
		
		homepage= new HomePage();
		
		regpage=homepage.ClickOnRegister();
		}
		

		 @DataProvider
			public Object[][] RegisterTestData()
			{
			Object data[][]=TestUtil.getTestData(sheetname);
			return data;
			}
		
//		@Test(priority=1, dataProvider="RegisterTestData")
		
		
		public void RegisterUser(String name , String fname, String lname, String pass, String confirmpass) throws InterruptedException  
		{
			
			regpage=homepage.ClickOnRegister();
		    regpage.registeruser(name, fname, lname, pass, confirmpass);
		    Boolean flag=regpage.SuccessMessage();
			Assert.assertTrue(flag); 	
		
		}
		
		@DataProvider
		public Object[][] VerifyRegisterUserLogin()
		{
		Object data[][]=TestUtil.getTestData(sheetname2);
		return data;
		}
	 
	   @Test(priority=2, dataProvider="VerifyRegisterUserLogin")
	   
		public void RegisterUser(String login, String pass) throws InterruptedException
		{
		    homepage.login(login, pass);
			//Thread.sleep(3000);
			String flag1=homepage.Userlogin1();
			System.out.println(flag1);
			Assert.assertEquals(flag1, "Hi, testuser11xyz");
		}
		
		 @DataProvider(name = "data2")
		    public Object[][] createData2() {
		     return new Object[][] {
		       { "test1ab2c","QA@#1s1sss" }
		     };
		    }
		 

		  @Test(dataProvider="data2")
		 
		public void VerifyNewUserLogin(String user, String pass) throws InterruptedException
		{
			homepage.login(user, pass);
			//Thread.sleep(3000);
			String flag1=homepage.Userlogin1();
			Assert.assertEquals(flag1, "Hi, xyz21");
		}
		 	
		
		@AfterMethod
		public void CloseApplication()
		{
			TearDown();
		}

}
