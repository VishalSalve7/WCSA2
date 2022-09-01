package xPathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2XPath {
	
	// xPath Using Text for Selenium WebDriver
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']"));
		
		//xPath using text for orangeHrm
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']"));
	
	}

}
