package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithEditboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement Emailaddress = driver.findElement(By.id("email"));
		Emailaddress.sendKeys("test@abc.com");
		
		
		WebElement appendTextbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendTextbox.sendKeys("Testing");
		
		WebElement getTextvalue = driver.findElement(By.name("username"));
		String Textvalue = getTextvalue.getAttribute("value");
		System.out.println(Textvalue);
		
		WebElement cleartextbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		cleartextbox.clear();
		
		
		WebElement Textbox_enable =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		
		//boolean Textbox_enable =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).isEnabled();
		
		boolean enabled = Textbox_enable.isEnabled();
		System.out.println(enabled);
		
		
		driver.quit();
				
	}

}
