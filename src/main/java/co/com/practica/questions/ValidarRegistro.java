package co.com.practica.questions;

import static co.com.practica.userinterface.registro.Registros.MSG_CONFIRMACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRegistro implements Question<String> {

  public static ValidarRegistro nombreUsuario() {
    return new ValidarRegistro();
  }

  @Override
  public String answeredBy(Actor actor) {
    return MSG_CONFIRMACION.resolveFor(actor).getText().toString();
  }
}
