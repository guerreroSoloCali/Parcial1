package org.example;

import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.entity.Inventario;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Inventario inventario = new Inventario();
        inventario.agregarProducto("Bicicleta", 1000000.0);


    }
}