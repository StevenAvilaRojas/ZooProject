/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    @Column(name = "id_show")
    private Long idShow; 
    
    //Id Ubicaion
    @Column(name = "id_ubicacion")
    private Long idUbicacion;
    
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
    
}
