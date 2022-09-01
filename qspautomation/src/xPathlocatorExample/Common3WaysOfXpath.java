package xPathlocatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common3WaysOfXpath {
	
	// all 3 ways we are going to use in a single program
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://laptop-3am8behn/login.do");
		
		Thread.sleep(2000);
		
		//way of 1st -> xPath using unique attribute
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		// way of 3rd-> xPath using contains function
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		
		Thread.sleep(2000);
		// ways of 3rd -> xPath using text
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

}
