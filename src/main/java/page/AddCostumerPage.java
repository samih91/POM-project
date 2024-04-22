package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCostumerPage extends BasePage{
	
	WebDriver driver;
	
	public AddCostumerPage(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy (how = How.XPATH,using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong") WebElement ADD_COSTUMER_HEADER_ELELEMT;
	
	
	public void validateAddCostumerPage(String expactedText) {
		
		validateElelemt(ADD_COSTUMER_HEADER_ELELEMT.getText(),expactedText, "The Dashboard page is not found !! ");
		
	}
		
	

}
