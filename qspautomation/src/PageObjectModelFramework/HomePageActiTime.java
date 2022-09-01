package PageObjectModelFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageActiTime {
	
	//1.Declaration
	@FindBy(name="usersSelector.selectedUser") private WebElement EnterTimeTrackDropDown;
	@FindBy(xpath="//a[contains(text(),'tasks')]") private WebElement newTask;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTime;
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logout;
	
	//3.inialization
	public HomePageActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//2. utilization(setter to use the private member)
	
	public WebElement getEnterTimeTrackDropDown() {
		return EnterTimeTrackDropDown;
	}
	public WebElement getNewTask() {
		return newTask;
	}
	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	//operational method(busienss logic)

}
