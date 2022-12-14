package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser name");
		String browserValue = sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			Thread.sleep(6000);
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(6000);
			
		}else
		{
			System.out.println("Enter Valid Input");
		}

	}

}
