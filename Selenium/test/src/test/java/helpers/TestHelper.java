package helpers;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import junit.framework.Assert;

public class TestHelper extends TestBase{

	public void verifyTitle(String title) {
		System.out.println("Given Title:"+title);
		System.out.println("Actual Title : "+driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());
	}
}
