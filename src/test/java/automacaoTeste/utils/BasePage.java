package automacaoTeste.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage<T> {

    TestRule selenium = new TestRule();

    private static WebDriver driver;

    public BasePage() {
        selenium.getDriver();
        driver = TestRule.driver;
        PageFactory.initElements(driver, this);	
    }

}
