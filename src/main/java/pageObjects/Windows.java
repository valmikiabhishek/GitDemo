package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windows {

	public WebDriver driver;
	private By operatingsystem = By.id("doc-os-trigger");
	private By windows = By.xpath("//a[@data-os='win8.1']");
	private By browser = By.id("doc-browser-trigger");
	private By winchromversion = By.xpath("//div[contains(@class,'Chrome')]//a[@data-browser-version='91.0']");
	private By data = By.cssSelector("[class='custom-ordered']");
		
	public Windows(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getWindows()
	{
		driver.findElement(operatingsystem).click();
		return driver.findElement(windows);
	}
	public WebElement getWindowsBrowserVersion()
	{
		driver.findElement(browser).click();
		return driver.findElement(winchromversion);
	}
	public WebElement getData()
	{
		return driver.findElement(data);
	}
	
}
