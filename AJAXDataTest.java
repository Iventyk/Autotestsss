import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AJAXDataTest extends BaseTest {


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
    public void testAJAXData() {
        homePage.openAJAXDataPage()
                .clickOnBlueButton();
//                .getGreenStringText();
    }
}
