#language: es

  Característica: Realziar registro con usuario correcto

    Escenario: Registro con usuario valido
      Dado que el usuario esta en el viaja al registro
      Cuando el usuario ingrese Primer nombre "Andres" el Apellido "Gomez" el Telefono"3164748879" el Email "Andres227@gmail.com" la Direccion"carrera22"La Ciudad"Medellin" el State"Antio"El codigo Postal"8855" User "Andres789" Passwor "andres123*" Confirm"andres123*"
      Y selecciona el pais"ARUBA"
      Entonces da al boton enviar y visualiza el mensaje de registro exitoso