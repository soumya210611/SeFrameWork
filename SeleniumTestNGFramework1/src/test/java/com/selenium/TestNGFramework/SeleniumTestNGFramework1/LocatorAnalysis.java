package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorAnalysis extends Base{
	@Test
	public void idLocator() {
		WebElement selectInputFieldTextField=driver.findElement(By.id("single-input-field"));
		selectInputFieldTextField.sendKeys("Nature");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		showMessageButton.click();		
	}
	@Test
	public void classNameLocator() {
		WebElement selectInputFieldTextField=driver.findElement(By.className("form-control"));
		selectInputFieldTextField.sendKeys("Nature");
		WebElement showMessageButton=driver.findElement(By.className("btn-primary"));
		showMessageButton.click();		
	}
	@Test
	public void cssSelectorLocator() {
		WebElement selectInputFieldTextField=driver.findElement(By.cssSelector("input[class=form-control]"));
		selectInputFieldTextField.sendKeys("Nature");
		WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
		showMessageButton.click();		
	}
	@Test
	public void xpathLocator() {
		WebElement selectInputFieldTextField=driver.findElement(By.xpath("//input[@class='form-control']"));
		selectInputFieldTextField.sendKeys("Nature");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();		
	}

}
