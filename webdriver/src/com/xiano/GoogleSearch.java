package com.xiano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class GoogleSearch {

	protected WebDriver driver;
    protected WebDriverBackedSelenium selenium;

    @BeforeClass
	public void init() {
		driver = new FirefoxDriver();
	}

	@Test
	public void helloWorld() throws InterruptedException {
		String testPageUrl = "http://www.google.com";
		String searchTerm = "webdriver hello world";
		driver.get(testPageUrl);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchTerm);
		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		assertTrue("searech term not found in the title of the serch result page. got ["+ title+"]", title.contains(searchTerm));
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
