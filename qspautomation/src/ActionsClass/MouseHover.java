package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.navigate().to("https://www.bluestone.com/");
		
		driver.findElement(By.id("confirmBtn")).click();
		
		Actions act = new Actions(driver);
		WebElement allJewellery = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		act.moveToElement(allJewellery).perform();
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
