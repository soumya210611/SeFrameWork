package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload1 extends Base{
	@Test
	public void UploadTheFile() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\soumy\\OneDrive\\Documents\\Bug Life Cycle pdf.docx");				
	}
	@Test 
	public void fileUploadingUsingAutoIt() throws IOException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPDFfileButton= driver.findElement(By.xpath("//a[@id='pickfiles']"));
		WebElement pdfCoverterButton=driver.findElement(By.xpath("//body[@data-browser-supports='grid']"));
		selectPDFfileButton.click();
		 Runtime.getRuntime().exec("D:\\FileUpload1.exe");	
		 pdfCoverterButton.click();
	}

}
