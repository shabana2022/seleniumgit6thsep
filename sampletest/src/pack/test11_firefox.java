package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test11_firefox {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\shabs_new\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.amazon.in");
  }
}
