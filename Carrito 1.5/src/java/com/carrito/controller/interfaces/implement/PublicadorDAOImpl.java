/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller.interfaces.implement;

import com.carrito.controller.interfaces.PublicadorDAO;
import com.carrito.dao.implement.singleton.EntityManagerSingleton;
import com.carrito.model.Publicador;
import java.util.List;
import javax.persistence.EntityManager;

public class PublicadorDAOImpl implements PublicadorDAO {

    EntityManager em = EntityManagerSingleton.getInstanceEntityManager();

    @Override
    public void guardar(Publicador p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    @Override
    public List<Publicador> extraerTodos() {
        List<Publicador> publicadores;
        publicadores= em.createNamedQuery("Publicador.findAll").getResultList();
        return publicadores;
    }

    @Override
    public List<Publicador> buscarDatos(String s) {
        return null;
    }

    @Override
    public void actualizar(Publicador p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    @Override
    public void borrar(Publicador p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    @Override
    public void borrarTodos() {

    }
}
