package base;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config implements Constants {

    public static String driver;

    static {
        getConfig();
    }

    public static WebDriver createWebDriver() {
        switch (driver) {
            case CHROME_DRIVER:
                new ChromeDriver();
                break;
        }
        return null;
    }

    private static void getConfig() {
        Properties properties = new Properties();
        try (FileInputStream in = new FileInputStream(PATH_PROPERTY_FILE)) {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("Sorry, unable to find config.properties");
        }
        driver = properties.getProperty("Driver");
    }
}
