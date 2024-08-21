package Admin_Portal;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonTests.CommonTests1;
//import from another project cant be executed.
import CustomerPortal.SupportPortalPage;
//this class not able to extend with commontest1
//even though it is in the same class because of incorrect inheritance concept
//we have try to extend the base test in commontest1 class
//but the base test class is in another project so it through error in commontest1
//we have extended the commontest1 here even though it has error 
//that causes the error here because of the incorrect access
public class AdminPortalTest2 extends CommonTests1{
  
  @Test
  public void Scenario2() {
	  
	  String Methodname = new Object(){}.getClass().getEnclosingMethod().getName(); 
		
		try {
			
			String Classname = getClass().getSimpleName();
            System.out.println("start of method : " + Classname);
            loginasAdmin();
            TestCase1();
            TestCase2();
            TestCase3();
              
		}
		
		catch(Throwable t) {
			 t.printStackTrace();
			 Assert.fail("Error in "+ Methodname +" : "+ t.getMessage());
		}
  }
}
