package HMSpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMSbase.testbase;

public class loginpage extends testbase{
	
	@FindBy(css="input#email")WebElement uname;
	@FindBy(css="input#password")WebElement upass;
	@FindBy(tagName="img")WebElement HMSlogo;
	@FindBy(linkText="Forgot Password?")WebElement fpass;
	@FindBy(className="btn")WebElement lbttn;
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	public String validateloginpage() {
		return driver.getTitle();
		
	}
	public boolean validatelogo()
	{
		return HMSlogo.isDisplayed();
	}
	public homepage login(String username,String password)
	
	{
	uname.sendKeys(username);
	upass.sendKeys(password);
	lbttn.click();
		return new homepage();
	}
}
