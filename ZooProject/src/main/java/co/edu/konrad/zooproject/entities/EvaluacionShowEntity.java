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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 * Definicion Tabla EvaluacionShow
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class EvaluacionShowEntity implements Serializable {

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvaluacionShow;

    //Attr calificacion
    @Column
    private String calificacion;
    //Atrr id_show
    @JoinColumn
    @ManyToOne
    private ShowEntity idShow;
    //Attr observacion
    @Column
    private String observacion;
    //fecha
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
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

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
    
    

}
