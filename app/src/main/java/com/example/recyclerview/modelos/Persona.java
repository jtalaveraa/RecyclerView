package com.example.recyclerview.modelos;
import android.content.Intent;
public class Persona {
    private String Nombre;
    private String Telefono;
    private Intent accion;

    // Constructor con dos parametros
    public Persona(String nombre, String telefono){
        Nombre = nombre;
        Telefono = telefono;
    }

    // Constructor con tres parametros
    public Persona(String nombre, String telefono, Intent accion){
        Nombre = nombre;
        Telefono = telefono;
        this.accion = accion;
    }

    // Obtener el valor de la variable
    public String getNombre() {return Nombre;}

    // Establecer el valor o darle un nombre
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    // Obtener el valor de telefono
    public String getTelefono() {return Telefono;}

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Intent getAccion() {return accion;}

    public void setAccion(Intent accion) {
        this.accion = accion;
    }
}
