/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Definicion Tabla EvaluacionShow
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class EvaluacionShowEntity {

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvaluacionShow;

    //Attr calificacion
    @Column
    private String calificacion;

    //Attr observacion
    @Column
    private String observacion;

    //Constructor
    public EvaluacionShowEntity() {
    }
    
    //Getters and Setters

    public Long getIdEvaluacionShow() {
        return idEvaluacionShow;
    }

    public void setIdEvaluacionShow(Long idEvaluacionShow) {
        this.idEvaluacionShow = idEvaluacionShow;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
    

}
