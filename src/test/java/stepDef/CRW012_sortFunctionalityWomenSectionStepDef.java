package stepDef;

import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import driver.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.commonMethods;

public class CRW012_sortFunctionalityWomenSectionStepDef extends commonMethods {

	@Before
	public void beforeTest() {
		Driver.getDriver();

	}

	@After
	public void afterScenario() {
		Driver.tearDown();
	}

	@Given("Click on the tab WOMEN on top of the home page")
	public void click_on_the_tab_WOMEN_on_top_of_the_home_page() {
		System.out.println("OPEN WOMEN");
	}

	@When("Select sorted Product name: A to Z")
	public void select_sorted_product_name_a_to_z() {
		Select select = new Select(women.selectSortBy);
		select.selectByVisibleText(women.sortByAtoZ);

	}

	@Then("User should be able to view the product which is sort by Product Name: A to Z")
	public void user_should_be_able_to_view_the_product_which_is_sort_by_product_name_a_to_z() {
		Driver.wait.until(ExpectedConditions.stalenessOf(women.productNameList.get(0)));
		women.verifyItemSortedAtoZ();
	}

	@When("Select sorted Product Price: Lowest First")
	public void select_sorted_product_price_lowest_first() {
		Select select = new Select(women.selectSortBy);
		select.selectByVisibleText(women.sortByPriceLowestFirst);
	}

	@Then("User should be able to view the product which is sort by Product price from low to high")
	public void user_should_be_able_to_view_the_product_which_is_sort_by_product_price_from_low_to_high() {
		Driver.wait.until(ExpectedConditions.stalenessOf(women.productPriceList.get(0)));
		women.verifyItemSortedLowestFirst();
	}

	@When("Select sort by In stock")
	public void select_sort_by_in_stock() {
		Select select = new Select(women.selectSortBy);
		select.selectByVisibleText(women.sortByInStock);
	}

	@Then("User should be able to view the product which is sort by In stock product only")
	public void user_should_be_able_to_view_the_product_which_is_sort_by_in_stock_product_only() {
		Driver.wait.until(ExpectedConditions.stalenessOf(women.productNameList.get(0)));
		women.verifyItemSortedInStock();
	}

}
