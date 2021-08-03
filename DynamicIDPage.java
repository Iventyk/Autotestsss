import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIDPage extends Base {

    public DynamicIDPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement blueButton;

    public DynamicIDPage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

    public String getBlueButtonText() {
        String result = blueButton.getText();
        System.out.println(result);
        return result;
    }


}
