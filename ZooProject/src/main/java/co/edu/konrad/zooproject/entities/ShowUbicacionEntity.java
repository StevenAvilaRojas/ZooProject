/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Definicion Tabla ShowUbicacion 
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */

@Entity
public class ShowUbicacionEntity implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_show_ubicacion;
    
    
    //Id Show
    @JoinColumn
    @ManyToOne
    private ShowEntity idShow; 
    
    //Id Ubicaion
    @JoinColumn
    @ManyToOne
    private UbicacionEntity idUbicacion;
    
    //Constructor

    public ShowUbicacionEntity() {
    }
    
    //Getters and Setters

    public Long getId_show_ubicacion() {
        return id_show_ubicacion;
    }

    public void setId_show_ubicacion(Long id_show_ubicacion) {
        this.id_show_ubicacion = id_show_ubicacion;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public UbicacionEntity getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(UbicacionEntity idUbicacion) {
        this.idUbicacion = idUbicacion;
    }


    
}
