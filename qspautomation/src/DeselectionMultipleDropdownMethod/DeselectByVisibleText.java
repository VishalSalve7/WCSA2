package DeselectionMultipleDropdownMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DeselectByVisibleText {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/Vishal%20Manik%20Salve/Desktop/WCSAHTML/multiselectdropdown.html");
		
		WebElement multiselectedd = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiselectedd);
		
		
		sel.selectByValue("v1");
		Thread.sleep(2000);
		sel.deselectByVisibleText("poha");
	
	}

}
