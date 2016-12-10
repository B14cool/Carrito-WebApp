/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.servlet.controller.carrito;

import com.carrito.controller.interfaces.implement.CarritoDAOImpl;
import com.carrito.model.Carrito;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "CrearCarritoServlect", urlPatterns = {"/CrearCarritoServlect"})
public class CrearCarritoServlect extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarritoDAOImpl carritoDAO= new CarritoDAOImpl();
        Carrito carrito= new Carrito();
        
        String ubicacion= request.getParameter("ubicacion");
        
        carrito.setUbicacionCarrito(ubicacion);
        carritoDAO.guardar(carrito);
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
