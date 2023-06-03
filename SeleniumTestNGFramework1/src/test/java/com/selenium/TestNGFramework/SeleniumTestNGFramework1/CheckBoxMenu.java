package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxMenu extends MenuContents {
	@Test
	public void verifySucessMessageIsAvailableWhenClickOnCheckBox(String expectedValue) {
		String expectedSingleCheckBoxSucessMessage= "Success - Check box is checked";
		MenuContents menuContents=new MenuContents();
		menuContents.menuListContents("Checkbox Demo", driver);
		WebElement singleCheckBoxButton=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement sucessMessageTextElement=driver.findElement(By.xpath("//div[@id='message-one']"));
		singleCheckBoxButton.click();
		String actualSingleCkeckBoxSuccessMessageString = sucessMessageTextElement.getText();
		assertEquals(expectedSingleCheckBoxSucessMessage,actualSingleCkeckBoxSuccessMessageString,"sucess message is not on the checkbox "+expectedSingleCheckBoxSucessMessage);
		
	}

}
