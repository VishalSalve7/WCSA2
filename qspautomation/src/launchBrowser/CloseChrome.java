package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//to  open the chrome browser
		Thread.sleep(6000);//stop the chorme for 6 sec
		driver.close();//close the browser
	}

}
