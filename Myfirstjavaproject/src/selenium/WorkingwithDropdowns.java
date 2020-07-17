package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//select dropdown value using index
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select ddselect = new Select(Dropdown1);
		ddselect.selectByIndex(1);
		//Thread.sleep(3000);
		
		//select dropdown value using text
		ddselect.selectByVisibleText("Appium");
		//Thread.sleep(3000);
		
		//select dropdown value using value
		ddselect.selectByValue("3");
		
		//Get the number of dropdown values
		List<WebElement> ddlist = ddselect.getOptions();
		int ddsize = ddlist.size();
		
		System.out.println("Dropdown size is: " +ddsize);
		
		//Get the values from the dropdown and print
		
		String DList0 = ddlist.get(0).getText();
		String DList1 = ddlist.get(1).getText();
		String DList2 = ddlist.get(2).getText();
		String DList3 = ddlist.get(3).getText();
		String DList4 = ddlist.get(4).getText();
		System.out.println("Dropdown values are: " +DList0+", "+DList1+","+DList2+","+DList3+","+DList4);
		
		
		//use send-keys to select the dropdown value
		Dropdown1.sendKeys("Loadrunner");
		
		//select values using multi-select
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock']/section/div[6]/select"));
		Select MultiSelectbox = new Select(multiselect);
		MultiSelectbox.selectByIndex(1);
		MultiSelectbox.selectByIndex(2);
		MultiSelectbox.selectByIndex(4);
		
	}

}
