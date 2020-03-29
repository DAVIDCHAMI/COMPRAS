package co.com.practica.model.entitys.registro;

import co.com.practica.model.RegistrarUsuario;

public class RegistrarUsuarioEntity {

  private static RegistrarUsuario registrarUsuario;

  private RegistrarUsuarioEntity() {}

  public static RegistrarUsuario getRegistrarUsuario() {
    return registrarUsuario;
  }

  public static void setRegistrarUsuario(RegistrarUsuario registrarUsuario) {
    RegistrarUsuarioEntity.registrarUsuario = registrarUsuario;
  }
}
