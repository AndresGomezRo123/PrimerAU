#language: es

  Característica: Realziar login con usuario correcto

  Escenario: logueo con usuario valido

        Dado que el usuario esta en el portal
        Cuando el ingresa su usuario  "cocovarela@gmail.com" y la clave "Thomas13*"
        Entonces el usuario ingresa su cuenta y visualiza el mensaje "Login Successfully"