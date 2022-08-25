package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase Producto
        Producto producto=new Producto();

        //crear un objeto de la clase Scanner
        Scanner entradaPorTeclado=new Scanner(System.in);

        //preguntarle al usuario el nombre del producto
        System.out.println("el producto es: "+producto.nombre);


        System.out.println("Digite el nombre del producto");
        producto.nombre=entradaPorTeclado.next();

        System.out.println("el producto es: "+producto.nombre);

        //crear un objeto de clase Cliente

        Cliente cliente=new Cliente();
        System.out.println("digite el nombre del cliente: ");
        cliente.nombre=entradaPorTeclado.next();

        System.out.println("digite la cedula del cliente: ");
        cliente.cedula=entradaPorTeclado.next();

        System.out.println("digite la edad del cliente: ");
        cliente.edad=entradaPorTeclado.nextByte();

        System.out.println("digite el telefono del cliente: ");
        cliente.telefono=entradaPorTeclado.next();

        


    }
}