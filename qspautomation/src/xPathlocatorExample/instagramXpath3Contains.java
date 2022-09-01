package xPathlocatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramXpath3Contains {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Vishal");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("vishal123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]")).click();
	}

}
