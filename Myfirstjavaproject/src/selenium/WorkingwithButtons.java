package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		WebElement Position = driver.findElement(By.id("position"));
		Point buttonPosition = Position.getLocation();
		int xPosition = buttonPosition.getX();
		int yPosition = buttonPosition.getY();
		System.out.println(buttonPosition);
		System.out.println("The X position of the button is: "+xPosition);
		System.out.println("The Y position of the button is: "+yPosition);

		WebElement buttoncolor = driver.findElement(By.id("color"));
		String BGcolor = buttoncolor.getCssValue("background-color");
		System.out.println("The button color is :" +BGcolor);

		WebElement Buttonsize = driver.findElement(By.id("size"));
		int ButtonHeight = Buttonsize.getSize().getHeight();
		int ButtonWidth = Buttonsize.getSize().getWidth();
		System.out.println("The Height of the button is: "+ButtonHeight);
		System.out.println("The Width of the button is: "+ButtonWidth);

		WebElement ButtonClick = driver.findElement(By.id("home"));
		ButtonClick.click();

		//driver.quit();

	}

}
