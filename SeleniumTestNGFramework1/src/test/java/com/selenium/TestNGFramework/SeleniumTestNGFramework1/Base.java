package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;  //initilize globally
@BeforeTest 
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumy\\eclipse-workspace\\SeleniumTestNGFramework1\\src\\main\\java\\Resources1\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
@AfterTest
	public void driverQuit() {
		driver.quit();
}	
}
