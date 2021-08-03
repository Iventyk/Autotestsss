import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientSideDelayPage extends Base {

    public ClientSideDelayPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"ajaxButton\"]")
    private WebElement blueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/p")
    private WebElement greenStringText;

    public ClientSideDelayPage clickOnBlueButton() {
        blueButton.click();
        return this;
    }

    public String getGreenStringText() {
        String text = greenStringText.getText();
        System.out.println(text);
        return text;
    }




}
