package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {

	
	
	public void validateElelemt(String actualText , String expectedText , String errorMessageText) {
		
		Assert.assertEquals(actualText,expectedText, errorMessageText);
	}
	
	public void selectFromDropDown(WebElement element, String vesibleText) {

		Select sel1 = new Select(element);
		sel1.selectByVisibleText(vesibleText);
	}

	public int generatedRandomNumber(int bound) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(bound) + 100;
		return randomNumber;
	}
	
	
}
