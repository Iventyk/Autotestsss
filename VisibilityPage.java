import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisibilityPage extends Base {

    public VisibilityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"hideButton\"]")
    private WebElement hideButton;

    @FindBy(xpath = "//*[@id=\"removedButton\"]")
    private WebElement removedButton;

    @FindBy(xpath = "//*[@id=\"zeroWidthButton\"]")
    private WebElement zeroWidthButton;

    @FindBy(xpath = "//*[@id=\"overlappedButton\"]")
    private WebElement overlappedButton;

    @FindBy(xpath = "//*[@id=\"transparentButton\"]")
    private WebElement transparentButton;

    @FindBy(xpath = "//*[@id=\"invisibleButton\"]")
    private WebElement invisibleButton;

    @FindBy(xpath = "//*[@id=\"notdisplayedButton\"]")
    private WebElement notDisplayedButton;

    @FindBy(xpath = "//*[@id=\"offscreenButton\"]")
    private WebElement offscreenButton;

    public VisibilityPage clickOnHideButton() {
        hideButton.click();
        return this;
    }

    public VisibilityPage clickOnRemovedButton() {
        removedButton.click();
        return this;
    }

    public VisibilityPage clickOnZeroWidthButton() {
        zeroWidthButton.click();
        return this;
    }

    public VisibilityPage clickOnOverlappedButton() {
        overlappedButton.click();
        return this;
    }

    public VisibilityPage clickOnTransparentButton() {
        transparentButton.click();
        return this;
    }

    public VisibilityPage clickOnInvisibleButton() {
        invisibleButton.click();
        return this;
    }

    public VisibilityPage clickOnNotDisplayedButton() {
        notDisplayedButton.click();
        return this;
    }

    public VisibilityPage clickOnOffscreenButton() {
        offscreenButton.click();
        return this;
    }


}
