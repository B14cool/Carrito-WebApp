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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author agustina
 */
@Entity
@Table(name = "semanas", catalog = "carrito", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semanas.findAll", query = "SELECT s FROM Semanas s")
    , @NamedQuery(name = "Semanas.findById", query = "SELECT s FROM Semanas s WHERE s.id = :id")
    , @NamedQuery(name = "Semanas.findBySemana", query = "SELECT s FROM Semanas s WHERE s.semana = :semana")})
public class Semanas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @Temporal(TemporalType.TIME)
    private Date id;
    @Column(name = "semana")
    @Temporal(TemporalType.TIMESTAMP)
    
    private Date semana;

    public Semanas() {
    }

    public Semanas(Date id) {
        this.id = id;
    }

    public Semanas(Date id, Date semana) {
        this.id = id;
        this.semana = semana;
    }

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public Date getSemana() {
        return semana;
    }

    public void setSemana(Date semana) {
        this.semana = semana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semanas)) {
            return false;
        }
        Semanas other = (Semanas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carrito.Model.Semanas[ id=" + id + " ]";
    }

}
