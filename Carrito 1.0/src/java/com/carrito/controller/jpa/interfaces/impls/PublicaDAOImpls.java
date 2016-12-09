/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller.jpa.interfaces.impls;

import com.carrito.Controller.interfaces.PublicadorDAO;
import com.carrito.model.Publicador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author david
 */
public class PublicaDAOImpls implements PublicadorDAO{
    
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("persistenceUnitName");
    EntityManager em= emf.createEntityManager();

    @Override
    public void guardar(Publicador e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    @Override
    public List<Publicador> extraerTodos() {
        return null;
    }

    @Override
    public List<Publicador> buscarDatos(String s) {
        return null;
    }

    @Override
    public void actualizar(Publicador e, int i) {
        
    }

    @Override
    public void borrar(int i) {
        
    }

    @Override
    public void borrarTodos() {
        
    }
    
}
