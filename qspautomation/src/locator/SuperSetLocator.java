package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperSetLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://app.joinsuperset.com/#/s/feed");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("salvevishal7070@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("VishalSet@123");
		Thread.sleep(3000);
	}
}
