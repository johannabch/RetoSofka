package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resourses/features/registro_de_usuario.feature",
        glue = "stepdefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class RegistroDeUsuarioRunner {
}