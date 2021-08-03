import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTextTest extends BaseTest{

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
    public void testVerifyText() {
        String expectedResult = "Welcome UserName!";
        String testResult = homePage.openVerifyTextPage()
                .getBlueStringText();

        Assert.assertEquals(testResult, expectedResult);
    }

}
