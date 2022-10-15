package base;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Log;

public abstract class BaseTest {

    protected WebDriver driver;
    private Logger logger;

    public BaseTest() {
        logger = LoggerFactory.getLogger(BaseTest.class);
    }

    @BeforeClass
    public static void beforeClass() {
        System.setProperty(Config.driverName, Config.pathForDriverInternal);
    }

    @Before
    public void setUp(){
        driver = Config.createWebDriver();
        driver.manage().window().maximize();

        logger.info(Log.startMessage());
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @AfterClass
    public static void afterClass() {

    }
}
