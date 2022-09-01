package PopupsWindow;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// 2nd way to handle notification popup
		ChromeOptions co = new ChromeOptions();
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		driver.navigate().to("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("confirmBtn")).click();
		
		
		
	}

}
