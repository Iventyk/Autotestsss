import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicTableTest extends BaseTest {

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

//    @Test
//    public void testDynamicTabl() {
//        String tableCPU = homePage.openDynamicTablePage()
//                .getTableCPU();
//
//        Assert.assertEquals(tableCPU, "Task Manager");
//    }
//
//    @Test
//    public void testDynamicTable() {
//        String stringCPU = homePage.openDynamicTablePage()
//                .getYellowStringCPU();
//    }
}
