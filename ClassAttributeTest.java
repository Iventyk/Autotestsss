import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassAttributeTest extends BaseTest {
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
    public void testClassAttribute() {
        String expectedResult = ("btn class1 btn-primary btn-test", "btn class2 btn-primary btn-test", "btn class3 btn-primary btn-test");
        String testResult = homePage.openClassAttributePage()
                .clickOnBlueButton()
                .clickAlertButtonOK()
                .getBtnPrimary();
        Assert.assertEquals(testResult, expectedResult);
    }
}
