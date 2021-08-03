import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicTablePage extends Base {

    public DynamicTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/section/div/div")
    private WebElement table;

    @FindBy(xpath = "/html/body/section/div/p[2]")
    private WebElement yellowStringCPU;

    @FindBy(xpath = "//span[text()='Chrome']/following-sibling::span[contains(text(), '%')]")
    private WebElement tableCPU;

    public String getYellowStringCPU() {
        DynamicTablePage dynamicTablePage = new DynamicTablePage(driver);
        String stringCPU = dynamicTablePage.yellowStringCPU.getText();
        return stringCPU.split(" ")[2];
    }

    public String getTableCPU() {
        DynamicTablePage dynamicTablePage = new DynamicTablePage(driver);
        return dynamicTablePage.tableCPU.getText();
    }


}
