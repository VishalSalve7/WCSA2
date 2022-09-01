package StaleException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActiTimeLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-3am8behn/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		driver.navigate().refresh();
		username.sendKeys("admin");//username hold the old address of WebElement.
//		so after navigational operation such as refersh then change the address of
//		webElement username webElement is not finding due to address changes. 
//		so it will be give the stale element reference exception or old.
//		so avoid this exception we will go for Page Object Model(POM).
//		if we are not using navigational operation such as refresh(line no 19) then 
//		this script will be working properly.
	}

}
