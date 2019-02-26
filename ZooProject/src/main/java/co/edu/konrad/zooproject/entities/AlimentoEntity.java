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
 * Definicion Tabla-Alimento
 * @author Alexander Nicholls
 */
@Entity
public class AlimentoEntity  implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAlimento;
    //Atrr Id Tipo_Animal
    @Column(name ="tipoAnimal")
    private Long tipoAnimal;
    //Atrr Tipo_Alimento
    @Column(name ="tipoAlimento")
    private String tipoAlimento;
    //Atrr Hora_Alimento
    @Column(name ="horaAlimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private DATE horaAlimento;

    public AnimalAlimentoEntity() {
       }

       public Long getIdAlimento(){
         return idAlimento;
       }

       public void setIdAlimento(){
         this.idAlimento = idAlimento;
       }

       public Long getTipoAnimal(){
         return tipoAnimal;
       }

       public void setTipoAnimal(){
         this.tipoAnimal = tipoAnimal;
       }

       public Long getTipoAlimento(){
         return tipoAlimento;
       }

       public void setTipoAlimento(){
         this.tipoAlimento = tipoAlimento;
       }

       public DATE getHoraAlimento(){
         this.horaAlimento = horaAlimento;
       }

       public void setHoraAlimento(DATE horaAlimento){
         this.horaAlimento = horaAlimento;
       }
}
