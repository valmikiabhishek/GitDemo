package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Android {

	public WebDriver driver;
	private By operatingsystem = By.id("doc-os-trigger");
	private By android = By.cssSelector("[data-os='android']");
	private By device = By.id("doc-device-trigger");
	private By andriodmodel = By.xpath("//a[@data-device-name='Galaxy S21']");
	private By data = By.cssSelector("[class='custom-ordered']");
		
	public Android(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getAndroid()
	{
		driver.findElement(operatingsystem).click();
		return driver.findElement(android);
	}
	public WebElement getAndriodModel()
	{
		driver.findElement(device).click();
		return driver.findElement(andriodmodel);
	}
	public WebElement getData()
	{
		return driver.findElement(data);
	}
	
}
