package AssignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculatorsubtraction{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the web application
		driver.navigate().to("https://www.calculator.net/");
		Thread.sleep(2000);
		
		//click on 7
		driver.findElement(By.xpath("//span[.='7']")).click();
		Thread.sleep(2000);
		
		//click on 8
		driver.findElement(By.xpath("//span[.='8']")).click();
		Thread.sleep(2000);
		
		//click on 9
		driver.findElement(By.xpath("//span[.='9']")).click();
		Thread.sleep(2000);
		
		////click on - operator
		driver.findElement(By.xpath("//span[.='–']")).click();
		
		
		//click on 4
		driver.findElement(By.xpath("//span[.='4']")).click();
		Thread.sleep(2000);
		
		//click on 5
		driver.findElement(By.xpath("//span[.='5']")).click();
		Thread.sleep(2000);
		
		//click on 6
		driver.findElement(By.xpath("//span[.='6']")).click();
		Thread.sleep(2000);
		
		
		//get the text and give to subtraction variable and print subtraction variable 
		String substraction = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(substraction);
	}

}
