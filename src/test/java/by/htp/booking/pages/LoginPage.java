package by.htp.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
	
	private static final String BASE_URL = "https://www.booking.com/";
	
	@FindBy(xpath = "//*/form[@id='frm']/div/h2/span")
	private WebElement searchFormHeader;
	
	@FindBy(css = "#frm>div:nth-of-type(6) div button")
	private WebElement searchButton;
	
	@FindBy(css = "#frm>div:nth-of-type(2) #ss")
	private WebElement saerchField;
	
	@FindBy(css = "#frm>div:nth-of-type(2)>div>div ul:nth-of-type(1) li:nth-of-type(1)")
	private WebElement searchResult;
	
	@FindBy(css = "#frm>div:nth-of-type(3) div>div div:nth-of-type(2) button")
	private WebElement checkInButton;
	
	@FindBy(css = "#frm>div:nth-of-type(3) div>div div:nth-of-type(1) div div>div:nth-of-type(2)>div:nth-of-type(3) .c2-month [data-id='1514678400000']")
	private WebElement firstDate;
	
	@FindBy(css = "#frm>div:nth-of-type(3) div>div div:nth-of-type(1) button")
	private WebElement checkOutButton;
	
	@FindBy(css = "#frm>div:nth-of-type(3) div>div div:nth-of-type(2) div div>div:nth-of-type(2)>div:nth-of-type(3) .c2-month [data-id='1514764800000']" )
	private WebElement secondDate;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		driver.navigate().to(BASE_URL);
	}
	
	public String getTitleText(){
		
		String titleText = searchFormHeader.getText();
		return titleText;
	}

	public void setAdressToSearch(String adress){
		
		saerchField.sendKeys(adress);
		
	}
	
	public void clickSearchResult(){
		
		searchResult.click();
	}

	
	public String getSearchValue(){
		
		String searchValue = saerchField.getAttribute("value");
		return searchValue;
	}
	
	public void clickCheckInButton(){
		
		checkInButton.click();
	}
	
	public void clickFirstDate(){
		firstDate.click();
	}
	
public void clickCheckOutButton(){
		
		checkOutButton.click();
	}
	public void clickSecondDate(){
		secondDate.click();
	}
	
	public void clickSearchButton(){
		searchButton.click();
		
	}
}
