package classes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.HomePage;
import locators.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    LoginPage loginPage;
    HomePage homePage;
 //   WebDriver driver ;

    Base base;

    public LoginPageTest(Base base){
        this.base=base;
    }
    @Given("User open login page")
    public void User_open_login_page(){
        homePage = new HomePage(base.getDriver());
        homePage.hoverDropdown();
        loginPage = homePage.clickLoginButton();
    }

    @When("Enter valid {string} and {string}")
    public void Enter_valid_username_and_password(String username , String password){
        loginPage.enterLoginData(username);
        loginPage.enterPassword(password);
    }

    @And("Click on login button")
    public void Click_on_login_button(){
        loginPage.clickLoginButton();
    }

    @Then("The user will be redirected to the account page")
    public void The_user_will_be_redirected_to_the_ccount_page(){
        String expected = "Free and open-source eCommerce platform";
        String actual = base.getDriver().findElement(By.xpath("//h1[text()='Free and open-source eCommerce platform']")).getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @And("User logout")
    public void User_logout(){
        homePage.hoverDropdown2();
        homePage.clickLogoutButton();
    }


}
