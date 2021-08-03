import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class ClassAttributePage extends Base {
    public ClassAttributePage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement blueButton;

    @FindBy(linkText = "Primary button pressed")
    private WebElement alertButtonOK;


    public ClassAttributePage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

    public ClassAttributePage clickAlertButtonOK() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

    public String getBtnPrimary() {
        String result = blueButton.getAttribute("class");
        System.out.println(result);
        return result;
    }
}
