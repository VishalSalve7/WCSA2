package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid illegal state exception
		ChromeDriver driver = new ChromeDriver();//open the browser
		
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.gmail.com");//open to the gmail
		
		Thread.sleep(5000);//stop the browser for 5 seconds
		
		driver.close();
		
		
	}

}
