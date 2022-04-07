package stepDef;

import driver.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.PropertiesReader;
import static driver.PageInitializer.*;


public class stepDefinition {

    @Before
    public void beforeTest() {
        Driver.getDriver();
    }

    @Given("User open browser and navigate to automationpractice.com")
    public void user_open_browser_and_navigate_to_http_automationpractice_com_index_php() {
        System.out.println("URL");
    }

    @Then("Click on sign in menu located on the top of homepage")
    public void click_on_sign_in_menu_located_on_the_top_of_homepage() {
        comm.signinMenu.click();
    }

    @Then("User can enter {string} and {string} and then click sign in to account")
    public void user_can_enter_and_and_then_click_sign_in_to_account(String string, String string2) {
        signin.signinEmailInput.sendKeys(string);
        signin.signinPasswdInput.sendKeys(string2);
        signin.signinBtn.click();
    }
    @Then("Webpage will navigate user to My Account")
    public void webpage_will_navigate_user_to_my_account() {
        Assert.assertEquals(driver.getTitle(),PropertiesReader.getProperty("CRW014.myaccount"));
    }

    @Then("User can click [DRESS] button choose [EVENING DRESS] add item to the cart and click add to the cart")
    public void user_can_click_dress_button_choose_evening_dress_add_item_to_the_cart_and_click_add_to_the_cart() {
        Actions action = new Actions(driver);
        action.moveToElement(dresses.dressLink).build().perform();
        dresses.eveningDressesLink.click();
        dresses.printedDress.click();
        wait.until(ExpectedConditions.visibilityOf(dresses.addToCartBtn));
        dresses.addToCartBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dresses.checkoutBtn));
        dresses.checkoutBtn.click();
    }

    @Then("Webpage will navigate user to summary order and then user can click to proceed check out")
    public void webpage_will_navigate_user_to_summary_order_and_then_user_can_click_to_proceed_check_out() {
        wait.until(ExpectedConditions.visibilityOf(cart.summaryChkoutBtn));
        cart.summaryChkoutBtn.click();
    }
    @Then("Next webpage will navigate user to delivery address and billing address details and user can update and comment all details and then click proceed to checkout")
    public void next_webpage_will_navigate_user_to_delivery_address_and_billing_address_details_and_user_can_update_and_comment_all_details_and_then_click_proceed_to_checkout() {
        cart.messageBox.sendKeys(PropertiesReader.getProperty("CRW014.message"));
        cart.addressChkoutBtn.click();
    }
    @Then("Webpage will navigate user to shipping details user can click on term of service and then click proceed to check out")
    public void webpage_will_navigate_user_to_shipping_details_user_can_click_on_term_of_service_and_then_click_proceed_to_check_out() {
        cart.agreeChkbox.click();
        cart.shippingChkoutBtn.click();
    }
    @Then("Webpage will navigate user to  all details and payment about item : product,description,avail,unitprice,Qty and total.User click payment \\(pay by bank check)")
    public void webpage_will_navigate_user_to_all_details_and_payment_about_item_product_description_avail_unitprice_qty_and_total_user_click_payment_pay_by_bank_check() {
        cart.payByCheckBtn.click();
    }
    @Then("User will see all details about payment \\(pay by check) and then click [I confirm order]")
    public void user_will_see_all_details_about_payment_pay_by_check_and_then_click_i_confirm_order() {
        cart.iConfirmOrderBtn.click();
    }

    @Then("Webpage will be display [Your order on My Store is complete] in the Bank check payment page.")
    public void webpage_will_be_display_your_order_on_my_store_is_complete_in_the_Bank_check_payment_page() {
        Assert.assertEquals(cart.checkMsg.getText(),PropertiesReader.getProperty("CRW014.ordermsg"));
    }

    @Then("User can click [SUMMER DRESS] button choose [CHIFFON DRESS] add item to the cart and click add to the cart")
    public void user_can_click_summer_dress_button_choose_chiffon_dress_add_item_to_the_cart_and_click_add_to_the_cart() {
        Actions action = new Actions(driver);
        action.moveToElement(dresses.dressLink).build().perform();
        dresses.summerDressesLink.click();
        dresses.chiffonDress.click();
        dresses.qtyInput("2");
        wait.until(ExpectedConditions.visibilityOf(dresses.addToCartBtn));
        dresses.addToCartBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dresses.checkoutBtn));
        dresses.checkoutBtn.click();
    }
    @Then("Webpage will navigate user to  all details and payment about item : product,description,avail,unitprice,Qty and total.User click payment \\(pay by bank wire)")
    public void webpage_will_navigate_user_to_all_details_and_payment_about_item_product_description_avail_unitprice_qty_and_total_user_click_payment_pay_by_bank_wire() {
        cart.payByBankWireBtn.click();
    }
    @Then("User will see all details about payment \\(pay by bank wire) and then click [I confirm order]")
    public void user_will_see_all_details_about_payment_pay_by_bank_wire_and_then_click_i_confirm_order() {
        cart.iConfirmOrderBtn.click();
    }
    @Then("Webpage will be display [Your order on My Store is complete] in the Bank wire payment page.")
    public void webpage_will_be_display_your_order_on_my_store_is_complete_in_the_Bank_wire_payment_page() {
        Assert.assertEquals(cart.bankWireMsg.getText(),PropertiesReader.getProperty("CRW014.ordermsg"));
    }

    @After
    public void afterScenario() {
        Driver.tearDown();
    }
}
