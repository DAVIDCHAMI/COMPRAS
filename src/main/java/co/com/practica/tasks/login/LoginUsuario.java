package co.com.practica.tasks.login;

import static co.com.practica.userinterface.MyStore.LBL_LOGIN;
import static co.com.practica.userinterface.login.Logi.*;

import co.com.practica.model.RealizaLogin;
import co.com.practica.model.entitys.login.LoginEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginUsuario implements Task {

  public LoginUsuario(RealizaLogin realizarLogin) {
    LoginEntity.setRealizarLogin(realizarLogin);
  }

  public static LoginUsuario seLoguea(RealizaLogin realizarLogin) {
    return Tasks.instrumented(LoginUsuario.class, realizarLogin);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(LBL_LOGIN),
        Enter.theValue(LoginEntity.getRealizarLogin().getEmail()).into(TXT_CORREO),
        Enter.theValue(LoginEntity.getRealizarLogin().getPassword()).into(TXT_CLAVE),
        Click.on(BTN_LOGIN_USUARIO));
  }
}
