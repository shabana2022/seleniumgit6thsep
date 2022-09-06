package pack;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	public String baseUrl="http://demo.guru99.com/test/newtours/";
	String driverPath = "D:\\shabs_new\\geckodriver-v0.26.0-win32\\geckodriver.exe";				
	public WebDriver driver ; 
	
	 @Test
	    public void verifyHomepageTitle() {
		 System.setProperty("webdriver.gecko.driver",driverPath);
	      FirefoxDriver driver = new FirefoxDriver();
	      driver.get("http://demo.guru99.com/test/newtours/");
	      String expectedTitle = "Welcome: Mercury Tours1234";
	        String actualTitle=" ";
	        actualTitle= driver.getTitle();
	        System.out.println("actualTitle"+actualTitle);
	       Assert.assertEquals(actualTitle, expectedTitle);
	   }
	 
 
   @AfterTest
    public void terminateBrowser(){
    //    driver.close();
    }

    }