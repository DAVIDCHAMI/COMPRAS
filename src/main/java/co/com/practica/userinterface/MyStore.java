package co.com.practica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.practica.utils.constant.ConstainTypesClass.UI_CLASS;

public class MyStore extends PageObject {
  public static final Target LBL_LOGIN =
      Target.the("Link para realizar login").locatedBy("//a[@class='login']");
  public static final Target TXT_CORREO_REGISTRO =
      Target.the("campo para registar correo").located(By.id("email_create"));
  public static final Target BTN_CREAR_CUENTA =
      Target.the("crear cuenta").located(By.id("SubmitCreate"));
}
