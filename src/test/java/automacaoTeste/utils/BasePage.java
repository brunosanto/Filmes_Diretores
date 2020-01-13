package automacaoTeste.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage<T> {

    TestRule selenium = new TestRule();

    private static JavascriptExecutor js;

    private static WebDriver driver;

    private Class<T> type;

    public BasePage() {
        selenium.getDriver();
        driver = TestRule.driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

}
