import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollbarsPage extends Base {

    public ScrollbarsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"badButton\"]")
    private WebElement blueButton;

}
