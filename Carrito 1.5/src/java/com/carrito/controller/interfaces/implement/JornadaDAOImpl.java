/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller.interfaces.implement;

import com.carrito.controller.interfaces.JornadaDAO;
import com.carrito.dao.implement.singleton.EntityManagerSingleton;
import com.carrito.model.Jornada;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author david
 */
public class JornadaDAOImpl implements JornadaDAO{
    
    EntityManager em= EntityManagerSingleton.getInstanceEntityManager();

    @Override
    public void guardar(Jornada j) {
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    }

    @Override
    public List<Jornada> extraerTodos() {
        List<Jornada> jornadas;
        jornadas= em.createNamedQuery("Jornada.findAll").getResultList();
        return jornadas;
    }

    @Override
    public List<Jornada> buscarDatos(String s) {
        return null;
    }

    @Override
    public void actualizar(Jornada j) {
        em.getTransaction().begin();
        em.merge(j);
        em.getTransaction().commit();
    }

    @Override
    public void borrar(Jornada j) {
        em.getTransaction().begin();
        em.remove(j);
        em.getTransaction().commit();
    }

    @Override
    public void borrarTodos() {
        
    }
    
}
