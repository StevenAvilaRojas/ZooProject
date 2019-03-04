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
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */

@Entity
public class EvaluacionAnimalEntity implements Serializable{

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_evaluacion;

    //Id Animal
    @Column(name = "id_animal")
    private Long idAnimal;

    //Observacion
    @Column
    private String observacion;

    //Calificacion
    @Column
    private Long calificacion;

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

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
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



}
