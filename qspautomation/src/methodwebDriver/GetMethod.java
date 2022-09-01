package methodwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/webdriver.exe");//set the path for compiler so that we avoid the illegalstateException
		WebDriver driver=new ChromeDriver();//to launch the Chrome
		driver.manage().window().maximize();//to maximize the browser
		driver.get("https://www.gmail.com");// to launch the web application
		Thread.sleep(5000);//stop or delay the browser for 5 seconds
		
		
	}

}
