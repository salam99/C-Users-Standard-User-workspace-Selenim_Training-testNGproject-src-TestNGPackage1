package TestNGPackage1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class sampleTestNG1 {
	  @Test
	  public void addition() {
		  System.out.println("TEP");
	  }
	  
	  @Test
	  public void multiplication() {
		  System.out.println("Learning");
	  }
	  
	  @Test
	  public void sustruction() {
		  System.out.println("Center");
	  }
	  
	  @Test
	  public void division() {
		  System.out.println("Selenium");
	  }
	  
	  @Test
	  public void print() {
		  
		  System.out.println("testNG");
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }
}