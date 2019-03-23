package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage(driver);	
		
	}
	
  @Test
  public void testDemo() {
	 loginPage.verifyTitle();
  }
  
@AfterMethod
	public void tearDown(){
		driver.close();
		
	}
}
