package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		Rectangle rect = loginbutton.getRect();
		
		System.out.println("Rect Method get the all following parameter ");
		
		System.out.println("Width of loggin button" +rect.getWidth());
		System.out.println("height of loggin button" +rect.getHeight());
		System.out.println("Location from xasis" +rect.getX());
		System.out.println("Location from yasis" +rect.getY());
		
		
	}

}
