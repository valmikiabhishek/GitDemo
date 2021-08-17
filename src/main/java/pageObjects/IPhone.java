package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IPhone {

	public WebDriver driver;
	private By operatingsystem = By.id("doc-os-trigger");
	private By ios = By.cssSelector("[data-os='ios']");
	private By device = By.id("doc-device-trigger");
	private By iosmodel = By.xpath("//a[@data-device-name='iPhone 12 Pro Max']");
	private By data = By.cssSelector("[class='custom-ordered']");
		
	public IPhone(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getIos()
	{
		driver.findElement(operatingsystem).click();
		return driver.findElement(ios);
	}
	public WebElement getIOSModel()
	{
		driver.findElement(device).click();
		return driver.findElement(iosmodel);
	}
	public WebElement getData()
	{
		return driver.findElement(data);
	}
	
}
