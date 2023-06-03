package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	//@Test
	public void sendKeysSample() {
		WebElement singleInputTextField= driver.findElement(By.id("single-input-field"));
		singleInputTextField.sendKeys("Hello");
	}
	//@Test
	public void clickSample() {
		WebElement singleInputTextField= driver.findElement(By.id("single-input-field"));
		singleInputTextField.sendKeys("Hello");
		WebElement showMessageButton= driver.findElement(By.id("button-one"));
		showMessageButton.click();
	}
//@Test
public void clearSample() {
	WebElement singleInputTextClear=driver.findElement(By.id("single-input-field"));
	singleInputTextClear.sendKeys("Hello");
	singleInputTextClear.clear();
	
}
@Test
public void isEnabledSample() {
	WebElement showMessageButton= driver.findElement(By.id("button-one"));
	WebElement singleInputTextField= driver.findElement(By.id("single-input-field"));
	
	//is enable and is displayed
	
	boolean isShowButtonMessageEnabled=showMessageButton.isEnabled();
	boolean isShowButtonMessageDisplayed=showMessageButton.isDisplayed();
	
	//get text , attribute, colour
	
	String showBMessageButton=showMessageButton.getText();
	String getClassNameOfShowMessageButton=showMessageButton.getAttribute("class");
	String getTypeNameOfShowMessageButton=showMessageButton.getAttribute("type");
	String getShowButtonmMessageBackgroubdColor=showMessageButton.getCssValue("background-color");	
	String getShowButtonMessageTextColour=showMessageButton.getCssValue("color");
	
	// get location and axis of x & y
	
	Point singleInputFieldLocation = singleInputTextField.getLocation();
	int singleInputFieldXaxis=singleInputFieldLocation.x;
	int singleInputFieldYaxis=singleInputFieldLocation.y;
	
	Point showMessageButtonLocation = showMessageButton.getLocation();
	int showMessageButtonXAxix = showMessageButtonLocation.x;
	int showMessageButtonYAxix = showMessageButtonLocation.y;
	
	
	// height and width
	
	org.openqa.selenium.Dimension showMessageButtonSize = showMessageButton.getSize();
	int showMessageButtonHeight =showMessageButtonSize.height;
	int showMessageButtonWidth =showMessageButtonSize.width;

}

@Test
public void verifyHeightOfShowMessageButton() {
  int  expectedShowMessageButtonHeight = 38;
  WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
 org.openqa.selenium.Dimension showMessageButtonSize =showMessageButton.getSize();
  int actualShowMessageButtonHeight = showMessageButtonSize.height;
  assertEquals(expectedShowMessageButtonHeight,actualShowMessageButtonHeight,"show message button height is not "+expectedShowMessageButtonHeight);
  
}


@Test
public void verifyTwoInputField(){
	String a="100", b="300";
	int expectedvalue= Integer.parseInt(a)+Integer.parseInt(b);// convert to string
	WebElement enterValueOfA=driver.findElement(By.xpath("//input[@id='value-a']"));	
	WebElement enterValueOfB=driver.findElement(By.xpath("//input[@id='value-b']"));	
	WebElement getTotalButton= driver.findElement(By.xpath("//button[@id='button-two']"));	
	WebElement actualResult= driver.findElement(By.xpath("//div[@id='message-two']"));//id
	enterValueOfA.sendKeys(a);
	enterValueOfB.sendKeys(b);
	getTotalButton.click();	
	String getActualTextResult= actualResult.getText();//use contains 
	
	StringBuilder digitOnly=new StringBuilder();
	for(int i=0;i<getActualTextResult.length();i++) {
		char c=getActualTextResult.charAt(i);
		if(Character.isDigit(c)) {			
		}
	}
int actualresultValue=Integer.parseInt(digitOnly.toString());
if(actualresultValue==expectedvalue) {
	System.out.println("passed");
}
else {
	System.out.println("failed");
}
}
@Test
public void verifyTheBackgroundColor() {
	WebElement getTotalButton= driver.findElement(By.xpath("//button[@id='button-two']"));
	String GetTotalBackgroundColor= getTotalButton.getCssValue("background-color");
	getTotalButton.isEnabled();
	getTotalButton.isDisplayed();
	getTotalButton.getAttribute("class");
	getTotalButton.getText();
	Point getTotalButtonLocation = getTotalButton.getLocation();
}
}
