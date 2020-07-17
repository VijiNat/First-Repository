package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		
		//alertbox with ok button
		WebElement Alertbutton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		Alertbutton.click();
		
		Alert alertOKbutton = driver.switchTo().alert();
		alertOKbutton.accept();
		
		//confirm box with ok and cancel
		WebElement Confirmboxbutton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		Confirmboxbutton.click();
		
		Alert alertConfirmbox = driver.switchTo().alert();
		//alertConfirmbox.accept();
		alertConfirmbox.dismiss();
		
		//prompt box
		WebElement promptbutton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbutton.click();
		
		Alert alertpromptbox = driver.switchTo().alert();
		alertpromptbox.sendKeys("Peacock");
		
		//Thread.sleep(3000);
		alertpromptbox.accept();
		
				

	}

}
