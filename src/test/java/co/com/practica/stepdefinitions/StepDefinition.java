package co.com.practica.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.practica.userinterface.MyStore;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinition {

  @Before
  public void initialConfiguration() {
    setTheStage(new OnlineCast());
  }

  MyStore page;

  @Dado("^que (.*) carga los datos de la prueba$")
  public void queJuanCargoLosDatosDeLaPrueba(String actor) {
    theActorCalled(actor).attemptsTo(Open.browserOn(page));
  }
}
