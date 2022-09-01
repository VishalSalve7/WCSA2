package AssignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorAddition {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.calculator.net/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='+']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='=']")).click();
		Thread.sleep(2000);
		
		String addition = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		Thread.sleep(2000);
		System.out.println("The addition answer is:"+addition);
		
	}

}
