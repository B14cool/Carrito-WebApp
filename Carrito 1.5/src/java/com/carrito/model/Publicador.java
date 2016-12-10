/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "publicador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicador.findAll", query = "SELECT p FROM Publicador p")
    , @NamedQuery(name = "Publicador.findByIdPublicador", query = "SELECT p FROM Publicador p WHERE p.idPublicador = :idPublicador")
    , @NamedQuery(name = "Publicador.findByFechaPublicador", query = "SELECT p FROM Publicador p WHERE p.fechaPublicador = :fechaPublicador")
    , @NamedQuery(name = "Publicador.findByNombrePublicador", query = "SELECT p FROM Publicador p WHERE p.nombrePublicador = :nombrePublicador")
    , @NamedQuery(name = "Publicador.findByApellidoPublicador", query = "SELECT p FROM Publicador p WHERE p.apellidoPublicador = :apellidoPublicador")
    , @NamedQuery(name = "Publicador.findByPasswordPublicador", query = "SELECT p FROM Publicador p WHERE p.passwordPublicador = :passwordPublicador")
    , @NamedQuery(name = "Publicador.findByTipoUsuario", query = "SELECT p FROM Publicador p WHERE p.tipoUsuario = :tipoUsuario")
    , @NamedQuery(name = "Publicador.findByIdCarrito", query = "SELECT p FROM Publicador p WHERE p.idCarrito = :idCarrito")
    , @NamedQuery(name = "Publicador.findByIdHorario", query = "SELECT p FROM Publicador p WHERE p.idHorario = :idHorario")
    , @NamedQuery(name = "Publicador.findByIdJornada", query = "SELECT p FROM Publicador p WHERE p.idJornada = :idJornada")})
public class Publicador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_publicador")
    private Integer idPublicador;
    @Basic(optional = false)
    @Column(name = "fecha_publicador")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicador;
    @Basic(optional = false)
    @Column(name = "nombre_publicador")
    private String nombrePublicador;
    @Column(name = "apellido_publicador")
    private String apellidoPublicador;
    @Basic(optional = false)
    @Column(name = "password_publicador")
    private String passwordPublicador;
    @Basic(optional = false)
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
    @Column(name = "id_carrito")
    private Integer idCarrito;
    @Column(name = "id_horario")
    private Integer idHorario;
    @Column(name = "id_jornada")
    private Integer idJornada;

    public Publicador() {
    }

    public Publicador(Integer idPublicador) {
        this.idPublicador = idPublicador;
    }

    public Publicador(Integer idPublicador, Date fechaPublicador, String nombrePublicador, String passwordPublicador, String tipoUsuario) {
        this.idPublicador = idPublicador;
        this.fechaPublicador = fechaPublicador;
        this.nombrePublicador = nombrePublicador;
        this.passwordPublicador = passwordPublicador;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getIdPublicador() {
        return idPublicador;
    }

    public void setIdPublicador(Integer idPublicador) {
        this.idPublicador = idPublicador;
    }

    public Date getFechaPublicador() {
        return fechaPublicador;
    }

    public void setFechaPublicador(Date fechaPublicador) {
        this.fechaPublicador = fechaPublicador;
    }

    public String getNombrePublicador() {
        return nombrePublicador;
    }

    public void setNombrePublicador(String nombrePublicador) {
        this.nombrePublicador = nombrePublicador;
    }

    public String getApellidoPublicador() {
        return apellidoPublicador;
    }

    public void setApellidoPublicador(String apellidoPublicador) {
        this.apellidoPublicador = apellidoPublicador;
    }

    public String getPasswordPublicador() {
        return passwordPublicador;
    }

    public void setPasswordPublicador(String passwordPublicador) {
        this.passwordPublicador = passwordPublicador;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Integer idJornada) {
        this.idJornada = idJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicador != null ? idPublicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicador)) {
            return false;
        }
        Publicador other = (Publicador) object;
        if ((this.idPublicador == null && other.idPublicador != null) || (this.idPublicador != null && !this.idPublicador.equals(other.idPublicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carrito.model.Publicador[ idPublicador=" + idPublicador + " ]";
    }
    
}
