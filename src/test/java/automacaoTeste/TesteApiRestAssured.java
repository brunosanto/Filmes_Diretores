package automacaoTeste;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automacaoTeste/feature/apiRest.feature", glue = {"automacaoTeste"},
                    monochrome = true, dryRun = false)
public class TesteApiRestAssured {
}
