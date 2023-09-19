package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseData {

     public HomePage(WebDriver driver){
        super(driver);
    }

    By loginButton = By.xpath("//span[contains(text(),'Log in')]");
    By registerButton = By.xpath("//span[contains(text(),'Register')]");
    By dropdownHover= By.xpath("//header/nav[1]/ul[1]/li[3]/span[1]/span[1]/*[1]");
    By dropdownHover2 = By.xpath("//header/nav[1]/ul[1]/li[4]/span[1]/span[1]/*[1]");
    By logoutButton = By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[4]/ul/li[3]/a/span");

    WebElement registerWeb;
    WebElement loginWeb;
    WebElement dropdown;
    WebElement dropdownElement2;
    WebElement logoutButtonElement;


    public void hoverDropdown(){
        dropdown = driver.findElement(dropdownHover);
        Actions action = new Actions(driver);
        action.moveToElement(dropdown).perform();
    }
    public void hoverDropdown2(){
        dropdownElement2 = driver.findElement(dropdownHover2);
        Actions action = new Actions(driver);
        action.moveToElement(dropdownElement2).perform();
    }
    public RegisterPage clickRegisterButton(){
        registerWeb=driver.findElement(registerButton);
        clicker(registerWeb);
        return new RegisterPage(driver);
    }

    public LoginPage clickLoginButton(){
        loginWeb = driver.findElement(loginButton);
        clicker(loginWeb);
        return new LoginPage(driver);
    }

    public void  clickLogoutButton(){
        logoutButtonElement = driver.findElement(logoutButton);
        clicker(logoutButtonElement);
    }


}






