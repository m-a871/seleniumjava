package selenium_day3;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void Register() {
	  System.out.println("register method");
  }
  @Test(priority=2,enabled=false)
  public void Login() {
	  System.out.println("login method");
  }
  @Test(priority=3)
  public void Logout() {
	  System.out.println("logout method");
  }
}
