package Takesscrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenshotAsWay3 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit Wait is used for only findElement() and findElements() method 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		driver.navigate().to("https://www.selenium.dev/");
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/screenshot3.jpg");
		Files.copy(src, dest);

	}
	
	
}
