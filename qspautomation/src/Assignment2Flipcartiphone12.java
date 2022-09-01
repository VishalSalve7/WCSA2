
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Flipcartiphone12 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone12");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='_4rR01T' and .='APPLE iPhone 12 (Purple, 64 GB)']")).click();
		
		
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		
		
		driver.findElement(By.id("pincodeInputId")).sendKeys("411017");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		driver.findElement(By.xpath("//div[.='Remove']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		/*
		 * //driver.findElement(By.
		 * xpath("//li[@class='_3V2wfe' and @id='swatch-1-color']")).click();
		 * 
		 * 
		 * driver.findElement(By.xpath("//a[.='256 GB']")).click();
		 * 
		 * Thread.sleep(1000);
		 * driver.findElement(By.id("pincodeInputId")).sendKeys("411017");
		 * 
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).
		 * click();
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[@class='_3dsJAO' and .='Remove']")).click(
		 * );
		 * 
		 * 
		 */		
		
	}

}
