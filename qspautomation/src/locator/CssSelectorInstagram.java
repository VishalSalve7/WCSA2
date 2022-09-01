package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorInstagram {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("vishal");
		driver.findElement(By.name("password")).sendKeys("wrongpassword");
		
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
	}

}
