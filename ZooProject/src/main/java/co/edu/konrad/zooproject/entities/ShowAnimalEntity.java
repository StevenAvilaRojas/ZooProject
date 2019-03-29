/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Definicion Tabla-Show-Animal
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class ShowAnimalEntity implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue
    private Long id_show_animal;
    //id_show
    @JoinColumn
    @ManyToOne
    private ShowEntity idShow;
    //id_animal
    @JoinColumn
    @ManyToOne
    private AnimalEntity idAnimal;

    public ShowAnimalEntity() {
    }

    public Long getId_show_animal() {
        return id_show_animal;
    }

    public void setId_show_animal(Long id_show_animal) {
        this.id_show_animal = id_show_animal;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public AnimalEntity getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(AnimalEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    

}
