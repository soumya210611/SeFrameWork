package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class JavasSriptExecutorSample extends Base {
	@Test
	public void javaScriptExecutor() {
		WebElement singleInputTextField= driver.findElement(By.id("single-input-field"));		
		WebElement showMessageButton= driver.findElement(By.id("button-one"));
		singleInputTextField.sendKeys("33");
		showMessageButton.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='hello;",singleInputTextField);		
		js.executeScript("arguments[0].click();",showMessageButton );
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("arguments[0].scrollIntoView();", showMessageButton);// Scroll up to that element 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	}

}
