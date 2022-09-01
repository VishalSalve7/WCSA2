package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//se the chrome driver path 
		new FirefoxDriver();//open firefox browser
	}

}
