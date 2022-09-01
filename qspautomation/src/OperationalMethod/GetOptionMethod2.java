
package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetOptionMethod2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/Vishal%20Manik%20Salve/Desktop/WCSAHTML/multiselectdropdown.html");
		
		WebElement multiselectedd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiselectedd);
		
		List<WebElement> option = sel.getOptions();
		
		for(WebElement op:option)
		{
			String txt= op.getText();
			System.out.println(txt);
			Thread.sleep(2000);
		}
	
	}

}
