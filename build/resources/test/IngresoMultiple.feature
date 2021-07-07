#language: es

Característica: Realziar login con con varius usuarios

  Esquema del escenario: : logueo con varios usuarios

    Dado que el usuario esta en el portal X
    Cuando el ingresa su usuario y la clave
    |usuario|clave|
    |<usuario>|<clave>|
    Entonces visualiza el mensaje "Login Successfully"

    Ejemplos:
    |usuario|clave|
    |cocovarela@gmail.com|Thomas13*|
    |daniel000           |1230     |
    |andresffr           |4567895  |