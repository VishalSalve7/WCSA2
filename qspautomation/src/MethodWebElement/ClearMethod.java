package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(2000);
		WebElement serachbox = driver.findElement(By.name("q"));
		
		Thread.sleep(2000);
		serachbox.sendKeys("java");	
		
		Thread.sleep(2000);
		serachbox.clear();
		
		
		}

}
