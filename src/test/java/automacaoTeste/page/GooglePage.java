package automacaoTeste.page;

import automacaoTeste.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage<GooglePage> {

    @FindBy(xpath = "//input[@type='text']")
    public WebElement campoPesquisa;

    @FindBy(xpath = "//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")
    public WebElement botaoPesquisar;

    @FindBy(id = "resultStats")
    public  WebElement resultados;

}
