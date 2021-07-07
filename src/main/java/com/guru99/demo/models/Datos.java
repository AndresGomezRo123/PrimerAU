package com.guru99.demo.models;

public class Datos {
    String usuario;
    String clave;

    public Datos(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
