package TestNGPackage1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class AllBrowser {
  @Test
  public void RunThreeBrowserTest () {
	  System.out.println("It's a great way to save time and money");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Don't know it will work or not");
  }
  public static void main (String[] args) throws Exception{
	  Thread.sleep(2000);
	  ChromeBrowser.main(args);
	  FirefoxBrowser.main(args);
	  IEBrowser.main(args);
  }

}
