package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TimeClockPage extends PageObject {

	public TimeClockPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (id = "tc_tl_ci")
	WebElement clockIn;
	
	@FindBy (id = "tc_tl_co")
	WebElement clockOut;
	
	Alert myAlert = driver.switchTo().alert();
	
	public void clickOnClockIn() {
		wait.until(ExpectedConditions.visibilityOf(clockIn));
		clockIn.click();
	}
	
	public String isAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
		return myAlert.getText();
	}
	
	
	public void clickOnClockOut() {
		wait.until(ExpectedConditions.visibilityOf(clockOut));
		clockOut.click();
	}
	
	
}

