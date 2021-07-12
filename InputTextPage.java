import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputTextPage extends Base {
    public InputTextPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "newButtonName")
            private WebElement fieldInput;

    @FindBy(id = "updatingButton")
            private WebElement blueButton;


    public InputTextPage enterButtonText(String inputText) {
        fieldInput.sendKeys(inputText);
        return this;
    }

    public InputTextPage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

    public String getBlueButtonText() {
        String result = blueButton.getText();
        System.out.println(result);
        return result;
    }
}
