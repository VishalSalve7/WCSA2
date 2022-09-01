package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://laptop-3am8behn/login.do");
		
		// in partialLinkText Method don't need to be a write all text over in partialLinkText String
		//just need to be write a  word which is static 
		driver.findElement(By.partialLinkText("License ")).click();
	}

}
