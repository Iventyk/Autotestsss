import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    public void setUp() {
        System.setProperty("Webdriver.chrome.driver", "/home/ivan/Downloads/chromedriver_linux64.zip");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.uitestingplayground.com/");
    }
    public void tearDown() {
        driver.quit();
    }
}
