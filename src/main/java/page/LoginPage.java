package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	@FindBy ( how = How.XPATH, using = "//*[@id=\"user_name\"]" ) WebElement USER_NAME_ELELEMT;
	@FindBy(how = How.XPATH , using = "//*[@id=\"password\"]" ) WebElement USER_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH , using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON_ELEMENT;
	

	public void insertUserName(String username) {
		USER_NAME_ELELEMT.sendKeys(username);
	}
	public void insertPassword(String password) {
		USER_PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickOnSigningButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

}
