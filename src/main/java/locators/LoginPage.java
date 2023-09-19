package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseData {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By loginId = By.id("Username");
        WebElement loginElement;
    private By passwordId = By.id("Password");
        WebElement passwordElement;
    private By loginButtonXpath = By.xpath("//input[@type='submit']");
        WebElement loginButtonElement;



    public void enterLoginData(String data)
    {
        loginElement = driver.findElement(loginId);
        sendText(loginElement , data );
    }

    public void enterPassword(String data)
    {
        passwordElement = driver.findElement(passwordId);
        sendText(passwordElement , data );
    }

    public void clickLoginButton()
    {
        loginButtonElement = driver.findElement(loginButtonXpath);
        BaseData.clicker(loginButtonElement);
    }
}
