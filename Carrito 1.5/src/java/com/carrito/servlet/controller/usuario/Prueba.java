/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.servlet.controller.usuario;

import com.carrito.controller.interfaces.implement.PublicadorDAOImpl;
import com.carrito.model.Publicador;
import java.util.Date;

/**
 *
 * @author david
 */
public class Prueba {
 
    public static void main(String[] args) {
        Date fecha = new Date("12/09/2016");
        Publicador pub = new Publicador(), pub2 = new Publicador(), pub3 = new Publicador();
        
//        pub.setNombrePublicador("Mariano");
//        pub.setApellidoPublicador("Rodríguez");
//        pub.setUbicacionCarrito("Piedra blanca");
//        pub.setFechaPublicador(fecha);
//        
//        pub2.setNombrePublicador("Raymond");
//        pub2.setApellidoPublicador("Pozo");
//        pub2.setUbicacionCarrito("Parte atrás");
//        pub2.setFechaPublicador(fecha);
        
        pub3.setNombrePublicador("Maria");
        pub3.setApellidoPublicador("César");
        pub3.setUbicacionCarrito("Las Espinas, Espaillat");
        
        PublicadorDAOImpl pubImp = new PublicadorDAOImpl();
        pubImp.guardar(pub3);
      
        
    }
}
