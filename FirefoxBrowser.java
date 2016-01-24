package TestNGPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;



public class FirefoxBrowser {
 
	public static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	 System.out.println("Before the test"); 
	  System.out.println("Open the Browser");
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://webloadmpstore.com");
  }
	  @Test(priority =1)
	  public void Landing_Page() throws Exception{
		  System.out.println("This is first test");
		  driver.findElement(By.linkText("LOGIN")).click();
		 // Thread.sleep(3000);
		  
	  }
	  
	 
	@Test(priority = 2)
	  public static void register(){
		  System.out.println("Registration Page Open");
		  driver.findElement(By.linkText("Register")).click();
		  
		  //driver.findElement(By.name("name")).sendKeys("Salam");
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
