package co.com.practica.model.entitys.login;

import co.com.practica.model.RealizaLogin;

public class LoginEntity {

  private static RealizaLogin realizarLogin;

  private LoginEntity() {
  }
  public static RealizaLogin getRealizarLogin() {
    return realizarLogin;
  }

  public static void setRealizarLogin(RealizaLogin realizarLogin) {
    LoginEntity.realizarLogin = realizarLogin;
  }
}
