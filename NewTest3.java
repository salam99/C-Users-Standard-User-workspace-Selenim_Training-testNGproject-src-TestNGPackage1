package TestNGPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;

public class NewTest3 {
	
	WebDriver d = new FirefoxDriver();
  @Test
  public void f() {
	  System.out.println("do some test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before test");
	//  WebDriver d = new FirefoxDriver();
	  d.get("http://www.tdbank.com/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("browser close");
	 // WebDriver d = new FirefoxDriver();
	  d.quit();
  }

}
