import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickPage extends Base {

    public ClickPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"badButton\"]")
    private WebElement blueButton;

    public ClickPage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

    public String getButtonColor() {
        String result = blueButton.getAttribute("background-color");
        System.out.println(result);
        return result;
    }
}
