package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		Dimension size = loginbutton.getSize();
		
		System.out.println("size for width = " +size.getWidth());
		System.out.println("size for Height = " +size.getHeight());
	}

}
