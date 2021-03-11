package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.PopularModelPage;


public class PopularModelPageTest extends TestBase {
	
	HomePage homepage;
	
	PopularModelPage poppage;
	
	public PopularModelPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
	initialization();
	
	homepage= new HomePage();
	
	poppage=homepage.ClickOnPopularmodel();
	}
	
	 
	
	@Test
	
	public void popularmodelpagedisplayed() throws InterruptedException
	{
		poppage=homepage.ClickOnPopularmodel();
		String modelname=poppage.PopularModel();
	    String votes=poppage.VoteCount();
		System.out.println(modelname);
		System.out.println(votes);
	    
	
	}
	
	
	 	
	
	@AfterMethod
	public void CloseApplication()
	{
		TearDown();
	}

}
