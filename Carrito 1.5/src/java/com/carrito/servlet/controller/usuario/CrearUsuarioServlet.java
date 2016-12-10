/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.servlet.controller.usuario;

import com.carrito.controller.interfaces.implement.PublicadorDAOImpl;
import com.carrito.model.Publicador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "CrearUsuarioServlet", urlPatterns = {"/CrearUsuarioServlet"})
public class CrearUsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PublicadorDAOImpl publicadorDAO= new PublicadorDAOImpl();
        Publicador publicador= new Publicador();
        
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String password= request.getParameter("passowrd");
        
        publicador.setNombrePublicador(nombre);
        publicador.setApellidoPublicador(apellido);
        publicador.setPasswordPublicador(password);
        
        publicadorDAO.guardar(publicador);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
