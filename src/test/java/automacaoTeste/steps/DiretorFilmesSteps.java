package automacaoTeste.steps;

import automacaoTeste.object.DiretorFilmesObject;
import automacaoTeste.page.GooglePage;
import automacaoTeste.utils.TestRule;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;



public class DiretorFilmesSteps {

     GooglePage googlePage = new GooglePage();
     JavascriptExecutor js = (JavascriptExecutor)TestRule.driver;

     ArrayList<DiretorFilmesObject> dados = new ArrayList();

    @Dado("que tenho os dados diretor e filme cadastrados")
    public void que_tenho_os_dados_diretor_e_filme_cadastrados() {

        DiretorFilmesObject filmeDiretor = new DiretorFilmesObject();
            filmeDiretor.setNomeDiretor("Steven Spilberg");
            filmeDiretor.setNomeFilme("Parque dos Dinossauros");

        DiretorFilmesObject filmeDiretor2 = new DiretorFilmesObject();
             filmeDiretor2.setNomeDiretor(" Quentin Tarantino");
             filmeDiretor2.setNomeFilme("Parque dos Dinossauros");

        dados.add(filmeDiretor);
        dados.add(filmeDiretor2);
    }

    @Dado("que acesse o site do google para pesquisar")
    public void que_acesse_o_google_para_pesquisar() throws Exception {
        TestRule.driver.get("https://www.google.com.br");
        TestRule.driver.manage().window().maximize();
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
    }

    @Quando("informo os dados de filme e diretor e clico em buscar")
    public void informo_os_dados_de_filme_e_diretor_e_clico_em_buscar() {
        String diretor = dados.get(0).getNomeDiretor();
        String filme = dados.get(0).getNomeFilme();

        googlePage.campoPesquisa.sendKeys(diretor + " " + filme);
        googlePage.botaoPesquisar.click();
    }

    @Entao("valido os resultados obtidos")
    public void valido_os_resultados_obtidos() {
        System.out.println("O resultado aproximado é: " + googlePage.resultados.getText().toString().replaceAll("[^0-9]", ""));
        TestRule.resetarDriver();
    }

}
