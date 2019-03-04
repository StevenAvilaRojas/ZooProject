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
public class UbicacionEntity implements Serializable{

    //Llave Primaria
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id_ubicacion;


   //Ocupado
   @Column
   private boolean ocupado;


   //Constructor
    public UbicacionEntity() {
    }

    //Getter And Setter

    public Long getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Long id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

}
