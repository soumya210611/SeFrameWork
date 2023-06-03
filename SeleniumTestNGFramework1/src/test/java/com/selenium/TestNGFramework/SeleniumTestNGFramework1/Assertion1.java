package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 extends Base {
	
	@Test
	
	  public void verifyHeightOfShowMessageButton() {
	    int  expectedShowMessageButtonHeight = 38;
	    WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	    Dimension showMessageButtonSize =showMessageButton.getSize();
	    int actualShowMessageButtonHeight = showMessageButtonSize.height;
	    assertEquals(expectedShowMessageButtonHeight,actualShowMessageButtonHeight,"show message button height is not "+expectedShowMessageButtonHeight);
	    
	  }
	@Test
	public void assertSample() {
		String expectedValue ="123";
		String actualValue="123";
		boolean flag=false;
		SoftAssert softassert = new SoftAssert();
		softassert.assertNotEquals(expectedValue,actualValue,"expected and actual values are same");
		softassert.assertFalse(flag,"flag is true");
		softassert.assertAll();
	}
	@Test
	public void assertSample2() {
		String expectedValue = "123";
		String actualValue = "345";
		boolean flag = false;
		SoftAssert softAssert1 = new SoftAssert();
		softAssert1.assertNotEquals(expectedValue, actualValue, "expected and actual values are same");
		softAssert1.assertFalse(flag, "flag is true");
		softAssert1.assertAll();
	}
	@Test
	
	public void checkElementLocation() {
		 boolean flag =false;
		 WebElement enterValueA= driver.findElement(By.xpath("//input[@id='value-a']"));
		 WebElement enterValueB= driver.findElement(By.xpath("//input[@id='value-b']"));
		 Point enterValueALocation = enterValueA.getLocation();
		 int enterValueAYAxix= enterValueALocation.y;
		 Point enterValueBLocation = enterValueB.getLocation();
		 int enterValueBYAxix= enterValueBLocation.y;
		 if(enterValueAYAxix<enterValueBYAxix) {
			flag = true;
		 }
		 assertTrue(flag,"A is below B");
		}
}
