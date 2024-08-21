package Admin_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Class that extends is in another project, Cant be called.
import webdriverbase.AppPage;

//public missing so the code will not execute a consider it is invalid modifier 
static class BasePage {
        protected WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }
    }
//public is missing so it will not execute the code
    static class LoginPage extends BasePage {
        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void login(String username, String password) {
//by is not imported
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("loginButton")).click();
        }

        public void forgotPassword() {
            driver.findElement(By.linkText("Forgot password?")).click();
        }
    }
//Public is missing
    static class HomePage extends BasePage {
        public HomePage(WebDriver driver) {
            super(driver);
        }

        public void verifyHomePage() {
            if (!driver.getCurrentUrl().equals("https://www.happyfox.com/home")) {
                throw new IllegalStateException("Not on the home page");
            }
        }

        public void navigateToProfile() {
            driver.findElement(By.id("profileLink")).click();
        }

    public class TablePage extends BasePage {
//syntax error 
    private By rowLocator = By.xpath("//table[@id='dataTable']/tbody/tr");

    public TablePage(WebDriver driver) {
        super(driver);
    }
//not Imported importList.java.*;
    public void retrieveRowTexts() {
        List<WebElement> rows = driver.findElements(rowLocator);

        for (int i = 0; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            String rowText = row.getText();
            System.out.println("Row " + i + " Text: " + rowText);
        }
    }

	}
		
		

}
