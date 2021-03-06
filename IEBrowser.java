package TestNGPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class IEBrowser {
	public static WebDriver driver;
  @Test(priority =1)
  public void websiteTest() {
	  System.out.println("This is the Webloadmpstore test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before the test start");
	  System.out.println("Before open the browser");
	  System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Selenium\\IE\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.manage().window().maximize();
  }
  @Test(priority =2)
  public void landing_page() throws Exception{
 	driver.get("http://webloadmpstore.com");
 	 Thread.sleep(2000);
 	driver.findElement(By.linkText("LOGIN")).click();
 	driver.findElement(By.linkText("Register")).click();
 }
 @Test(priority = 3)
 public static void registrationInfo(){
 	  driver.findElement(By.name("name")).sendKeys("Salam");
 	  driver.findElement(By.name("email")).sendKeys("salam@yahoo.com");
 	  driver.findElement(By.name("phone")).sendKeys("973-000-0000");
 	
 	  driver.findElement(By.name("login")).sendKeys("salam92");
 	  driver.findElement(By.name("password")).sendKeys("found1");
 	  driver.findElement(By.name("password2")).sendKeys("found1");
 	  driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[11]/td/input")).click();
 	  System.out.println("Registration is complete - Thank you for registration");  
 }


 @Test(priority = 4)
 public static void appclose() throws Exception{
 	  Thread.sleep(5000);
 	  driver.quit();
 	 }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
}

 }
