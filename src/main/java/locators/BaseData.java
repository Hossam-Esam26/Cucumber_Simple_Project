package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseData {

   protected WebDriver driver;

    public BaseData(WebDriver driver)
    {
        this.driver = driver;
    }

    public static void clicker(WebElement element)
    {
        element.click();
    }

    public void sendText(WebElement element , String text){
        element.sendKeys(text);
    }


}
