package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base{
	//@Test
	public void radioButtonDemoContens() {
		MenuContents menuContents=new MenuContents();
		menuContents.menuListContents("Radio Buttons Demo", driver);
		WebElement radioButtonElement=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement radioButtonShowSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		radioButtonElement.click();
		radioButtonShowSelectedValue.click();				
	}
	@Test
	public void verifyMaleRadioButtonIsSelected() {
		MenuContents menuContents=new MenuContents();
		menuContents.menuListContents("Radio Buttons Demo", driver);
		String expectedMessageShow="Radio button 'Male' is checked";
		WebElement radioButtonMaleElement=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement radioButtonShowSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement getActualMeaasgeOfRadioButtonElement= driver.findElement(By.xpath("//div[@id='message-one']"));
		radioButtonMaleElement.click();
		radioButtonShowSelectedValue.click();
		String gettextOfRadioButton= getActualMeaasgeOfRadioButtonElement.getText();
		Assert.assertEquals(expectedMessageShow, gettextOfRadioButton,"Message Shows when male radio button is clicked"+expectedMessageShow);		
	}
	
	@Test
	public void verifyGroupRadioButtonDemo() {
		MenuContents menuContents=new MenuContents();
		menuContents.menuListContents("Radio Buttons Demo", driver);
		String expectedMessageShowsWhenGetResultIsClick="Gender : Female\n"
				+ "Age group: 45 to 60";
		WebElement pateintsGenderRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement pateintsAgeGroupRadoButton=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResultButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement getTextWhenGetResultMessageIsClick=driver.findElement(By.xpath("//div[@id='message-two']"));
		pateintsGenderRadioButton.click();
		pateintsAgeGroupRadoButton.click();
		getResultButton.click();
		String actualGetTextMessageWhenGetResultIsClick= getTextWhenGetResultMessageIsClick.getText();
		Assert.assertEquals(expectedMessageShowsWhenGetResultIsClick, actualGetTextMessageWhenGetResultIsClick,"gender and age group should displayed"+expectedMessageShowsWhenGetResultIsClick);
		System.out.println(actualGetTextMessageWhenGetResultIsClick);
		
	}

}
