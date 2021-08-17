package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mac {

	public WebDriver driver;
	private By operatingsystem = By.id("doc-os-trigger");
	private By browser = By.id("doc-browser-trigger");
	private By mac = By.xpath("//a[@data-os='maccat']");
	private By macfoxversion = By.xpath("//div[contains(@class,'Firefox')]//a[@data-browser-version='89.0']");
	private By data = By.cssSelector("[class='custom-ordered']");
		
	public Mac(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getMac()
	{
		driver.findElement(operatingsystem).click();
		return driver.findElement(mac);
	}
	public WebElement getMacBrowserVersion()
	{
		driver.findElement(browser).click();
		return driver.findElement(macfoxversion);
	}
	public WebElement getData()
	{
		return driver.findElement(data);
	}
	
}
