package MethodWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com");

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);

		Thread.sleep(2000);

		String txt = driver.findElement(By.xpath("//h3[ .='Java | Oracle' and @class='LC20lb MBeuO DKV0Md']")).getText();
		
		System.out.println(txt);
	}


}
