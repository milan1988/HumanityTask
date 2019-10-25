package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;

public class StaffPage extends PageObject {

	public StaffPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (id = "act_primary")
	WebElement addEmployeesButton;
	
	@FindBy (id = "_asf1")
	WebElement firstName;
	
	@FindBy (id = "_asl1")
	WebElement lastName;
	
	@FindBy (id = "_ase1")
	WebElement emailOfWorker;
	
	@FindBy (id = "_as_save_multiple")
	WebElement saveEmployees;
	
	Alert myAlert = driver.switchTo().alert();
	
	@FindBy (id = "sn_timeclock")
	WebElement timeClock;
	
	public void clickOnAddEmployees() {
		wait.until(ExpectedConditions.visibilityOf(addEmployeesButton));
		addEmployeesButton.click();
	}
	
	public void fillDatas(String firstName, String lastName, String emailOfEmployee) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);

		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		
		this.emailOfWorker.clear();
		this.emailOfWorker.sendKeys(emailOfEmployee);
	}
	
	public void clickOnSaveEmployees() {
		wait.until(ExpectedConditions.visibilityOf(saveEmployees));
		saveEmployees.click();
	}
	
	public String isAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
		return myAlert.getText();
	}
	
	public void clickOnTimeClockField() {
		wait.until(ExpectedConditions.visibilityOf(timeClock));
		timeClock.click();
	}
}

