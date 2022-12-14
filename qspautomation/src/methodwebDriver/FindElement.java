package methodwebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		WebElement addressOfWebElement = driver.findElement(By.id("txtUsername"));
		
		System.out.println("Address on webelement:" +addressOfWebElement);
		
		addressOfWebElement.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		addressOfWebElement.clear();
	}

}
