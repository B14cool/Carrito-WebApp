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
@Table(name = "horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")
    , @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario")
    , @NamedQuery(name = "Horario.findByFechaHorario", query = "SELECT h FROM Horario h WHERE h.fechaHorario = :fechaHorario")
    , @NamedQuery(name = "Horario.findByTurnoHorario", query = "SELECT h FROM Horario h WHERE h.turnoHorario = :turnoHorario")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_horario")
    private Integer idHorario;
    @Basic(optional = false)
    @Column(name = "fecha_horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHorario;
    @Basic(optional = false)
    @Column(name = "turno_horario")
    private String turnoHorario;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Horario(Integer idHorario, Date fechaHorario, String turnoHorario) {
        this.idHorario = idHorario;
        this.fechaHorario = fechaHorario;
        this.turnoHorario = turnoHorario;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Date getFechaHorario() {
        return fechaHorario;
    }

    public void setFechaHorario(Date fechaHorario) {
        this.fechaHorario = fechaHorario;
    }

    public String getTurnoHorario() {
        return turnoHorario;
    }

    public void setTurnoHorario(String turnoHorario) {
        this.turnoHorario = turnoHorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carrito.model.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
