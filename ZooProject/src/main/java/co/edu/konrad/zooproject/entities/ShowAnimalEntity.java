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
public class ShowAnimalEntity implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue
    private Long id_show_animal;
    //id_show
    @Column(name = "id_show")
    private Long idShow;
    //id_animal
    @Column(name = "id_animal")
    private Long idAnimal;

    public ShowAnimalEntity() {
    }

    public Long getId_show_animal() {
        return id_show_animal;
    }

    public void setId_show_animal(Long id_show_animal) {
        this.id_show_animal = id_show_animal;
    }

    public Long getIdShow() {
        return idShow;
    }

    public void setIdShow(Long idShow) {
        this.idShow = idShow;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

}
