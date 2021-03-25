package HMSbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HMSutil.WebEventListener;

public class testbase {
public static WebDriver driver;
public	static Properties pop;
public static EventFiringWebDriver e_driver;
public static WebEventListener webel;

WebDriverWait wait ;
	public testbase()
	{
		pop=new Properties();
		try {
			FileInputStream ipconfig=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/HMSconfig/hms.properties");
			pop.load(ipconfig);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialization()
	{
		String browsername=pop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");	
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get(pop.getProperty("url"));
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//Firing event 
		//Firing event 
	    e_driver=new EventFiringWebDriver(driver);
	    webel=new WebEventListener();
	    e_driver.register(webel);
	    driver=e_driver;
	
	}
	  public void waitforElementvisible(WebElement el)
	  {
	    wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(el));
	  }
	        

}
 