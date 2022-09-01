package methodwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal%20Manik%20Salve/Desktop/WCSAHTML/checkbox.html");
		
		 String htmlsourcecode1 = driver.getPageSource();
		 System.out.println(htmlsourcecode1);
	}

}
