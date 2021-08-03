import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersPage extends Base {
    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "greenButton")
    private WebElement greenButton;

    @FindBy(id = "blueButton")
    private WebElement blueButton;

    public HiddenLayersPage clickOnGreenButton() {
        greenButton.click();
        return this;
    }

    public HiddenLayersPage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

}
