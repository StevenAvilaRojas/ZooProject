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
 * @author Steven
 */
@Entity
public class TipoAnimalEntity implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoAnimal;
    //Carnivoro
    @Column(name = "nombre_animal")
    private String nombreAnimal;

    public TipoAnimalEntity() {
    }

    public Long getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(Long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    
}
