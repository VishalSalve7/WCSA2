package AssignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorDivision{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the web application
		driver.navigate().to("https://www.calculator.net/");
		Thread.sleep(2000);
		
		//click on 1
		driver.findElement(By.xpath("//span[.='1']")).click();
		Thread.sleep(2000);
		
		//click on 2
		driver.findElement(By.xpath("//span[.='2']")).click();
		Thread.sleep(2000);
		
		//click on 0
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(2000);
		
		////click on / operator
		driver.findElement(By.xpath("//span[.='/']")).click();
		
		
		//click on 1
		driver.findElement(By.xpath("//span[.='1']")).click();
		Thread.sleep(2000);
		
		//click on 2
		driver.findElement(By.xpath("//span[.='2']")).click();
		Thread.sleep(2000);
		
		
		//get the text and give to subtraction variable and print subtraction variable 
		String division = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(division);
	}

}
