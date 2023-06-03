package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts1 extends Base{
	@Test
	public void simpleAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickOnButtonElement=driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
		clickOnButtonElement.click();
		driver.switchTo().alert().accept();//for click ok button from the popup
	}
	@Test
public void dismissAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement dismissAlertOnClickOK= driver.findElement(By.xpath("//button[contains(@class,'btn btn-warning')]"));
		dismissAlertOnClickOK.click();
		String alertText= driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		
	
}
	@Test
	public void promtBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement promtBoxButtonElement=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		promtBoxButtonElement.click();
		driver.switchTo().alert().sendKeys("Soumya");
		driver.switchTo().alert().accept();		
	}
	
}
