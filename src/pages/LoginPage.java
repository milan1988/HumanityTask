package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (xpath = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p")
	WebElement loginButton;
	
	@FindBy (id = "email")
	WebElement email;
	
	@FindBy (id = "password")
	WebElement password;
	
	@FindBy (className = "btn btn-blue btn-full")
	WebElement login;
	
	@FindBy (className = "lForgot")
	WebElement forgotPassword;
	
	@FindBy (className = "btn btn-facebook btn-icon")
	WebElement fb;
	
	@FindBy (id = "response-message")
	WebElement invalidMessage;
	
	@FindBy (css = "#request_reset_password > div.footer > button")
	WebElement requestNewPassword;
	
	@FindBy (css = "#request_reset_password > div:nth-child(2) > a")
	WebElement returnButton;
	
	@FindBy (className = "btn btn-facebook btn-icon")
	WebElement loginFb;
	
	@FindBy (className = "_50f6")
	WebElement logIntoFb;
	
	@FindBy (className = "_2iem")
	WebElement notNowButton;
	
	
	public void clickOnLoginButton() {
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
	}
	
	public void fillInputs(String email, String password) {
		this.email.clear();
		this.email.sendKeys(email);

		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void logIn() {
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}
	
	public String isInvalidMsgAt() {
		wait.until(ExpectedConditions.visibilityOf(invalidMessage));
		return invalidMessage.getText();
	}
	
	public void forgotPassword() {
		wait.until(ExpectedConditions.visibilityOf(forgotPassword));
		forgotPassword.click();
	}
	
	
	public String isResetPasswordMsgAt() {
		wait.until(ExpectedConditions.visibilityOf(requestNewPassword));
		return requestNewPassword.getText();
	}
	
	
	public void returnToLoginPage() {
		wait.until(ExpectedConditions.visibilityOf(returnButton));
		returnButton.click();
	}
	
	public void logInWithFb() {
		wait.until(ExpectedConditions.visibilityOf(loginFb));
		loginFb.click();
	}
	
	public String isLogIntoFbMsgAt() {
		wait.until(ExpectedConditions.visibilityOf(logIntoFb));
		return logIntoFb.getText();
	}
	
	public void returnToLogIn() {
		wait.until(ExpectedConditions.visibilityOf(notNowButton));
		notNowButton.click();
	}
	
	
}