package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("vishal");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("qwerty");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class *='L3NKy   ']")).submit();
		Thread.sleep(2000);
	}

}
