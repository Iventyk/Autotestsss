import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends Base {

    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "UserName")
    private WebElement fieldName;

    @FindBy(name = "Password")
    private WebElement fieldPassword;

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement logInButton;

    @FindBy(xpath = "//*[@id=\"loginstatus\"]")
    private WebElement logInStatus;

    public SampleAppPage enterName(String inputText) {
        fieldName.sendKeys(inputText);
        return this;
    }

    public SampleAppPage enterPassword(String inputText) {
        fieldPassword.sendKeys(inputText);
        return this;
    }

    public SampleAppPage clickLogInButton() {
        logInButton.click();
        return this;
    }

    public String getLogInStatus() {
        String result = logInStatus.getText();
        System.out.println(result);
        return result;
    }

}
