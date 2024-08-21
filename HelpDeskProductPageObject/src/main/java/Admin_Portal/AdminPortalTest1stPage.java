package Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//the apppage will not import because it is in another project
//Packages and classes should be in the same project to get imported and accessed 
import webdriverbase.AppPage;

//base class,pojo class,test class all these classes should be in same project
//since these three are in different projects 
//we will not able to access the class method and packages through out the projects 


//App page will not able to be imported since it is in a different maven project
public class AdminPortalTest1stPage extends AppPage {

	// super keyword have been given here
	// but the WebDriver reusable method is in another project the keyword will not
	// get execute
	public AdminPortalTest1stPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[@class='hf-top-bar_title_text hf-font-light']")
	private WebElement Title;

	@FindBy(linkText = "Statuses")
	private WebElement Statuses;

	// since this class is pojo class which only used to maintain object
	// Here code should not be written even though your writing
	// Also even if your writing means the method which have been call inside this
	// method
	// is in another project so you will not able to call the method
	// if you want to call the method should be in same project
	public void clickStatus() {
		hoverOverElementUsingJS(Title);
		Title.click();
		Statuses.click();

	}

	@FindBy(linkText = "Priorities")
	private WebElement Priorities;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void clickPriorities() throws InterruptedException {
		sleep();
		hoverOverElementUsingJS(Title);
		Title.click();
		hoverOverElementUsingJS(Priorities);
		Priorities.click();

	}

	@FindBy(xpath = "//button[@class='hf-mod-create']")
	private WebElement NewStatus;

	public void clickNewStatus() {
		NewStatus.click();
	}

	@FindBy(xpath = "//input[@aria-label='Status Name']")
	private WebElement StatusName;

	public void enterStatusName(String text) {
		StatusName.sendKeys(text);
	}

	@FindBy(xpath = "//div[@class='sp-preview-inner']")
	private WebElement StatusColourInner;

	public void clickStatusColourInner() {
		StatusColourInner.click();
	}

	@FindBy(xpath = "//input[@placeholder='Enter any valid color code format.']")
	private WebElement StatusColour;

	public void enterStatusColour(String text) {
		clickStatusColourInner();
		StatusColour.clear();
		StatusColour.sendKeys(text);
		clickStatusColourInner();
	}

	@FindBy(xpath = "//div[@aria-label='Behavior']")
	private WebElement Behavior;

	//send keys two time used here only one time is enough
	public void enterBehavior(String text) {
		Behavior.click();
		Behavior.sendKeys(text);
		Behavior.sendKeys(Keys.ENTER);

	}

	@FindBy(xpath = "//textarea[@aria-label='Description']")
	private WebElement StatusDescription;

	public void enterStatusDescription(String text) {
		StatusDescription.clear();
		StatusDescription.sendKeys(text);
	}

	@FindBy(xpath = "//button[@data-test-id='add-status']")
	private WebElement AddStatus;

	public void clickAddStatus() {
		AddStatus.click();
	}

	@FindBy(xpath = "//a[@data-test-id='manage-statuses-left-nav']")
	private WebElement StatusesSection;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void clickStatusesSection() throws InterruptedException {
		scrolltoElement(StatusesSection);
		StatusesSection.click();
	}

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method //also here they have created a reference for driver
	// but the driver initialization not done here
	// but the initialization have been done in the apppage class if it have been
	// imported it is not an issue
	// but since it is in different project we will not able to import the class
	public void setDefaultStatus(String xpath) throws InterruptedException {
		String Status = "//div[contains(text(),'" + xpath + "')]//following::td[3]";
		WebElement abc = driver.findElement(By.xpath(Status));
		hoverOverElementUsingJS(abc);
		abc.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Priorities')]")
	private WebElement PrioritySection;

	public void clickPrioritySection() {
		PrioritySection.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/section[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]")
	private WebElement NewPriority;

	public void clickNewPriority() {
		NewPriority.click();
	}

	@FindBy(xpath = "//input[@data-test-id='form-field-name']")
	private WebElement PriorityName;

	public void enterPriorityName(String text) {
		PriorityName.clear();
		PriorityName.sendKeys(text);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/header[1]/div[2]/nav[1]/div[7]/div[1]/div[1]")
	private WebElement PriorityDescription;

	public void enterPriorityDescription(String text) {
		PriorityDescription.clear();
		PriorityDescription.sendKeys(text);
	}

	@FindBy(xpath = "//textarea[@data-test-id='form-field-helpText']")
	private WebElement PriorityHelpText;

	public void enterPriorityHelpText(String text) {
		PriorityHelpText.clear();
		PriorityHelpText.sendKeys(text);
	}

	@FindBy(xpath = "//button[@data-test-id='add-priority']")
	private WebElement AddPriority;

	public void clickAddPriority() {
		AddPriority.click();
	}

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method //also here they have created a reference for driver
	// but the driver initialization not done here
	// but the initialization have been done in the apppage class if it have been
	// imported it is not an issue
	// but since it is in different project we will not able to import the class
	public void setDefaultPriroity(String xpath) throws InterruptedException {

		String priority = "//span[contains(text(),'" + xpath + "')]//following::td[3]";
		WebElement pqr = driver.findElement(By.xpath(priority));
		hoverOverElementUsingJS(pqr);
		pqr.click();
		sleep();
		sleep();

	}

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	// also here they have created a reference for driver
	// but the driver initialization not done here
	// but the initialization have been done in the apppage class if it have been
	// imported it is not an issue
	// but since it is in different project we will not able to import the class
	public void ClickAddedPriority(String xpath) throws InterruptedException {
		sleep();
		String priority = "//span[contains(text(),'" + xpath + "')]";
		scrolltoElement(priority);
		driver.findElement(By.xpath(priority)).click();

	}

	@FindBy(xpath = "//a[@data-test-id='priority-delete-trigger']")
	private WebElement PriorityDeleteLink;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void clickPriorityDeleteLink() throws InterruptedException {
		scrolltoElement(PriorityDeleteLink);
		PriorityDeleteLink.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Choose Priority')]")
	private WebElement NewDefaultPriority;

	@FindBy(xpath = "//input[contains(@class,'ember-power-select-search-input')]")
	private WebElement ChoosingNewDefaultPriority;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void setNewDefaultPriority() throws InterruptedException {
		hoverOverElementUsingJS(NewDefaultPriority);
		NewDefaultPriority.click();
		ChoosingNewDefaultPriority.click();
		ChoosingNewDefaultPriority.sendKeys("Low");
		ChoosingNewDefaultPriority.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//button[@data-test-id='delete-dependants-primary-action']")
	private WebElement DeleteConfirm;

	public void clickDeleteConfirm() throws InterruptedException {
		DeleteConfirm.click();
		Thread.sleep(5000);
	}

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	// also here they have created a reference for driver
	// but the driver initialization not done here
	// but the initialization have been done in the apppage class if it have been
	// imported it is not an issue
	// but since it is in different project we will not able to import the class
	public void ClickAddedStatus(String xpath) throws InterruptedException {
		sleep();
		String Status = "//div[contains(text(),'" + xpath + "')]";
		scrolltoElement(Status);
		driver.findElement(By.xpath(Status)).click();
		; // syntax error colon used here un necessarily

	}

	@FindBy(xpath = "//a[@data-test-id='status-delete-trigger']")
	private WebElement StatusDeleteLink;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void clickStatusDeleteLink() throws InterruptedException {
		scrolltoElement(StatusDeleteLink);
		StatusDeleteLink.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Choose Status')]")
	private WebElement NewDefaultStatus;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void setNewDefaultStatus() throws InterruptedException {
		hoverOverElementUsingJS(NewDefaultStatus);
		NewDefaultStatus.click();
		NewDefaultStatus.sendKeys(Keys.DOWN);
		NewDefaultStatus.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//iframe[@id='hfc-frame']")
	private WebElement ToFrames;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void switchToFrames() {
		switchToFrame(ToFrames);
	}

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void switchToDefaultPage() {
		switchToDefaultContent();
	}

	@FindBy(xpath = "//div[@class='hf-avatar-image-container ember-view']//img[@class='hf-avatar-image hf-avatar-image_show']")
	private WebElement Profile;

	// the method which have been call inside this method
	// is in another project so you will not able to call the method
	// Even if it is in a different class as long as it is in a same project you can
	// able to call the method
	public void clickProfile() throws InterruptedException {
		sleep();
		waitForVisible(Profile);
		Profile.click();
	}

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement Logout;

	public void clickLogout() {
		Logout.click();
	}

	//unnecessarily given
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

}
