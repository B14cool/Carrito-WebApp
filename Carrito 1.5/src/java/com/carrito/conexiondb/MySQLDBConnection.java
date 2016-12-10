/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.conexiondb;

import com.carrito.conexiondb.interfaces.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class MySQLDBConnection implements DBConnection{
    
    private static MySQLDBConnection INSTANCE;
    private Connection con;

    @Override
    public Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carritodb");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public synchronized static MySQLDBConnection singletonMySQL() {
        if(INSTANCE== null){
            INSTANCE= new MySQLDBConnection();
        }
        return INSTANCE;
    }

    public Connection getCon() {
        return con;
    }
    
    @Override
    public void desconectar(Connection con) {
        if(con!= null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MySQLDBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
