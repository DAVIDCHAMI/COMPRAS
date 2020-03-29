package co.com.practica.stepdefinitions.loginn;

import static co.com.practica.tasks.login.LoginUsuario.seLoguea;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import co.com.practica.model.RealizaLogin;
import cucumber.api.java.es.Cuando;
import java.util.List;

public class RealizarLogin {

  @Cuando("^realice el login$")
  public void realiceElLogin(List<RealizaLogin> data) {
    theActorInTheSpotlight().attemptsTo(seLoguea(data.get(0)));
  }
}
