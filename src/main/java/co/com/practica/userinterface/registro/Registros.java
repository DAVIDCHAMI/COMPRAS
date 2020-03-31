package co.com.practica.userinterface.registro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.practica.utils.constant.ConstainTypesClass.UI_CLASS;

public class Registros {
  public static final Target RB_GENERO_MASCULINO =
      Target.the("radio buton para hombres").located(By.id("uniform-id_gender1"));
  public static final Target RB_GENERO_FEMENINO =
      Target.the("radio buton para mujeres").located(By.id("uniform-uniform-id_gender2"));
  public static final Target TXT_PRIMER_NOMBRE =
      Target.the("campo primer nombre").located(By.id("customer_firstname"));
  public static final Target TXT_SEGUNDO_NOMBRE =
      Target.the("segundo nombre").located(By.id("customer_lastname"));
  public static final Target TXT_CLAVE = Target.the("clave").located(By.id("passwd"));
  public static final Target TXT_PRIMER_NOMBRE_DIRECCION =
      Target.the("primer nombre direccion").located(By.id("firstname"));
  public static final Target TXT_ULTIMO_NOMBRE_DIRECCION =
      Target.the("segundo nombre direccion").located(By.id("lastname"));
  public static final Target TXT_EMPRESA = Target.the("empresa").located(By.id("company"));
  public static final Target TXT_DIRECCION = Target.the("direccion").located(By.id("address1"));
  public static final Target TXT_CIUDAD = Target.the("ciudad").located(By.id("city"));
  public static final Target LST_ESTADOS = Target.the("estados").located(By.id("id_state"));
  public static final Target TXT_CODIGO_POSTAL =
      Target.the("codigo postal").located(By.id("postcode"));
  public static final Target TXT_TELEFONO = Target.the("telefono").located(By.id("phone_mobile"));
  public static final Target TXT_ALIAS = Target.the("").located(By.id("alias"));
  public static final Target BTN_REGISTRAR =
      Target.the("registrar").located(By.id("submitAccount"));
  public static final Target MSG_CONFIRMACION =
      Target.the("mensaje confirmacion ").locatedBy(("//a[@class='account']/span"));

  private Registros() {
    throw new IllegalStateException(UI_CLASS);
  }
}
