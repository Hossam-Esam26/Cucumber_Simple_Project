package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseData{


    public RegisterPage(WebDriver driver) {
        super(driver);
    }
                                    //-------------Locators---------------//
    private By firstNameId = By.id("FirstName");
       WebElement firstNameElement;
    private By lastNameId = By.id("LastName");
       WebElement lastNameElement;
    private By emailId = By.id("Email");
       WebElement emailElement;
    private By confirmEmailId = By.id("ConfirmEmail");
       WebElement confirmEmailElement;
    private By userNameId = By.xpath("//input[@name= 'Username']");
       WebElement userNameElement;
    private By countryDropdownXpath = By.xpath("//*[@id=\"CountryId\"]");
       WebElement countryDropdownElement;
    private By timeZoneDropdownId = By.id("TimeZoneId");
       WebElement timeZoneDropdownElement;
    private By passwordId = By.id("Password");
       WebElement passwordElement;
    private By confirmPasswordId = By.id("ConfirmPassword");
       WebElement confirmPasswordElement;
    private By myCompanyPrimarilyDropdownXpath = By.xpath("//select[@name = 'Details.CompanyIndustryId']");
       WebElement myCompanyPrimarilyDropdownElement;
    private By myMainActivityDropdownXpath = By.xpath("//select[@name = 'Details.CompanyRoleId']");
     public   WebElement myMainActivityDropdownElement;
    private By howManyPeopleWorkDropdownXpath = By.xpath("//select[@name = 'Details.CompanySizeId']");
       WebElement howManyPeopleWorkDropdownElement;
    private By myCompanyWebsite = By.xpath("//input[@name = 'Details.CompanyWebsiteUrl']");
    WebElement myCompanyWebsiteElement;
    private By registerButtonId = By.id("register-button");
       WebElement registerButtonElement;
                                //---------------------------------------//
    public void enterFirstName(String name)
    {
        firstNameElement=driver.findElement(firstNameId);
        sendText(firstNameElement , name);
    }

    public void enterLastName(String name)
    {
        lastNameElement=driver.findElement(lastNameId);
        sendText(lastNameElement , name);
    }

    public void enterEmail(String email)
    {
        emailElement=driver.findElement(emailId);
        sendText(emailElement , email);
    }

    public void enterConfirmEmail(String email)
    {
        confirmEmailElement=driver.findElement(confirmEmailId);
        sendText(confirmEmailElement , email);
    }

    public void enterUserName(String name)
    {
        userNameElement = driver.findElement(userNameId);
        sendText(userNameElement , name);
    }

    public void chooseCountryDropdown(String value)
    {
        countryDropdownElement = driver.findElement(countryDropdownXpath);
        Select select = new Select(countryDropdownElement);
        select.selectByValue(value);
        sendText(countryDropdownElement , value);
    }

    public void chooseTimeZoneDropdown(String value)
    {
        timeZoneDropdownElement = driver.findElement(timeZoneDropdownId);
        Select select = new Select(timeZoneDropdownElement);
        select.selectByValue(value);
        sendText(timeZoneDropdownElement , value);
    }

    public void enterPassword(String pass)
    {
        passwordElement = driver.findElement(passwordId);
        sendText(passwordElement , pass);
    }

    public void enterConfirmPassword(String pass)
    {
        confirmPasswordElement = driver.findElement(confirmPasswordId);
        sendText(confirmPasswordElement , pass);
    }

    public void chooseMyCompanyPrimarilyDropdown(String value)
    {
        myCompanyPrimarilyDropdownElement = driver.findElement(myCompanyPrimarilyDropdownXpath);
        Select select = new Select(myCompanyPrimarilyDropdownElement);
        select.selectByValue(value);
        sendText(myCompanyPrimarilyDropdownElement , value);
    }

    public void chooseMyMainActivityDropdown(String value)
    {
        myMainActivityDropdownElement = driver.findElement(myMainActivityDropdownXpath);
        Select select = new Select(myMainActivityDropdownElement);
        select.selectByValue(value);
        sendText(myMainActivityDropdownElement , value);
    }

    public void chooseHowManyPeopleWorkDropdown(String value)
    {
        howManyPeopleWorkDropdownElement = driver.findElement(howManyPeopleWorkDropdownXpath);
        Select select = new Select(howManyPeopleWorkDropdownElement);
        select.selectByValue(value);
        sendText(howManyPeopleWorkDropdownElement , value);
    }

    public void enterMyCompanyWebsite(String value){
        myCompanyWebsiteElement = driver.findElement(myCompanyWebsite);
        sendText(myCompanyWebsiteElement , value);
    }

    public void clickRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButtonId);
        clicker(registerButtonElement);
    }

}
