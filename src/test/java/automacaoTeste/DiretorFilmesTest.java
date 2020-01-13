package automacaoTeste;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources/features/diretor.feature", glue = {
		"automacaoTeste/steps" }, monochrome = true, dryRun = false)
public class DiretorFilmesTest {
}
