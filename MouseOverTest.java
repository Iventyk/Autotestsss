import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest{

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
    public void testMouseOver() {
        String expectedResult = "2";
        String testResult = homePage.openMouseOverPage()
                .clickOnClickMe1()
                .clickOnClickMe()
                .getClickedTimesText();

        Assert.assertEquals(testResult, expectedResult);
    }

}
