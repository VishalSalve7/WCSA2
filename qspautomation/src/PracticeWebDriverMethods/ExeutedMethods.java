package PracticeWebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExeutedMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("https://www.google.com/");

		driver.navigate().to("https://www.google.com/");


		//		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);

		//		String htmlcode = driver.getPageSource();
		//		System.out.println(htmlcode);

		//		String url = driver.getCurrentUrl();
		//		System.out.println(url);

		//		Point targetPosition = new Point(350, 250);
		//		driver.manage().window().setPosition(targetPosition);

		//		Dimension targetSize=new Dimension(400, 400);
		//		driver.manage().window().setSize(targetSize);

		//		driver.close();
		//		driver.quit();
	}

}
