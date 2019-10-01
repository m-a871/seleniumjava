package selenium_day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class browser {
	
	WebDriver driver=null;
	
  @Test
  public void BrowserLaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}
