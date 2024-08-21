package webdriverbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
//// files imported in base class(BaseTest.java) are not used since it is in different project
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    	//                                           System.getproperties("user.dir")can be used instead of giving whole path
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\D drive\\automation\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


