package by.htp.booking;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.booking.steps.Steps;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AutoTests {
	private Steps steps;
	private static final String adress = "Минск";

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

//	@Test
//	public void loginToMail() {
//		
//		Assert.assertEquals(steps.isPresentsearchTitle(), "Найдите лучшие предложения");
//
//	}

	@Test
	public void performSearch() {
		
		steps.performSearch(adress);
		Assert.assertEquals(steps.isValueCorrect(), "Минск, Минская область, Беларусь");
		steps.setFirstDate();
//		steps.setSecondDate();
		steps.performSearch();
//		Assert.assertEquals(steps.isPresentsearchTitle(), "Найдите лучшие предложения");

	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser() {
		steps.closeDriver();
	}
}
