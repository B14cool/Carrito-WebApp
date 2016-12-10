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
@Table(name = "jornada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jornada.findAll", query = "SELECT j FROM Jornada j")
    , @NamedQuery(name = "Jornada.findByIdJornada", query = "SELECT j FROM Jornada j WHERE j.idJornada = :idJornada")
    , @NamedQuery(name = "Jornada.findByFechaJornada", query = "SELECT j FROM Jornada j WHERE j.fechaJornada = :fechaJornada")
    , @NamedQuery(name = "Jornada.findByDiaJornada", query = "SELECT j FROM Jornada j WHERE j.diaJornada = :diaJornada")})
public class Jornada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jornada")
    private Integer idJornada;
    @Basic(optional = false)
    @Column(name = "fecha_jornada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaJornada;
    @Column(name = "dia_jornada")
    private String diaJornada;

    public Jornada() {
    }

    public Jornada(Integer idJornada) {
        this.idJornada = idJornada;
    }

    public Jornada(Integer idJornada, Date fechaJornada) {
        this.idJornada = idJornada;
        this.fechaJornada = fechaJornada;
    }

    public Integer getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Integer idJornada) {
        this.idJornada = idJornada;
    }

    public Date getFechaJornada() {
        return fechaJornada;
    }

    public void setFechaJornada(Date fechaJornada) {
        this.fechaJornada = fechaJornada;
    }

    public String getDiaJornada() {
        return diaJornada;
    }

    public void setDiaJornada(String diaJornada) {
        this.diaJornada = diaJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJornada != null ? idJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jornada)) {
            return false;
        }
        Jornada other = (Jornada) object;
        if ((this.idJornada == null && other.idJornada != null) || (this.idJornada != null && !this.idJornada.equals(other.idJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carrito.model.Jornada[ idJornada=" + idJornada + " ]";
    }
    
}
