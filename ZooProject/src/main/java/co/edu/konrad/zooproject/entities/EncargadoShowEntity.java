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
 *  Definicion Tabla-Encargado
 * @author Alexander Nicholls
 */

@Entity
public class EncargadoShowEntity implements Serializable{

    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEncargadoShow;

    //Atrr Tipo Id
    @Column(name = "tipoId")
    private String tipoId;

    //Atrr Numero Id
    @Column(name = "numeroId")
    private Long numeroId;

    //Atrr Fecha Nacimiento
    @Column(name = "fechaNacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;

    //Celular
    @Column(name = "celular")
    private Long celular;

    //Atrr Nombre
    @Column(name = "nombre")
    private String nombre;

    //Constructor

    public EncargadoShowEntity() {
    }

    //Getter And Setter
    public Long getIdEncargadoShow() {
        return idEncargadoShow;
    }

    public void setIdEncargadoShow(Long idEncargadoShow) {
        this.idEncargadoShow = idEncargadoShow;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public Long getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(Long numeroId) {
        this.numeroId = numeroId;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}