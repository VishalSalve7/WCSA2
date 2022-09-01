package AssignmentOnXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopFiltersUsingXpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch flipkart
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//close pop up window
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		
		//enter on search box as laptop
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptops");
		Thread.sleep(3000);
		
		//select search button
		driver.findElement(By.xpath("//Button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		//select processor
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		
		//select brand drop down
		driver.findElement(By.xpath("//div[.='Brand' and @class='_213eRC _2ssEMF']")).click();
		Thread.sleep(3000);
		
		//select brand
		driver.findElement(By.xpath("//div[.='HP' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Operating System']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();
		Thread.sleep(3000);
		
		
		String laptopPriceOfFirstSuggeston = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).getText();
		Thread.sleep(3000);
		System.out.println("The first suggestion of Laptop price is:"+laptopPriceOfFirstSuggeston);
		
	}

}
