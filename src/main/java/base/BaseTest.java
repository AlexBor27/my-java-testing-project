package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty(Config.driverName, Config.pathForDriverInternal);
    }

    @Before
    public void setUp(){
        driver = Config.createWebDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @AfterClass
    public static void afterClass() {

    }
}
