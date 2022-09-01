package singleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectByVisisbleText {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/Vishal%20Manik%20Salve/Desktop/WCSAHTML/singleselectdropdown.html");
		Thread.sleep(1000);
		WebElement singleselectdropdown= driver.findElement(By.id("menu"));
		Thread.sleep(2000);
		Select sel = new Select(singleselectdropdown);
		sel.selectByVisibleText("dosa");
	
	}

}
