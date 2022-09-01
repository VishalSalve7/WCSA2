package xPathlocatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2Of1XPathUingText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.selenium.dev/");
		
		String text = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']")).getText();
		System.out.println(text);
		String text2 = driver.findElement(By.xpath("//h4[.='Selenium IDE']")).getText();
		System.out.println(text2);
		
	}

}
