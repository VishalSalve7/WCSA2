package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();//open the browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(5000);
		driver.close();
	}

}
