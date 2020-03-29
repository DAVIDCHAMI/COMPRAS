package co.com.practica.runners.loginm;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/login/login.feature",
    glue = {"co.com.practica.stepdefinitions.registro", "co.com.practica.stepdefinitions.loginn"},
    snippets = SnippetType.CAMELCASE)
public class Login {}
