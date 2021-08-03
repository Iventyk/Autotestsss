import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAppTest extends BaseTest {

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
    public void testSampleApp() {
        String expectedResult = "Welcome, lol!";
        String testResult = homePage.openSampleAppPage()
                .enterName("lol")
                .enterPassword("pwd")
                .clickLogInButton()
                .getLogInStatus();

        Assert.assertEquals(testResult, expectedResult);
    }
}