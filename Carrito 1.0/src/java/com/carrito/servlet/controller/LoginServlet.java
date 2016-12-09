/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author agustina
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        //me llega la url "proyecto/login/out"
        String action = (request.getPathInfo() != null ? request.getPathInfo() : "");
        HttpSession sesion = request.getSession();
        if (action.equals("/out")) {
            sesion.invalidate();
            response.sendRedirect("/home.jsp");
        } else {

        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        HttpSession sesion = request.getSession();
        String usuario, password;
        usuario = request.getParameter("user");
        password = request.getParameter("password");
        //deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
        if (usuario.equals("admin") && password.equals("admin") && sesion.getAttribute("usuario") == null) {
            //si coincide usuario y password y además no hay sesión iniciada
            sesion.setAttribute("usuario", usuario);
            //redirijo a página con información de login exitoso
            response.sendRedirect("loginExito.jsp");
        } else {
            //lógica para login inválido
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
