package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {
                        //System.out.println("starting execution");	
			System.out.println("starting execution");
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
                        System.out.println("Ended Execution");	
		}	
		@BeforeTest
		public void beforeTest() {	
			System.out.println("Before FirefoxDriver");
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			System.out.println("After FirefoxDriver");
			driver.quit();			
		}		
}	