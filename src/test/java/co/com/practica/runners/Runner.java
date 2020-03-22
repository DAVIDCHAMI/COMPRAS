package co.com.practica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/feature.feature",
    glue = {"co.com.practica.stepdefinitions"},
    snippets = SnippetType.CAMELCASE)
public class Runner {}
