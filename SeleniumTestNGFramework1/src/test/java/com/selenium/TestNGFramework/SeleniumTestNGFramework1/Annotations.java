package com.selenium.TestNGFramework.SeleniumTestNGFramework1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base {
	@Test
	public void testSample() {
		System.out.println("test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("test case 2");
	}

	@BeforeMethod
	public void beforeMethodSample() {
		System.out.println("@before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
}
