package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LonginTest {
	
	String username = "demo@codefios.com";
	String password = "abc123";
	String dahsboadValidationText = "Dashboard";

	
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() {

		
		
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		DashBoardPage  dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
			
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSigningButton();
		dashBoardPage.ValidatedashboardPage(dahsboadValidationText);
		BrowserFactory.tearDown();

	}
}
