import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends Base {
    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"startButton\"]")
    private WebElement startButton;

    @FindBy(xpath = "//*[@id=\"stopButton\"]")
    private WebElement stopButton;

    @FindBy(xpath = "//*[@id=\"progressBar\"]")
    private WebElement progressBar;

    public ProgressBarPage clickOnStartButton() {
        startButton.click();
        return this;
    }

    public ProgressBarPage waitUntil() {
        WebElement progressBar75 = (new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@aria-valuenow='75']"))));
        return this;
    }

    public ProgressBarPage clickOnStopButton() {
        stopButton.click();
        return this;
    }

    public String getStoppedBarValue() {
        String result = progressBar.getAttribute("aria-valuenow");
        System.out.println(result);
        return result;
    }
}