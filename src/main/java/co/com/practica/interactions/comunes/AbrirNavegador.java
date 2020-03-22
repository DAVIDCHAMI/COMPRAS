package co.com.practica.interactions.comunes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.practica.userinterface.MyStore;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {
  private MyStore myStore;

  public static AbrirNavegador enMyStore() {
    return instrumented(AbrirNavegador.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(myStore));
  }
}
