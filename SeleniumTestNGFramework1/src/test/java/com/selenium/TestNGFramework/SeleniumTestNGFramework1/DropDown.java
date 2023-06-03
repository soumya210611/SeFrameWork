package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.browser.model.Bucket;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class DropDown extends Base{
	@Test
	public void dropDownUsingSelectClass() {
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropDownCountry= driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(dropDownCountry);
		select.selectByIndex(2);
		select.selectByValue("ANTARCTICA");
		select.selectByVisibleText("BURUNDI");
		
	}
	@Test
	public void multipleSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement multipleSelectColour=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		WebElement getAllSelecteButton=driver.findElement(By.xpath("//button[@id='button-all']"));
		Select select1=new Select(multipleSelectColour);
		boolean isDropDownMultiple=select1.isMultiple();
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		
	//	select1.deselectAll();
	}
@Test
public void getOptionSample() {
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	WebElement multipleSelectColour=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	Select select3=new Select(multipleSelectColour);
	List<WebElement>options= select3.getOptions();
	
}
@Test
public void verifyYellowIsSelectedFromList() throws Exception {
	String expectedValueIsYellow="Selected Color : Yellow";
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	WebElement coloursOptionField=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select selecte4 = new Select(coloursOptionField);
	List<WebElement> optionsInColur =selecte4.getOptions();	
	for (WebElement getAColourFromDropDown : optionsInColur) {
		if (optionsInColur.equals(coloursOptionField))
			selecte4.getAllSelectedOptions();
		selecte4.selectByIndex(2);
		}		
	}
		
@Test
public void verifyColourIsSelectedFromDropdown() {
	String expectedColour="Selected Color : Green";
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");	
	WebElement selectAColourFromDropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	WebElement getTextFromSelectedColour=driver.findElement(By.xpath("//div[@id='message-one']"));
	Select select7=new Select(selectAColourFromDropdown);
	select7.selectByIndex(3);
	String textValueOfColour= getTextFromSelectedColour.getText();
	assertEquals(expectedColour, textValueOfColour,"the colour selected is "+expectedColour);
	}

@Test
public void verifyGetAllSelecteButtonIsSelected() {
	String ExpectsGetText="All selected colors are : Red,Yellow,Green";
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	WebElement multipleSelectColours=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	WebElement getAllSelecteButton=driver.findElement(By.xpath("//button[@id='button-all']"));
	WebElement getTestFromMultipleSelectElement=driver.findElement(By.xpath("//div[@id='message-two']"));
	Select select=new Select(multipleSelectColours);
	boolean multipleColourFromSelectecolour=select.isMultiple();
	select.getAllSelectedOptions();
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(2);		
	getAllSelecteButton.click();
	String textElementFromdropdown= getTestFromMultipleSelectElement.getText();
	assertEquals(ExpectsGetText,textElementFromdropdown,"textElementFromdropdown message should get "+ExpectsGetText );	
}

@Test
public void dropDownFromSeleniumDev() {
	String expectedLanguage="Português (Brasileiro)";
	driver.navigate().to("https://www.selenium.dev/");
	WebElement selectLanguage=driver.findElement(By.xpath("//li[contains(@class,'nav-item dropdown d-none d-lg-block')]//child::a[@id='navbarDropdown']"));
	selectLanguage.click();
	List<WebElement> Languageoptions = selectLanguage.findElements(By.xpath("//div[@aria-labelledby='navbarDropdownMenuLink']//child::a[@class='dropdown-item']"));
	for (WebElement option : Languageoptions) {
		String actualLanguage=option.getText();
	    if(expectedLanguage.equals(actualLanguage))
	        option.click();
	 assertEquals(expectedLanguage,actualLanguage,"the language should be seleced"+expectedLanguage);
	 break;
	}
	}
		
	}
	



