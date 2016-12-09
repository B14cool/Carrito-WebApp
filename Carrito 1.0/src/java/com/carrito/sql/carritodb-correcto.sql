/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  david
 * Created: 08/12/2016
 */


CREATE TABLE IF NOT EXISTS publicador(id_publicador INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_publicador TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                    ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        nombre_publicador VARCHAR(20) NOT NULL,
                                        apellido publicador VARCHAR(20),
                                        ubicacion_carrito VARCHAR(30),
                                        id_horario INT UNIQUE,
                                        id_jornada INT UNIQUE);

CREATE TABLE IF NOT EXISTS carrito(id_carrito INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_carrito TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        ubicacion_carrito VARCHAR(20) NOT NULL);

CREATE TABLE IF NOT EXISTS horario(id_horario INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_horario TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                                        ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        turno_horario VARCHAR(25) NOT NULL);

CREATE TABLE IF NOT EXISTS jornada(id_horario INT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
                                        fecha_jornada TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                                              ON UPDATE CURRENT_TIMESTAMP NOT NULL,
                                        dia_jornada TIME NOT NULL);

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_carrito
                                FOREIGN KEY (id_publicador)
                                REFERENCES carrito (id_carrito)
                                ON DELETE CASCADE ON UPDATE CASCADE;

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_horario
                                FOREIGN KEY (horario_publicador)
                                REFERENCES horario (turno_horario)
                                ON DELETE CASCADE ON UPDATE CASCADE;

                            ALTER TABLE publicador
                                ADD CONSTRAINT fk_publicador_jornada
                                FOREIGN KEY (jornada_publicador)
                                REFERENCES jornada (dia_jornada)
                                ON DELETE CASCADE ON UPDATE CASCADE;