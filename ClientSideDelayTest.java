import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientSideDelayTest extends  BaseTest {

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
    public void ClientSideDelay() {
        String expectedResult = "Data calculated on the client side.";
        String testResult = homePage.openClientSideDelayPage()
                .clickOnBlueButton()
                .getGreenStringText();
        Assert.assertEquals(testResult, expectedResult);
    }

}
