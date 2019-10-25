package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.StaffPage;

public class TestStaffPage extends TestNG {

	StaffPage staffPage;
	HomePage homePage;
	
	@Test(priority = 8)
	
	public void addEmployeeOnlyEmail() {
		homePage = new HomePage(driver);
		staffPage = new StaffPage(driver);
		homePage.clickOnStaffField();
		staffPage.clickOnAddEmployees();
		staffPage.fillDatas("", "", "peraperic@gmail.com");
		staffPage.clickOnSaveEmployees();
		Assert.assertEquals(staffPage.isAlertPresent(), "First Name cannot be left empty");
			
	}
	
    @Test(priority = 9)
	
	public void addEmployeeWithInvalidEmail() {
		staffPage = new StaffPage(driver);
		staffPage.fillDatas("Sima", "Simic", "simasimic.gmail.com");
		staffPage.clickOnSaveEmployees();
		Assert.assertEquals(staffPage.isAlertPresent(), "Invalid Email");
	}
	
	@Test(priority = 10)
	
	public void addEmployeeOnlyLastName() {
		staffPage = new StaffPage(driver);
		staffPage.fillDatas("", "Peric", "");
		staffPage.clickOnSaveEmployees();
		Assert.assertEquals(staffPage.isAlertPresent(), "First Name cannot be left empty");
		
	}
	
	@Test(priority = 11)
	
	public void addEmployeeOnlyFirstName() {
		staffPage = new StaffPage(driver);
		staffPage.fillDatas("Pera", "", "");
		staffPage.clickOnSaveEmployees();
		Assert.assertEquals(staffPage.isAlertPresent(), "1 Employee saved!");
	}
	
 }

