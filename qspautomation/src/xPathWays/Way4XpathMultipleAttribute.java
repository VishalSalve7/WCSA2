package xPathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way4XpathMultipleAttribute {
	
	public static void main(String[] args) {
		
		//a[contains(@class,'webdriver')]
		//a[contains(@class,'ide')]
		//a[contains(@class,'grid')]
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//a[contains(@class,'webdriver') or contains(@class,'ide') or contains(@class,'grid')]  "));
		
	}

}
