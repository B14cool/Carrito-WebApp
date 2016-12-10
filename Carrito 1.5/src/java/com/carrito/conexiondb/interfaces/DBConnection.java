/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.conexiondb.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public interface DBConnection {
    Connection conectar() throws SQLException;
    void desconectar(Connection con);
}
