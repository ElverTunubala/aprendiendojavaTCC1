package org.example;

public class Producto {
    //atributos
    String nombre;
    int precioUnitario;
    String descripcion;

    //constructor

    public Producto() {
    }
    public Producto(String nombre, int precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public double calcularIVA(){
        return 0;
    }
}
