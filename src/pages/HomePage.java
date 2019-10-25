package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (xpath = "//*[@id=\"right\"]/div/table/tbody/tr/td[1]/div[2]/div[2]/table/tbody/tr/td[2]/div/b")
	WebElement userName;
	
	@FindBy (id = "sn_staff")
	WebElement staffButton;
	
	
	public String isUserNamePresent() {
		wait.until(ExpectedConditions.visibilityOf(userName));
		return userName.getText();
	}
	
	public void clickOnStaffField() {
		wait.until(ExpectedConditions.visibilityOf(staffButton));
		staffButton.click();
	}
	
}
