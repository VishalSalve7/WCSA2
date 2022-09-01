package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorShortCut1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//first shortcut of cssSelector with matching starting text with attribute value
		driver.findElement(By.cssSelector("input[id^='txtUs']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		//second shortcut of cssSelector with matching ending text with attribute value
		driver.findElement(By.cssSelector("input[id$='ssword']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		//Third shortcut of cssSelector with matching in-between text with attribute value
		driver.findElement(By.cssSelector("input[id*='nLog']")).click();
		
	}
	

}
