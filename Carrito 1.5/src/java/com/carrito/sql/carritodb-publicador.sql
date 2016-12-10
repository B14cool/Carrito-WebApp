/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  david
 * Created: 09/12/2016
 */

CREATE DATABASE IF NOT EXISTS carritodb;

CREATE TABLE IF NOT EXISTS publicador(id_publicador INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_publicador TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                    ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        nombre_publicador VARCHAR(20) NOT NULL,
                                        apellido_publicador VARCHAR(20),
                                        ubicacion_carrito VARCHAR(30));

