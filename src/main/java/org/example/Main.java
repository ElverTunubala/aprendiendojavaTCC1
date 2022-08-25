package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creo un objeto de la clase producto
        Producto producto= new Producto();
        System.out.println("el nombre del producto es: "+producto.nombre);

        Producto producto2= new Producto("empanada",2000,"jumm");

        //creo un objeto de la clase cliente
        Cliente cliente=new Cliente("juan","105546",33,"6675755",true);










    }
}