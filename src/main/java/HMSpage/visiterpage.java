package HMSpage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMSbase.testbase;
import HMSutil.Datepicker;
import HMSutil.commonUtility;

public class visiterpage extends testbase{
	Datepicker datutil=new Datepicker();
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3") WebElement visiterpgeName;
	@FindBy(xpath ="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a" ) WebElement addvisiterclick;
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[1]/h4") WebElement title;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div[1]/div[1]/div[2]/div/input") WebElement name;	
	//@FindBy(className="form-control") WebElement name;
	//driver.findElement(By.cssSelector("input.form-username.form-control")).sendKeys("hi");
	//@FindBy(className="form-control") WebElement phoneno;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div[1]/div[2]/div[1]/div/input") WebElement phoneno;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[2]/div[2]/div/input") WebElement IDcard;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div[1]/div[3]/div[1]/div/input") WebElement NOofperson;
	@FindBy(xpath="//*[@id=\"description\"]") WebElement notes;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div[1]/div[1]/div[1]/div/select") WebElement purpose;
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]/div[6]/div/div/input") WebElement el;
	@FindBy(xpath = "//*[@id=\"date\"]") WebElement datepicker;
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[2]/button") WebElement savebtn;
	
	
	
	
	public visiterpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean visiterpagename()
	{
		return visiterpgeName.isDisplayed();
		
	}
	public void addvisclick()
	{
		waitforElementvisible(addvisiterclick);
		addvisiterclick.click();
	}
	
	public boolean addtitle()
	{
		
		waitforElementvisible(title);
		return title.isDisplayed();
	}
	



	
	public void clickaddvisiter(String data[])
	{
		purpose.click();
		  Select drp=new Select(purpose);
		    drp.selectByVisibleText(data[0]);
		name.sendKeys(data[1]);
		phoneno.sendKeys(data[2]);
		IDcard.sendKeys(data[3]);
		NOofperson.sendKeys(data[4]);
		datepicker.click();
		datutil.datpicker(data[5]);
		notes.sendKeys(data[6]);
		
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   // WebElement sdrp=d.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/select[1]"));
		  
		    
		   // el.click();
		  commonUtility.mouseclick(el);
		    commonUtility.upload();
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    savebtn.click();
		    
	}

}
