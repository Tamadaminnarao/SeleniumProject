package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import constants.TestConstants;
import helpers.TestHelper;
public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle() {
		TestHelper helper = new TestHelper();
		helper.verifyTitle(TestConstants.LOGIN_PAGE_TITLE);
	}
	
	
}
