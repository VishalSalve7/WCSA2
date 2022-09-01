package PracticeWebDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) {

		//set The path For compiler to find out the chromdriver.exe file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launch the ChromeDriver
		WebDriver driver=new ChromeDriver();

		//use manage method for maximize the browser
		driver.manage().window().maximize();

		//use the get method for launching
		driver.get("https://www.selenium.dev/");
		
		//use setPosition to set the Position of browser
		Point targetPosition = new Point(250, 250);
		driver.manage().window().setPosition(targetPosition);

		//use getCurrentUrl method for 
		String url = driver.getCurrentUrl();
		System.out.println(url);

		//use the getPageSouceMethod for getting a souce code of current page
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);

		//use the switchTo method is switch the control for activeElements
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);

		// use the navigate method to launch the web page by using To() method
		driver.navigate().to("https://www.selenium.dev/");

		//use close method for closing the parent browser
		driver.close();

		//use the quit method for closes both child as well as parent browser
		driver.quit();

	}

}
