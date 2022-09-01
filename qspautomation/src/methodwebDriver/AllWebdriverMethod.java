package methodwebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebdriverMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		Dimension targetSize = new Dimension(700,700);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(3000);

		Point targetPosition = new Point(390, 150);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.goggle.com");
		Thread.sleep(3000);
		
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
