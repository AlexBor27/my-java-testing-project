package base;

import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.LogHelper;

public abstract class BaseTest {

    protected WebDriver driver;
    private Logger logger;

    @Rule
    public TestWatcher watchman = new TestWatcher() {

        @Override
        public void starting(Description method) {
            logger.info("Run Test:", method.getMethodName());
        }

        @Override
        public void succeeded(Description method) {
            logger.info("Test succeeded:", method.getMethodName());
        }

        @Override
        public void failed(Throwable e, Description method) {
            logger.error("Test failed:", method.getMethodName(), e);
        }
    };

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

        logger.info(LogHelper.startMessage());
    }

    @After
    public void tearDown(){
        logger.info(LogHelper.finishMessage());
        driver.quit();
    }

    @AfterClass
    public static void afterClass() {

    }
}
