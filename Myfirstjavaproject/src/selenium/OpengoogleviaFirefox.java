package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpengoogleviaFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//name and location of the browser
		//define browser and obtain the site url
		//quit the browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//firefox browser version issues being fixed with the below code from line 19 to 27
		//DesiredCapabilities capabilities = new DesiredCapabilities();

		 //capabilities = DesiredCapabilities.firefox();
		 //capabilities.setBrowserName("firefox");
		 //capabilities.setVersion("your firefox version");
		 //capabilities.setPlatform(Platform.WINDOWS);
		 //capabilities.setCapability("marionette", false);
		
		//WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		//driver.quit();
	}

}
