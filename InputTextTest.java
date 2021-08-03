import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputTextTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void testInputText() {
        String expectedResult = "WoOoOoOoW";
        String testResult = homePage.openHomePage().openInputTextPage()
                .enterButtonText("WoOoOoOoW")
                .clickOnBlueButton()
                .getBlueButtonText();
        Assert.assertEquals(testResult, expectedResult);
    }



}
