package ActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DragAndDropActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit Wait is used for only findElement() and findElements() method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement src = driver.findElement(By.xpath("//a[@class='button button-orange' and .=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();;

	}
}
