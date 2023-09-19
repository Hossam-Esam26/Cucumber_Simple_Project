package classes;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.HomePage;
import locators.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageTest {

    HomePage homePage;
    RegisterPage registerPage;

    Base base;
    public  RegisterPageTest (Base base){
        this.base=base;
    }

    @Given("User open register page")
    public void user_open_register_page() {
        homePage = new HomePage(base.getDriver());
        homePage.hoverDropdown();
        registerPage=homePage.clickRegisterButton();
    }
    @When("The user fills in all fields with valid data")
    public void the_user_fills_in_all_fields_with_valid_data() {
        // You need to change the data every time you run a script
        registerPage.enterFirstName("test12");
        registerPage.enterLastName("cuccumber");
        registerPage.enterEmail("test2@live.com");
        registerPage.enterConfirmEmail("test2@live.com");
        registerPage.enterUserName("Try_to_test");
        registerPage.chooseCountryDropdown("299");
        registerPage.chooseTimeZoneDropdown("Middle East Standard Time");
        registerPage.enterPassword("123456789");
        registerPage.enterConfirmPassword("123456789");
        String valueMyCompany = "5";
        registerPage.chooseMyCompanyPrimarilyDropdown(valueMyCompany);
        if (valueMyCompany.equals("10"))
        {
            registerPage.chooseMyMainActivityDropdown("5");
            registerPage.chooseHowManyPeopleWorkDropdown("2");
            registerPage.enterMyCompanyWebsite("https://www.google.com");
        }
    }
    @And("Click register button")
    public void click_register_buttom() {
        registerPage.clickRegisterButton();
    }
    @Then("User made new account successfully")
    public void user_made_new_account_successfully() {
        String expected = "Almost done! To complete your nopCommerce registration, we just need to verify your email address.";
        String actual = base.getDriver().findElement(By.xpath("//h2[contains(text(),'Almost done! To complete your nopCommerce registra')]"))
                .getText();
        Assert.assertTrue(actual.contains(expected));
    }
}
