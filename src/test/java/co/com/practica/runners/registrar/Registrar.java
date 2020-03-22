package co.com.practica.runners.registrar;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/registrar/registrar.feature",
    glue = {"co.com.practica.stepdefinitions.registro"},
    snippets = SnippetType.CAMELCASE)
public class Registrar {}
