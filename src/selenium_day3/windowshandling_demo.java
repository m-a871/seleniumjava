package selenium_day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class windowshandling_demo {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  driver.get("http://demo.guru99.com/popup.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.name("emailid")).sendKeys("aravindmca57@gmail.com");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println("url of the page"+driver.getCurrentUrl());
	  driver.close();
	  driver.switchTo().window(parentwindow);
	  System.out.println("PARENT WINDOW TITLE IS"+driver.getTitle());
	  
  }
}