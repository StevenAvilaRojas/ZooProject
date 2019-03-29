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
 * Definicion Tabla-Evaluacion-Animal
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */

@Entity
public class EvaluacionAnimalEntity implements Serializable{

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_evaluacion;

    //Id Animal
    @JoinColumn
    @ManyToOne
    private AnimalEntity idAnimal;

    //Observacion
    @Column
    private String observacion;

    //Calificacion
    @Column
    private Long calificacion;

    //Fecha evaluacion animal
    @Column(name ="fecha_evaluacion_animal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEvaluacionAnimal;


    //Constructor

    public EvaluacionAnimalEntity() {
    }


    //Getters and Setters

    public Long getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(Long id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public AnimalEntity getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(AnimalEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaEvaluacionAnimal() {
        return fechaEvaluacionAnimal;
    }

    public void setFechaEvaluacionAnimal(Date fechaEvaluacionAnimal) {
        this.fechaEvaluacionAnimal = fechaEvaluacionAnimal;
    }

 

}
