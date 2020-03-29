package co.com.practica.tasks.registro;

import static co.com.practica.model.entitys.registro.RegistrarUsuarioEntity.getRegistrarUsuario;
import static co.com.practica.userinterface.MyStore.*;
import static co.com.practica.userinterface.registro.Registros.*;

import co.com.practica.model.RegistrarUsuario;
import co.com.practica.model.entitys.registro.RegistrarUsuarioEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RealizarRegistro implements Task {

  public RealizarRegistro(RegistrarUsuario registrarUsuario) {
    RegistrarUsuarioEntity.setRegistrarUsuario(registrarUsuario);
  }

  public static RealizarRegistro conSusDatos(RegistrarUsuario registrarUsuario) {
    return Tasks.instrumented(RealizarRegistro.class, registrarUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(LBL_LOGIN),
        Enter.theValue(RegistrarUsuarioEntity.getRegistrarUsuario().getEmail())
            .into(TXT_CORREO_REGISTRO),
        Click.on(BTN_CREAR_CUENTA),
        Click.on(RB_GENERO_MASCULINO),
        Enter.theValue(getRegistrarUsuario().getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
        Enter.theValue(getRegistrarUsuario().getUltimoNombre()).into(TXT_SEGUNDO_NOMBRE),
        Enter.theValue(getRegistrarUsuario().getPassword()).into(TXT_CLAVE),
        Enter.theValue(getRegistrarUsuario().getEmpresa()).into(TXT_EMPRESA),
        Enter.theValue(getRegistrarUsuario().getDomicilio()).into(TXT_DIRECCION),
        Enter.theValue(getRegistrarUsuario().getCiudad()).into(TXT_CIUDAD));
    actor.attemptsTo(SelectFromOptions.byValue("1").from(LST_ESTADOS));
    actor.attemptsTo(
        Enter.theValue(getRegistrarUsuario().getCodigoPostal()).into(TXT_CODIGO_POSTAL),
        Enter.theValue(getRegistrarUsuario().getMovil()).into(TXT_TELEFONO),
        Enter.theValue(getRegistrarUsuario().getAlias()).into(TXT_ALIAS),
        Click.on(BTN_REGISTRAR));
  }
}
