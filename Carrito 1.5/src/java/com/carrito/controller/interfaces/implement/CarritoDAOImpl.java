/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller.interfaces.implement;

import com.carrito.controller.interfaces.GenericDAO;
import com.carrito.dao.implement.singleton.EntityManagerSingleton;
import com.carrito.model.Carrito;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author david
 */
public class CarritoDAOImpl implements GenericDAO<Carrito>{
    
    EntityManager em= EntityManagerSingleton.getInstanceEntityManager();

    @Override
    public void guardar(Carrito c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    @Override
    public List<Carrito> extraerTodos() {
        List<Carrito> carritos;
        carritos= em.createNamedQuery("Carrito.findAll").getResultList();
        return carritos;
    }

    @Override
    public List<Carrito> buscarDatos(String s) {
        return null;
    }

    @Override
    public void actualizar(Carrito c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }

    @Override
    public void borrar(Carrito c) {
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }

    @Override
    public void borrarTodos() {
        
    }
    
}
