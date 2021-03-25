package HMSpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMSbase.testbase;

public class homepage extends testbase {
	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/a/img") WebElement btn;
	//@FindBy(className="dropdown user-menu") WebElement btn;
	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[2]/h4") WebElement text;
	//@FindBy(css = "#sibe-box > ul.sidebar-menu.verttop > li.treeview.active > a > span") WebElement frontofficebrnp;
	
	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a/span")WebElement frontoffclick;
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	public String validatehomepage()
	{
		return driver.getTitle();
	}
	public boolean homepage1()
	{
		btn.click();
		return text.isDisplayed();
	}
	public frontoffice clickfrontoffice()
	{
		frontoffclick.click();
		return new frontoffice();
	}
	
}
