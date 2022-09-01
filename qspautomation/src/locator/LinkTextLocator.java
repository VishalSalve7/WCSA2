package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch flipkart web page
		driver.navigate().to("file:///C:/Users/Vishal%20Manik%20Salve/Desktop/WCSAHTML/flipkartLink.html");
		
		driver.findElement(By.linkText("click here to launch flipkart")).click();
	}

}
