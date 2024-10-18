package com.example.recyclerview.modelos;
import android.content.Intent;
public class Persona {
    private String Nombre;
    private String Telefono;
    private String color;
    private int imagen;

    // Constructor con dos parametros
    public Persona(String nombre, String telefono, String color, int imagen){
        Nombre = nombre;
        Telefono = telefono;
        this.color = color;
        this.imagen = imagen;
    }

    // Constructor con tres parametros
    public Persona(String nombre, String telefono, Intent accion, String color, int imagen){
        Nombre = nombre;
        Telefono = telefono;
        this.color = color;
        this.imagen = imagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

}
