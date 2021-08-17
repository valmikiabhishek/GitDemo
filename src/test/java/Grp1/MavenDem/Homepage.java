package Grp1.MavenDem;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.*;
import resources.Base;

public class Homepage extends Base
{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		wait = new WebDriverWait(driver, 10);

	}

	@Test
	public void loadingAndroid()
	{
		Android android = new Android(driver);
		android.getAndroid().click();
		android.getAndriodModel().click();
		//wait.until(ExpectedConditions.text)
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='custom-ordered']"),
				"Samsung Galaxy S21"));
		String data = android.getData().getText();
		System.out.println(data);
		boolean conditon = false;
		if(data.contains("Samsung Galaxy S21"))
			conditon = true;
		Assert.assertTrue(conditon);
		
	}

	@Test
	public void loadingIPhone()
	{
		IPhone iphone = new IPhone(driver);
		iphone.getIos().click();
		iphone.getIOSModel().click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='custom-ordered']"),
				"iPhone 12 Pro Max"));
		String data = iphone.getData().getText();
		System.out.println(data);
		boolean conditon = false;
		if(data.contains("iPhone 12 Pro Max"))
			conditon = true;
		Assert.assertTrue(conditon);
		
	}

	@Test
	public void loadingWindows()
	{
		Windows windows = new Windows(driver);
		windows.getWindows().click();
		windows.getWindowsBrowserVersion().click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='custom-ordered']"),
				"Chrome"));
		String data = windows.getData().getText();
		System.out.println(data);
		boolean conditon = false;
		if(data.contains("Windows") && data.contains("8.1") && data.contains("Chrome") && data.contains("91.0"))
			conditon = true;
		Assert.assertTrue(conditon);
		
	}

	@Test
	public void loadingMac()
	{
		Mac mac = new Mac(driver);
		mac.getMac().click();
		mac.getMacBrowserVersion().click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='custom-ordered']"),
				"Firefox"));
		String data = mac.getData().getText();
		System.out.println(data);
		boolean conditon = false;
		if(data.contains("Catalina") && data.contains("Firefox") && data.contains("89.0"))
			conditon = true;
		Assert.assertTrue(conditon);
		
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
