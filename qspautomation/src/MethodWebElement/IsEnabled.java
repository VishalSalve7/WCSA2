package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		
		WebElement buttonEnabled = driver.findElement(By.cssSelector("button[class *='L3NKy   ']"));
		
		System.out.println(buttonEnabled.isEnabled());
	}

}
