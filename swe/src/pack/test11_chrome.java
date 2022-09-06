package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class test11_chrome {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\shabs_new\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.amazon.in");
  }
 

}
