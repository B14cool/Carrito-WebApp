/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller.interfaces.implement;

import com.carrito.controller.interfaces.HorarioDAO;
import com.carrito.dao.implement.singleton.EntityManagerSingleton;
import com.carrito.model.Horario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author david
 */
public class HorarioDAOImpl implements HorarioDAO{
    
    EntityManager em= EntityManagerSingleton.getInstanceEntityManager();

    @Override
    public void guardar(Horario h) {
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
    }

    @Override
    public List<Horario> extraerTodos() {
        List<Horario> horarios;
        horarios= em.createNamedQuery("Horario.findAll").getResultList();
        return horarios;
    }

    @Override
    public List<Horario> buscarDatos(String h) {
        return null;
    }

    @Override
    public void actualizar(Horario h) {
        em.getTransaction().begin();
        em.merge(h);
        em.getTransaction().commit();
    }

    @Override
    public void borrar(Horario h) {
     em.getTransaction().begin();
     em.remove(h);
     em.getTransaction().commit();
    }

    @Override
    public void borrarTodos() {
        
    }
    
}
