import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyTextPage extends Base {

    public VerifyTextPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space(.)='Welcome UserName!']")
    private WebElement blueString;

    public String getBlueStringText() {
        String result = blueString.getText();
        System.out.println(result);
        return result;
    }

}
