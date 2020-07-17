package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement firstcheckbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		firstcheckbox.click();
		
		WebElement Selchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		Boolean SeleniumCBstatus = Selchecked.isSelected();
		System.out.println("Status of the Selenium checkbox is: "+SeleniumCBstatus);
		
		WebElement firstCB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		WebElement secondCB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		Boolean firstCBstatus = firstCB.isSelected();
		Boolean secondCBstatus = secondCB.isSelected();
		System.out.println(firstCBstatus);
		System.out.println(secondCBstatus);
		
		if(firstCBstatus == true) {
			firstCB.click();
		}
		if(secondCBstatus == true) {
			secondCB.click();
		}
		
		//driver.quit();
		
	}

}
