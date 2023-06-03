package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SampleHW extends Base{
	@Test
	public void sampleSearch()  {
		driver.navigate().to("https://www.amazon.in/");
		WebElement searchiPhone= driver.findElement(By.name("field-keywords"));
		searchiPhone.sendKeys("iphone14");
		WebElement buttonclick= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		buttonclick.click();			
		}
	@ Test
	public void SampleAssertion() {
		int expectedshowButtonHeight= 30;
		WebElement showButtonElement=driver.findElement(By.xpath("//button[@id='button-one']"));
		Dimension  showMessageButtonSize=showButtonElement.getSize();
		int actualshowButtonHeight=showMessageButtonSize.height;
		assertEquals(expectedshowButtonHeight,actualshowButtonHeight ,"show message button heeight is not"+ expectedshowButtonHeight);
	}
	@Test
	public void nullAssert() {
		String verifyAssertNull= null;
		assertNull(verifyAssertNull);
		String verifyTitle=driver.getTitle();
		verifyTitle.equalsIgnoreCase(" Obsqura Zone");
		assertNotNull(verifyTitle);
		
	}
	@Test
	public void showMessageButtonHeiWidCol() {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement showMessageBuElement= driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonColourActual= showMessageBuElement.getCssValue("color");
		String showMessageButtonExpected= "rgba(255, 255, 255, 1)";
		assertEquals(showMessageButtonExpected,showMessageButtonColourActual,"colour does not match");
	}
	@Test
	public void showButtonWidth() {
		int  expectedShowMessageButtonWidth = 38;
	    WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	    Dimension showMessageButtonSize =showMessageButton.getSize();
	    int actualShowMessageButtonWidth = showMessageButtonSize.width;
	    assertEquals(expectedShowMessageButtonWidth, actualShowMessageButtonWidth,"width of show Message button is not"+expectedShowMessageButtonWidth);
	    
	}
	@Test
	public void verifyWhetherSucessMessageIsAvailavleWhenYouAreCLickingONCheckBox() {
		String expectedMessage="Success - Check box is checked";
		driver.findElement(By.xpath("//a[@href='check-box-demo.php']")).click();
		WebElement clickOnTHisCheckBoxButton=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickOnTHisCheckBoxButton.click();
		boolean checkBoxButtonIsSelected= clickOnTHisCheckBoxButton.isSelected();
		WebElement showActualMessage= driver.findElement(By.xpath("//div[@id='message-one']"));
		showActualMessage. getText();				
		//assertEquals(expectedMessage,showActualMessage,"message shown is not match");
	}
	
	@Test
	public void menuContents() {
		List<WebElement>menuElements=driver.findElements(By.xpath("//li[@class='list-group-item']"));
		WebElement expectedValue= menuElements.get(1);
		WebElement checkBoxDemoElement=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		String checkBoxMenuGetTextActual= checkBoxDemoElement.getText();
	    assertEquals(expectedValue, checkBoxMenuGetTextActual,"mismatched");		
	}
	
	
}


