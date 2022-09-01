package methodwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://placements.qspider.com/");
		String titleOfWebpage = driver.getTitle();
		System.out.println("titleOfWebpage");
		Thread.sleep(5000);
		
		
	}

}
