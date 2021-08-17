package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +
				"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		//String browser = System.getProperty("browser");
		
		if(browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Selenium WebDriver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browser.contains("headless"))
				options.addArguments("headless");
			driver = new ChromeDriver(options);
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\Selenium WebDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}