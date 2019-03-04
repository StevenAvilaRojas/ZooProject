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
 * Definicion Tabla-Animal-Alimento
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class AnimalAlimentoEntity  implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnimalAlimento;
    //Atrr Id Animal
    @Column(name ="animal")
    private Long animal;
    //Atrr Alimento
    @Column(name ="alimento")
    private Long alimento;

    public AnimalAlimentoEntity() {
       }

    public Long getIdAnimalAlimento() {
        return idAnimalAlimento;
    }

    public void setIdAnimalAlimento(Long idAnimalAlimento) {
        this.idAnimalAlimento = idAnimalAlimento;
    }

    public Long getAnimal() {
        return animal;
    }

    public void setAnimal(Long animal) {
        this.animal = animal;
    }

    public Long getAlimento() {
        return alimento;
    }

    public void setAlimento(Long alimento) {
        this.alimento = alimento;
    }



}
