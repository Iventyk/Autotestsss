import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayPage extends Base {
    public LoadDelayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/section/div/button")
    private WebElement buttonAppearingAfterDelay;

    public LoadDelayPage clickOnBlueButton() {
        buttonAppearingAfterDelay.click();
        return this;
    }


}
