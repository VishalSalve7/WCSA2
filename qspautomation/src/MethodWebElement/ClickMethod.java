package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[.='Electronics' and @class='xtXmba']")).click();
		
		// or we can write like that
		WebElement clickMethod = driver.findElement(By.xpath("//div[.='Electronics' and @class='xtXmba']"));
		clickMethod.click();
	}
	

}
