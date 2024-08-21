package Admin_Portal;

import org.seleniumhq.jetty9.util.log.LoggerLog;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonTests.CommonTests1; 
//this class not able to extend with commontest1
//even though it is in the same class because of in correct inheritance concept
//we have try to extend the base test in commontest1 class
//but the base test class is in another project so it through error in commontest1
//we have extended the commontest1 here even though it has error 
//that causes the error here because of the incorrect access
 public class AdminPortalTest1 extends CommonTests1  {

  @Test
  public void Scenario1() {
	  
	   String Methodname = new Object(){}.getClass().getEnclosingMethod().getName(); 
	
		try {
			
			String Classname = getClass().getSimpleName();
            System.out.println("start of method : " + Classname);
            loginasAdmin();
            TestCase1();// testcase 2 missing
            TestCase3();
				
		} 
		
		catch (Throwable e) {
			e.printStackTrace();
			Assert.fail("Error in "+ Methodname +" : "+ e.getMessage());
		}
		
	
  } 
  
 }
 