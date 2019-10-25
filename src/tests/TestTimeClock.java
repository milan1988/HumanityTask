package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.StaffPage;
import pages.TimeClockPage;

public class TestTimeClock extends TestNG {

	TimeClockPage timeClock;
	StaffPage staffPage;
	
	@Test(priority = 12)
	
	public void clockIn() {
		staffPage.clickOnTimeClockField();
		timeClock.clickOnClockIn();
		Assert.assertEquals(timeClock.isAlertPresent(), "Clocked in.!");
		
	}
	
	@Test(priority = 13)
	
	public void clockOut() {
		timeClock.clickOnClockOut();
		Assert.assertEquals(timeClock.isAlertPresent(), "Clocked out.!");
	}
	
	
}
