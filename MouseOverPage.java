import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends Base {

    public MouseOverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/section/div/div[1]/a")
    private WebElement clickMeButton1;

    @FindBy(className = "text-warning")
    private WebElement clickMeButton;

    @FindBy(xpath = "//*[@id=\"clickCount\"]")
    private WebElement clickedTimes;


    public MouseOverPage clickOnClickMe1() {
        clickMeButton1.click();
        return this;
    }

    public MouseOverPage clickOnClickMe() {
        clickMeButton.click();
        return this;
    }

    public String getClickedTimesText() {
        String result = clickedTimes.getText();
        System.out.println(result);
        return result;
    }


}
