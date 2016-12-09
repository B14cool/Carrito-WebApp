/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.Controller.interfaces;

import java.util.List;

/**
 *
 * @author david
 * @param <Entity>
 */
public interface GenericDAO<Entity> {
    

    void guardar(Entity e);

    List<Entity> extraerTodos();

    List<Entity> buscarDatos(String s);

    void actualizar(Entity e, int i);

    void borrar(int i);

    void borrarTodos();
}
