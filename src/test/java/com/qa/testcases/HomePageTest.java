package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;


public class HomePageTest extends TestBase {

	
	HomePage homepage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
	initialization();
	
	homepage= new HomePage();
	}
	
	@Test(priority=1)
	public void ValidLoginTest1() throws InterruptedException 
	{
		homepage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		String flag=homepage.Userlogin1();
		Assert.assertEquals(flag, "Hi, test");
		
	}
	
  @Test(priority=1)
	public void ValidLoginTest2() throws InterruptedException 
	{
		homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		Boolean flag=homepage.Userlogin2();
		Assert.assertTrue(flag);
		
	}
		
		
   
   @Test(priority=1)
   public void PopularModelName() throws InterruptedException 
	{
	   String txt1=homepage.PopularModelName();
		System.out.print(txt1);
		Assert.assertEquals(txt1, "Lamborghini(5374 votes)");
		
	}
		
		@AfterMethod
		public void CloseApplication()
		{
			TearDown();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
