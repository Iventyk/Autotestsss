import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private String url = "http://www.uitestingplayground.com/";

    @FindBy(id = "title")
    private WebElement pageTitle;

    @FindBy(linkText = "Text Input")
    private WebElement textInputLink;

    @FindBy(linkText = "Dynamic ID")
    private WebElement dynamicIDLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;

    @FindBy(linkText = "Class Attribute")
    private WebElement classAttributeLink;

    public HomePage openHomePage() {
        driver.get(url);
        return this;
    }

    public InputTextPage openInputTextPage() {
        textInputLink.click();
        return new InputTextPage(driver);
    }

    public DynamicIDPage openDynamicIDPage() {
        dynamicIDLink.click();
        return new DynamicIDPage(driver);
    }

    public ProgressBarPage openProgressBarPage() {
        progressBarLink.click();
        return new ProgressBarPage(driver);
    }

    public ClassAttributePage openClassAttributePage() {
        classAttributeLink.click();
        return new ClassAttributePage(driver);
    }
}
