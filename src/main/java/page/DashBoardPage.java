package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage extends BasePage {
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriver driver;
	
	@FindBy (how = How.CSS, using= "div[class='panel-title'] strong" ) WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy (how = How.XPATH ,using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span") WebElement COSTUMERS_MENU_ELEMENT;
	@FindBy (how = How.XPATH,using = "//*[@id=\"customers\"]/li[2]/a/span") WebElement ADD_COSTUMER_FIELD_ELELEMT;
	
	
	
	public void ValidatedashboardPage(String expectedText) {
		
		validateElelemt(DASHBOARD_HEADER_ELEMENT.getText(),expectedText, "The Dashboard page is not found !! ");
	}
	
	public void clickOnCostumerMenuBotton() {
		COSTUMERS_MENU_ELEMENT.click();
	}
	public void clickOnAddCostumer() {
		ADD_COSTUMER_FIELD_ELELEMT.click();
	}
	

	

}
