
package org.marasinitesting.cucumbercourse.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {

	private Actions actions;

	// Constructors
	public HotelSearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	// WebElements
	@FindBy(css = "#container > div > header > div > div > div > div > div > div.sc-AxjAm.sc-AxirZ.iipCjO > div:nth-child(1) > a > div")
	private WebElement hotelsLinkE;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/section/div/section/div[2]/div[2]/form/div/div[1]/div/div/button[1]")
	private WebElement earnMilesButton;

	@FindBy(xpath = "//*[@id=\"downshift-0-input\"]")
	private WebElement enterDestination;

	@FindBy(css = "#downshift-0-item-0")
	private WebElement firstSelected;

	@FindBy(xpath = "//*[@id=\"search-box-desktop\"]/form/div/div[4]/button")
	private WebElement clickSearchHotels;

	@FindBy(xpath = "//*[@id=\"search-box-aa\"]/div[1]/div/div/div[1]/span/h1")
	private WebElement clickOutside;

	@FindBy(css = "input[name*='check-in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//*[@id=\"search-box-desktop\"]/form/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]")
	private WebElement checkInDateSelection;
	
	@FindBy(xpath="//*[@id=\"search-box-desktop\"]/form/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[4]/td[4]")
	private WebElement checkOutDateSelection;
	
	@FindBy(css=".css-w2ubl8>div:nth-child(2)")
	private WebElement expandRoomsGuests;
	
	@FindBy(xpath="//*[@data-testid=\"increment-up\"]/div")
	private WebElement addRooms;
	
	@FindBy(xpath="//*[@class='chakra-button css-92toi9'][@data-testid='rooms-and-guests-apply-button']")
	private WebElement applyButton;

	// Methods
	public void clickHotelsLink() {
		hotelsLinkE.click();
	}

	public void earnMilesButton() {
		earnMilesButton.click();
	}

	public void enterDestination() {
		enterDestination.click();
		enterDestination.sendKeys("Washington D.C.");
	}

	public void clickSearchHotels() {
		clickSearchHotels.click();

	}

	public void firstSelectedClick() {

		firstSelected.click();
	}

	public void clickOutside() {
		actions.moveToElement(clickOutside).perform();
	}

	public void clickOnCheckInDate() {
		checkInDate.click();

	}
	
	public void checkInDateSelection() {
		checkInDateSelection.click();
	}
	public void checkOutDateSelection() {
		checkOutDateSelection.click();
	}
	
	public void expandRoomsGuests() {
		expandRoomsGuests.click();
	}
	public void addRooms() {
		addRooms.click();
		
	}
	
	public void clickOnApply() {
		applyButton.click();
	}

}
