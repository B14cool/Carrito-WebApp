/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.dao.implement.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author david
 */
public class EntityManagerSingleton {
    
    private static EntityManagerFactory emf= null;
    private static EntityManager em= null;

    public static EntityManager getInstanceEntityManager() {
        if(emf==null){
            emf= Persistence.createEntityManagerFactory("Carrito_1.2PU");
        }
        if(em==null){
            em= emf.createEntityManager();
        }
        return em;
    }
    
}
