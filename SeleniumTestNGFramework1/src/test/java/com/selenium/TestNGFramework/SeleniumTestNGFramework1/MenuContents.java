package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import java.util.List;

import org.apache.poi.util.IntList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuContents extends Base{
	@Test
	public void menuListContents(String ExpectedValue,WebDriver driver) {
		WebElement menuElement = driver.findElement(By.xpath("//ul[contains(@class,'list-group-flush')]"));
		List<WebElement> menuList =menuElement.findElements(By.xpath("//li[@class='list-group-item']"));
		for (WebElement singleElementFromMenu : menuList) {
			String getTextOfSingleElement =singleElementFromMenu.getText();
			if (getTextOfSingleElement.equals(ExpectedValue)) {
				singleElementFromMenu.click();
				break;
			}
		}

	}
}
