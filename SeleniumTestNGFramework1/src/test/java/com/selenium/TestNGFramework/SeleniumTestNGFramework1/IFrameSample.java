package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameSample extends Base {
	@Test
	public void iFrameSample() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement linkForiFrame=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		linkForiFrame.click();
	}
@Test
public void iFrameIndex() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame(1);
	WebElement iFrameIndexElement=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	iFrameIndexElement.click();
}
@Test
public void iFrameWebElement() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
	WebElement linkForiFrameWebElement=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	linkForiFrameWebElement.click();
}
}
