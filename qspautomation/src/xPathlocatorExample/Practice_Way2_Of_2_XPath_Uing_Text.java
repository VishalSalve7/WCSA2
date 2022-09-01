package xPathlocatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Way2_Of_2_XPath_Uing_Text {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.selenium.dev/");
		
		String text3 = driver.findElement(By.xpath("//h4[contains(text(),'Grid')]")).getText();
		System.out.println(text3);
		
		
	}

}
