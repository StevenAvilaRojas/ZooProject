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
   private Long idUbicacion;


   //Ocupado
   @Column
   private boolean ocupado;


   //Constructor
    public UbicacionEntity() {
    }

    //Getter And Setter

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setId_ubicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

}
