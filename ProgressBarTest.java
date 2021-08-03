import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {

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
    public void testProgressBar() {
        String expectedResult = "75";
        String testResult = homePage.openProgressBarPage()
                .clickOnStartButton()
                .waitUntil()
                .clickOnStopButton()
                .getStoppedBarValue();
        Assert.assertEquals(testResult, expectedResult);
    }
}
