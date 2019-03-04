/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import java.util.Date;

/**
 * Definicion Tabla-Show
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */

@Entity
public class ShowEntity implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue
    private Long idShow;
    //Lugar
    @Column (name= "id_ubicacion")
    private Long idUbicacion;
    
    //Hora incio
    @Column (name = "hora_inicio")
    private Date horaIncio;
    
    //Hora Final
    @Column (name = "hora_fin")
    private Date horaFin;
    
    //Animales
    @Column (name = "animales")
    private String animales;
    
    
    //nombre
    @Column (name ="nombre")
    private String nombre;

    public ShowEntity() {
    }

    public Long getIdShow() {
        return idShow;
    }

    public void setIdShow(Long idShow) {
        this.idShow = idShow;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Date getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(Date horaIncio) {
        this.horaIncio = horaIncio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getAnimales() {
        return animales;
    }

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
