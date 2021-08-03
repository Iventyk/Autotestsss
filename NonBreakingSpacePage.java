import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonBreakingSpacePage extends Base{

    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='My Button']")
    private WebElement blueButton;

    public NonBreakingSpacePage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

}
