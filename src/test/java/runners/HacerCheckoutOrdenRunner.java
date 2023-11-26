package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resourses/features/hacer_checkout_de_una_orden.feature",
        glue = "stepdefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class HacerCheckoutOrdenRunner {
}
