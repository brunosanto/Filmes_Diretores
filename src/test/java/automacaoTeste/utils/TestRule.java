package automacaoTeste.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class TestRule {

    public static WebDriver driver;


    public WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "");

        String os = System.getProperty("os.name").toLowerCase();
        String pathDriver = System.getProperty("user.dir") + "/resources/drivers/";

        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--headless");
          if (os.contains("windows")) {
                File file = new File(pathDriver + "windows/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver(chromeOptions);
          } else if (os.contains("mac")) {
                File file = new File(pathDriver + "mac/chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver(chromeOptions);
          }
        }
        return driver;
    }


    public static void resetarDriver() {
        driver.close();
        driver.quit();
        driver = null;
        }

    }


