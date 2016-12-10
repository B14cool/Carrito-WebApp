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
@Table(name = "carrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrito.findAll", query = "SELECT c FROM Carrito c")
    , @NamedQuery(name = "Carrito.findByIdCarrito", query = "SELECT c FROM Carrito c WHERE c.idCarrito = :idCarrito")
    , @NamedQuery(name = "Carrito.findByFechaCarrito", query = "SELECT c FROM Carrito c WHERE c.fechaCarrito = :fechaCarrito")
    , @NamedQuery(name = "Carrito.findByUbicacionCarrito", query = "SELECT c FROM Carrito c WHERE c.ubicacionCarrito = :ubicacionCarrito")})
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carrito")
    private Integer idCarrito;
    @Basic(optional = false)
    @Column(name = "fecha_carrito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarrito;
    @Basic(optional = false)
    @Column(name = "ubicacion_carrito")
    private String ubicacionCarrito;

    public Carrito() {
    }

    public Carrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Carrito(Integer idCarrito, Date fechaCarrito, String ubicacionCarrito) {
        this.idCarrito = idCarrito;
        this.fechaCarrito = fechaCarrito;
        this.ubicacionCarrito = ubicacionCarrito;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Date getFechaCarrito() {
        return fechaCarrito;
    }

    public void setFechaCarrito(Date fechaCarrito) {
        this.fechaCarrito = fechaCarrito;
    }

    public String getUbicacionCarrito() {
        return ubicacionCarrito;
    }

    public void setUbicacionCarrito(String ubicacionCarrito) {
        this.ubicacionCarrito = ubicacionCarrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrito != null ? idCarrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrito)) {
            return false;
        }
        Carrito other = (Carrito) object;
        if ((this.idCarrito == null && other.idCarrito != null) || (this.idCarrito != null && !this.idCarrito.equals(other.idCarrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carrito.model.Carrito[ idCarrito=" + idCarrito + " ]";
    }
    
}
