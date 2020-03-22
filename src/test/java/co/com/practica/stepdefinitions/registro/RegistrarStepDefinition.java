package co.com.practica.stepdefinitions.registro;

import static co.com.practica.questions.ValidarRegistro.nombreUsuario;
import static co.com.practica.tasks.RealizarRegistro.conSusDatos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

import co.com.practica.interactions.comunes.AbrirNavegador;
import co.com.practica.model.RegistrarUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistrarStepDefinition {

  @Before
  public void initialConfiguration() {
    setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) navega a la pagina de my store$")
  public void queCHAMINavegaALaPaginaDeMyStore(String nombre) throws Exception {
    theActorCalled(nombre).wasAbleTo(AbrirNavegador.enMyStore());
  }

  @Cuando("^realice el registro en la pagina$")
  public void realiceElRegistroEnLaPagina(List<RegistrarUsuario> info) throws Exception {
    theActorInTheSpotlight().attemptsTo(conSusDatos(info.get(0)));
  }

  @Entonces("^debera ver mensaje de registro exitoso\\.$")
  public void deberaVerMensajeDeRegistroExitoso(List<String> mensaje) throws Exception {
    theActorInTheSpotlight().should(seeThat(nombreUsuario(), equalTo(mensaje.get(0))));
  }
}
