package utils;

import java.awt.SecondaryLoop;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class browser_management {
	public static  WebDriver getdriver (String type, String url) throws InterruptedException{
		WebDriver d = null;

		if( type.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver",( System.getenv("GECKO_DRIVER")));
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities. setCapability("marionette",true);
			FirefoxOptions options=new FirefoxOptions();
			//options.addArguments("--headless"); 
			d = new FirefoxDriver(options);
		}
		else if ( type.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandz\\git\\posiboltselenium\\testng\\drvers\\chrome\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--headless");
			//d = new ChromeDriver(chromeOptions);
		}
		else if ( type.equalsIgnoreCase("SAFARI"))
		{
			System.setProperty("webdriver.Safari.driver",( System.getenv("safaridriver")));
			//d= new SafariDriver();	
		}
		else 
		{
			Assert.assertFalse(false, "NO BROWSER TYPE SENT");
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get(url);
		return d;

	}
}
