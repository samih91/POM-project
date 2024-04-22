package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCostumerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCostumerTest {

	String username = "demo@codefios.com";
	String password = "abc123";
	String dahsboadValidationText = "Dashboard";
	String addcostumerValidationText = "New Customer";
	
	WebDriver driver;
	
	@Test
	public void validUserSHouldBeAbleToAddCostumer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		DashBoardPage  dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		AddCostumerPage addCostumerPage = PageFactory.initElements(driver, AddCostumerPage.class);
		
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSigningButton();
		dashBoardPage.ValidatedashboardPage(dahsboadValidationText);
		dashBoardPage.clickOnCostumerMenuBotton();
		dashBoardPage.clickOnAddCostumer();
		
		
		addCostumerPage.validateAddCostumerPage(addcostumerValidationText);
		
	}
}
