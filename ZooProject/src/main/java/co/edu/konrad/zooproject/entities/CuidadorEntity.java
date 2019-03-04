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
import javax.persistence.Temporal;

/**
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */

@Entity
public class CuidadorEntity implements Serializable{

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCuidador;

    //Nombre Cuidador
    @Column(name = "nom_completo")
    private String nomCompleto;

    //Numero Id
    @Column(name = "numero_id")
    private Long numeroId;

    //Tipo Id
    @Column(name = "tipo_id")
    private String tipoId;

    //Fecha Nacimiento
    @Column(name = "fecha_nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;

    //Celular
    @Column
    private Long celular;

    //Id Animal
    @Column(name = "id_animal")
    private Long idAnimal;

    //Constructor

    public CuidadorEntity() {
    }

    //Getter And Setter

    public Long getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(Long idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public Long getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(Long numeroId) {
        this.numeroId = numeroId;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

}
