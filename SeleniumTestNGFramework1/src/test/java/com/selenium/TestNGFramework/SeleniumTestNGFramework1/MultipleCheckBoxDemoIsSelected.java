package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class MultipleCheckBoxDemoIsSelected extends MenuContents{
	//@Test
	public void verifyfirstTwoCheckBoxButtonIsSelected() {
		
		MenuContents menuContents=new MenuContents();
		menuContents.menuListContents("Checkbox Demo", driver);
		WebElement checkBox1Button = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBox2Button = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkBox1Button.click();
		checkBox2Button.click();
		boolean checkBox1buttonIsSelected = checkBox1Button.isSelected();		
		boolean checkBox2ButtonIsSelected = checkBox2Button.isSelected();
		assertTrue(checkBox1buttonIsSelected);
		assertTrue(checkBox2ButtonIsSelected);
		
				
//		WebElement parentMultipleCheckBox=driver.findElement(By.xpath("//form[@method='POST']"));
//		List<WebElement>checkBox1Button = parentMultipleCheckBox.findElements(By.xpath("//input[@id='check-box-one']"));
//		for (WebElement CBButtons : checkBox1Button) {
//			CBButtons.click();
//			boolean checkBox1buttonIsSelected = CBButtons.isSelected();
//			assertTrue(checkBox1buttonIsSelected);
//		}	
		
	}
//@Test
public void verifyAllTheCheckBoxIsSelected() {
	MenuContents menuContents=new MenuContents();
	menuContents.menuListContents("Checkbox Demo", driver);
//	WebElement selectAllButonElement=driver.findElement(By.xpath("//input[@id='button-two']"));	
//	selectAllButonElement.click();
//	selectAllButonElement.isSelected();
//	assertTrue(selectAllButonElement.isSelected());
	
	WebElement selectAllButonElement = driver.findElement(By.xpath("//input[@id='button-two']"));
	List<WebElement> listOfAllCheckBox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
	selectAllButonElement.click();
	for (WebElement selectAllButtonList : listOfAllCheckBox) {
		selectAllButtonList.isSelected();
		assertTrue(selectAllButtonList.isSelected());//message is mandatory
		break;
}
	
}
@Test
public void verifyAllTheCheckBoxButtobISUnselected() {
	MenuContents menuContents=new MenuContents();
	menuContents.menuListContents("Checkbox Demo", driver);
//	WebElement selectAllButonElement=driver.findElement(By.xpath("//input[@id='button-two']"));
//	selectAllButonElement.click();
//	selectAllButonElement.click();
//	selectAllButonElement.isSelected();
//	selectAllButonElement.isDisplayed();
//	selectAllButonElement.isEnabled();
//	assertTrue(selectAllButonElement.isEnabled());
//	

	WebElement selectAllButonElement = driver.findElement(By.xpath("//input[@id='button-two']"));
	List<WebElement> listOfAllCheckBox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
	selectAllButonElement.click();
	selectAllButonElement.click();
	for (WebElement selectAllButtonList : listOfAllCheckBox) {
		boolean selectAllButton= selectAllButtonList.isSelected();
		assertTrue(selectAllButton);
		break;
	}
	
	
}
}
