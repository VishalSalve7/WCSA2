package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWaitImplicit {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Implicit Wait is used for only findElement() and findElements() method 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("http://laptop-3am8behn/login.do");
		
		String actiTimePageTitle = driver.getTitle();
		
		if(actiTimePageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login Page Of ActiTime is Verified | Test Case is Passed");
		}else
		{
			System.out.println("Login Page Of ActiTime is Not Verified | Test Case is Failed");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

}
