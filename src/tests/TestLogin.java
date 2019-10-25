package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;

public class TestLogin extends TestNG {

	LoginPage login;
	HomePage homePage;
	
	@Test(priority = 0)
	
	public void wrongEmail() {
		login = new LoginPage(driver);
		driver.get("https://www.humanity.com/");
		login.clickOnLoginButton();
		login.fillInputs("milan.gmail.com", "vezbanje");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Your username/email or password is incorrect. Please try again or click Forgot Password.");
		
	}
	
	@Test(priority = 1)
	
	public void wrongPassword() {
		login = new LoginPage(driver);
		login.fillInputs("milanvunjak88@gmail.com", "vezbaa");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Your username/email or password is incorrect. Please try again or click Forgot Password.");
	}
	
	@Test(priority = 2)
	
	public void withoutEmail() {
		login = new LoginPage(driver);
		login.fillInputs("", "vezbanje");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Your username/email or password is incorrect. Please try again or click Forgot Password.");
	}
	
	@Test(priority = 3)
	
	public void withoutPassword() {
		login = new LoginPage(driver);
		login.fillInputs("milanvunjak88@gmail.com", "");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Your username/email or password is incorrect. Please try again or click Forgot Password.");
	
	}
	
	@Test(priority = 4)
	
	public void withoutEmailAndPassword() {
		login = new LoginPage(driver);
		login.fillInputs("", "");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Your username/email or password is incorrect. Please try again or click Forgot Password.");
	}
	
	@Test(priority = 5)
	
	public void goToForgotPassword() {
		login = new LoginPage(driver);
		login.forgotPassword();
		Assert.assertEquals(login.isResetPasswordMsgAt(), "Request New Password");
		
	}
	
	@Test(priority = 6)
	
	public void loginWithFacebook() {
		login = new LoginPage(driver);
		login.returnToLoginPage();
		login.logInWithFb();
		Assert.assertEquals(login.isLogIntoFbMsgAt(), "Log Into Facebook");
	}
	
	@Test(priority = 7)
	
	public void successfulLogIn() {
		login = new LoginPage(driver);
		homePage = new HomePage(driver);
		login.returnToLogIn();
		login.fillInputs("milanvunjak88@gmail.com", "vezbanje");
		Assert.assertEquals(homePage.isUserNamePresent(), "Hi Milan Vunjak,");
		
	}
	
}
