package PageObjectModelFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//int this class we have to write the script for all the webelement which is present on login page. 

public class ActiTimeLoginPage {
	
		//1. Declartion
		@FindBy(name="username") private WebElement usn;//for user
		@FindBy(name="pwd") private WebElement pass;//for password
		@FindBy(id="loginButton") private WebElement loginButton;//for loginButton
		@FindBy(id="keepLoggedInCheckBox") private WebElement CheckBox;//for click checkBox
		@FindBy(xpath="//a[contains(text(),'Actimind')]")private WebElement linkActiTime;
		@FindBy(xpath="//a[contains(text(),'License ')]") private WebElement License; 
		@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logout;
		
		
		
		
		//3.Initilization
		
		public ActiTimeLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);//pageFactory is a class
			//and initElements is a static method of this class
			//it is used to tell the FindBy method go and search the address of webelement.  
		}
		
		
		//2.utilization(setter to use the private member)
		public WebElement getUsn() {
			return usn;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		public WebElement getCheckBox() {
			return CheckBox;
		}
		public WebElement getLinkActiTime() {
			return linkActiTime;
		}
		public WebElement getLicense() {
			return License;
		}
		public WebElement getLogout() {
			return logout;
		}
		
		//4.Operational Method(Business Logic)
		
		public void ValidLoginActiTime(String username,String password) throws InterruptedException
		{
			usn.sendKeys(username);
			pass.sendKeys(password);
			Thread.sleep(2000);
			loginButton.click();
		}
		
		public void InvalidLoginActiTime(String username,String password) throws InterruptedException
		{
			usn.sendKeys(username);
			pass.sendKeys(password);
			loginButton.click();
			Thread.sleep(3000);
			usn.clear();
		}
	

}
