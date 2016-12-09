/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  david
 * Created: 08/12/2016
 */
CREATE DATABASE IF NOT EXISTS carritodb;

CREATE TABLE IF NOT EXISTS publicador(id_publicador INT NOT NULL CONSTRAINT publicador_id PRIMARY KEY AUTO_INCREMENT,
                                        fecha_publicador TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                    ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        nombre_publicador VARCHAR(20) NOT NULL,
                                        apellido publicador VARCHAR(20),
                                        congregacion_publicador VARCHAR(40) NOT NULL,
                                        ubicacion_carrito VARCHAR(30),
                                        semana_publicador VARCHAR(25),
                                        horario_publicador VARCHAR(25));

CREATE TABLE IF NOT EXISTS congregacion(id_congregacion INT NOT NULL CONSTRAINT congregacion_id PRIMARY KEY AUTO_INCREMENT,
                                        fecha_congregacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                              ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        nombre_congregacion VARCHAR(25) NOT NULL,
                                        ubicacion_congregacion VARCHAR(15) NOT NULL);

CREATE TABLE IF NOT EXISTS carrito(id_carrito INT NOT NULL CONSTRAINT carrito_id PRIMARY KEY AUTO_INCREMENT,
                                        fecha_carrito TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        congregacion_carrito VARCHAR(35) NOT NULL,
                                        ubicacion_carrito VARCHAR(20) NOT NULL);

CREATE TABLE IF NOT EXISTS ubicacion(id_ubicacion INT NOT NULL CONSTRAINT hubicacion_id PRIMARY KEY AUTO_INCREMENT,
                                        lugar_ubicacion VARCHAR(40) NOT NULL);

CREATE TABLE IF NOT EXISTS horario(id_horario INT NOT NULL CONSTRAINT horario_id PRIMARY KEY AUTO_INCREMENT,
                                        fecha_horario TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        turno_horario VARCHAR(25)NOT NULL);

CREATE TABLE IF NOT EXISTS dia(id_dia INT NOT NULL CONSTRAINT semana_id PRIMARY KEY AUTO_INCREMENT,
                                        fecha_semana TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                              ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        semana VARCHAR (25) NOT NULL);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_carrito
                                FOREIGN KEY (id_publicador)
                                REFERENCES carrito (id_carrito);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_ubicacion
                                FOREIGN KEY (hubicacion_carrito)
                                REFERENCES ubicacion (id_ubicacion);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_horario
                                FOREIGN KEY (horario_publicador)
                                REFERENCES horario (turno_horario);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_semana
                                FOREIGN KEY (semana_publicador)
                                REFERENCES semana (semana);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_congregacion)
                                FOREIGN KEY (congregacion_publicador)
                                REFERENCES congregacion (id_congregacion);

                                ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_