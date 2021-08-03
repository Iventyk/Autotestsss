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

    @FindBy(linkText = "Hidden Layers")
    private WebElement hiddenLayersLink;

    @FindBy(linkText = "Load Delay")
    private WebElement loadDelayLink;

    @FindBy(linkText = "AJAX Data")
    private WebElement AJAXDataLink;

    @FindBy(linkText = "Client Side Delay")
    private WebElement clientSideDelayLink;

    @FindBy(linkText = "Click")
    private WebElement clickLink;

    @FindBy(linkText = "Scrollbars")
    private WebElement scrollbarsLink;

    @FindBy(linkText = "Dynamic Table")
    private WebElement dynamicTableLink;

    @FindBy(linkText = "Verify Text")
    private WebElement verifyTextLink;

    @FindBy(linkText = "Visibility")
    private WebElement visibilityLink;

    @FindBy(linkText = "Sample App")
    private WebElement sampleAppLink;

    @FindBy(linkText = "Mouse Over")
    private WebElement mouseOverLink;

    @FindBy(linkText = "Non-Breaking Space")
    private WebElement nonBreakingSpaceLink;


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

    public HiddenLayersPage openHiddenLayersPage() {
        hiddenLayersLink.click();
        return new HiddenLayersPage(driver);
    }

    public LoadDelayPage openLoadDelayPage() {
        loadDelayLink.click();
        return new LoadDelayPage(driver);
    }

    public AJAXDataPage openAJAXDataPage() {
        AJAXDataLink.click();
        return new AJAXDataPage(driver);
    }

    public ClientSideDelayPage openClientSideDelayPage() {
        clientSideDelayLink.click();
        return new ClientSideDelayPage(driver);
    }

    public ClickPage openClickPage() {
        clickLink.click();
        return new ClickPage(driver);
    }

    public DynamicTablePage openDynamicTablePage() {
        dynamicTableLink.click();
        return new DynamicTablePage(driver);
    }

    public VerifyTextPage openVerifyTextPage() {
        verifyTextLink.click();
        return new VerifyTextPage(driver);
    }

    public VisibilityPage openVisibilityPage() {
        visibilityLink.click();
        return new VisibilityPage(driver);
    }

    public SampleAppPage openSampleAppPage() {
        sampleAppLink.click();
        return new SampleAppPage(driver);
    }

    public MouseOverPage openMouseOverPage() {
        mouseOverLink.click();
        return new MouseOverPage(driver);
    }

    public NonBreakingSpacePage openNonBreakingSpacePage() {
        nonBreakingSpaceLink.click();
        return new NonBreakingSpacePage(driver);
    }

    public ScrollbarsPage openScrollbarsPage() {
        scrollbarsLink.click();
        return new ScrollbarsPage(driver);
    }
}
