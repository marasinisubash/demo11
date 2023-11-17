package org.marasinitesting.cucumbercourse.stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;


import org.marasinitesting.cucumbercourse.pages.HotelSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelSearchStepDefs {
	public static WebDriver driver;
	private HotelSearchPage hotelSearchPage;
	private String mainURL = "https://www.aadvantagehotels.com/";
	private WebDriverWait wait;
	

	// Driver Setup
	@Before
	public void driverSetup() {
		driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//explicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
	}
	// Close driver

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Given("I am on the Hotels page.")
	public void i_am_on_the_hotels_page() throws InterruptedException {
		driver.get(mainURL);
		driver.manage().window().maximize();
		hotelSearchPage = new HotelSearchPage(driver);
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > header > div > div > div > div > div > div.sc-AxjAm.sc-AxirZ.iipCjO > div:nth-child(1) > a > div")));
		hotelSearchPage.clickHotelsLink();
	}

	@Given("I click on Earn Miles.")
	public void i_click_on_earn_miles() throws InterruptedException {
		Thread.sleep(5000);
		hotelSearchPage.earnMilesButton();
	}

	@Given("I enter the city {string}.")
	public void i_enter_the_city(String string) throws InterruptedException {
		Thread.sleep(5000);
		hotelSearchPage.enterDestination();
		Thread.sleep(5000);
		hotelSearchPage.firstSelectedClick();
		Thread.sleep(3000);
		hotelSearchPage.clickOutside();

	}

	@Given("I select the Date from Nov {int} to Dec {int}.")
	public void i_select_the_date_from_nov_to_dec(Integer int1, Integer int2) throws InterruptedException {
		Thread.sleep(5000);
		hotelSearchPage.clickOnCheckInDate();
		Thread.sleep(5000);
		hotelSearchPage.checkInDateSelection();
		Thread.sleep(5000);
		hotelSearchPage.checkOutDateSelection();

	}

	@Given("I select {int} Room.")
	public void i_select_room(Integer int1) throws InterruptedException {
		Thread.sleep(5000);
		hotelSearchPage.expandRoomsGuests();
		Thread.sleep(5000);
		hotelSearchPage.addRooms();
		Thread.sleep(5000);
		

	}

	@Given("I select {int} Adults.")
	public void i_select_adults(Integer int1) {

	}

	@Given("I select {int} Children.")
	public void i_select_children(Integer int1) {

	}

	@Given("I select the age of child1 as {int}.")
	public void i_select_the_age_of_child1_as(Integer int1) {

	}

	@When("I click on Apply")
	public void i_click_on_apply() {
		hotelSearchPage.clickOnApply();
	}

	@When("I click on Search Hotels")
	public void i_click_on_search_hotels() throws InterruptedException {
		Thread.sleep(5000);
		hotelSearchPage.clickSearchHotels();
		Thread.sleep(5000);

	}

	@Then("I should be able to see the list of available hotels.")
	public void i_should_be_able_to_see_the_list_of_available_hotels() throws IOException {
		
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("./Screenshots/hotelsearchlistpage.png"));
		
	

	}

	@Then("I should be able to select Lowest price first option in Sort by.")
	public void i_should_be_able_to_select_lowest_price_first_option_in_sort_by() {

	}

}
