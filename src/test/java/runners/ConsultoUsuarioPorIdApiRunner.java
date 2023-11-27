package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resourses/features/consulta_usuario_por_id_api.feature",
        glue = "stepdefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class ConsultoUsuarioPorIdApiRunner {
}
