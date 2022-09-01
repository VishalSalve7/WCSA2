package xPathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2Syntax2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//h4[contains(text(),'Driver')]")).getText();
		System.out.println(text);
		
	}

}
