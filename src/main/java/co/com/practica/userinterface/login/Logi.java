package co.com.practica.userinterface.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Logi {

  public static final Target TXT_CORREO = Target.the("campo correo").located(By.id("email"));
  public static final Target TXT_CLAVE = Target.the("campo clave").located(By.id("passwd"));
  public static final Target BTN_LOGIN_USUARIO =
      Target.the("boton para el login").located(By.id("SubmitLogin"));
}
