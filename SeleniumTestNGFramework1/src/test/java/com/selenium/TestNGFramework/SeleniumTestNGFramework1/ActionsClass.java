package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base{
	@Test
	public void actionClassSample() throws Exception {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggableFirstElement=driver.findElement(By.xpath("(//span[contains(@draggable,'true')])[1]"));
		WebElement destination= driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(draggableFirstElement).build().perform();		
		actions.moveToElement(draggableFirstElement).click();		
		actions.doubleClick(draggableFirstElement).perform();		
		actions.contextClick(draggableFirstElement).perform();//right click
		Thread.sleep(2000);
		actions.dragAndDrop(draggableFirstElement, destination).build().perform();//source,
				
	}

}
