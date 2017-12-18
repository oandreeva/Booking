package by.htp.booking.steps;

import org.openqa.selenium.WebDriver;

import by.htp.booking.driver.Driver;
import by.htp.booking.pages.LoginPage;

public class Steps {

	private WebDriver driver;

	public void initBrowser() {
		driver = Driver.getDriver();
	}

	public void closeDriver() {
		Driver.closeDriver();
	}

	public String isPresentsearchTitle() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		String titleText = loginPage.getTitleText();
		return titleText;
	}

	public void performSearch(String adress) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.setAdressToSearch(adress);
		loginPage.clickSearchResult();

	}

	public String isValueCorrect() {
		LoginPage loginPage = new LoginPage(driver);
		String value = loginPage.getSearchValue();
		return value;

	}

	public void setFirstDate() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickFirstDate();
	}
	
	public void setSecondDate() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickSecondDate();
	}
	
	public void performSearch(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickSearchButton();
	}
}
