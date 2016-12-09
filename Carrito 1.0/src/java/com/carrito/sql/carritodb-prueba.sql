/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  david
 * Created: 09/12/2016
 */

CREATE TABLE IF NOT EXISTS publicador(id_publicador INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_publicador TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                    ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        nombre_publicador VARCHAR(20) NOT NULL,
                                        apellido_publicador VARCHAR(20),
                                        ubicacion_carrito VARCHAR(50),
                                        horario_publicador VARCHAR(25) NOT NULL,
                                        jornada_publicador TIME);

CREATE TABLE IF NOT EXISTS carrito(id_carrito INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_carrito TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        ubicacion_carrito VARCHAR(50) NOT NULL);

CREATE TABLE IF NOT EXISTS horario(id_horario INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_horario TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        turno_horario VARCHAR(25) NOT NULL);

CREATE TABLE IF NOT EXISTS jornada(id_jornada INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_jornada TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                              ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        dia_jornada TIME NOT NULL);

