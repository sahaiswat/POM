package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long Page_Load_Timeout=20;
    public static long Implicit_Wait=10;
    
    WebDriver driver;
    static XSSFWorkbook wb;
    static XSSFSheet sheet;
    public static String TestData_Sheet_Path="C:\\Users\\ssinha\\Desktop\\selenium\\DemoMavenProject\\src\\main\\java\\com\\qa\\testdata\\Registration.xlsx";
     
	
	 public static Object[][]getTestData(String sheetname)
	    {
	    	FileInputStream fis=null;
	    			try {
						fis=new FileInputStream(TestData_Sheet_Path);
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					}
	    	try {
				wb=new XSSFWorkbook(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    	sheet=wb.getSheet(sheetname);
	    			
	    		Object [][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	    		for (int i=0; i<sheet.getLastRowNum(); i++) {
	    			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
	    			{
	    				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	    			
	    			}
	    		}
	    		return data;	
	    }
	 
	

}
