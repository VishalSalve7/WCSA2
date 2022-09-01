package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		Point point = loginbutton.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		System.out.println("The Placement of LOGIN Butoon is as follow");
		System.out.println("the xaxis distance is = " +xaxis);
		System.out.println("The yaxis distance = " +yaxis);
		
	}

}
