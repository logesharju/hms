package HMSpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMSbase.testbase;

public class frontoffice extends testbase {
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3") WebElement frontpagename;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[2]") WebElement visbook;
//	@FindBy(className = "btn btn-primary btn-sm") WebElement visbook;
	public frontoffice()
	{
		PageFactory.initElements(driver, this);
	}
    public String validatefrontpage()
    {
		return driver.getTitle();
    	
    }
    public boolean frontpage1()
    {
    	return frontpagename.isDisplayed();
    }
    public visiterpage clickkvisbook()
    {
    	visbook.click();
		return new visiterpage();
    }
    
}
