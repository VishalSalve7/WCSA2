package methodwebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//("webdriver.chrome.driver\", \"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("bike");
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		//By Using For Each Loop
		for(int i=0;i<suggestion.size();i++)
		{
			WebElement sugg = suggestion.get(i);
			String textOfSuggestion = sugg.getText();
			Thread.sleep(2000);
			System.out.println(textOfSuggestion);
		}
		
		
		
	}

}
