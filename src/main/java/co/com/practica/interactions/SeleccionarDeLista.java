package co.com.practica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarDeLista implements Interaction {

  private Target lstEstados;
  private String index;

  public SeleccionarDeLista(String index, Target lstEstados) {
    this.lstEstados = lstEstados;
    this.index = index;
  }

  public static Object estado(String index, Target lstEstados) {
    return Tasks.instrumented(SeleccionarDeLista.class, index, lstEstados);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    Click.on(lstEstados);
    actor.attemptsTo(SelectFromOptions.byValue(index).from(lstEstados));
  }
}
