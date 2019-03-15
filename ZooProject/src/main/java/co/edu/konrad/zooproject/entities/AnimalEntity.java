package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Definicion Tabla-Animal
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class AnimalEntity  implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnimal;
    //Id cuidador
    @Column(name ="id_cuidador")
    private Long idCuidador;
    //Nombre Animal
    @Column(name ="nombre_animal")
    private String nombreAnimal;
    //Nombre Cientifico
    @Column(name ="nom_cientifico")
    private String nombreCientifico;
    //Id tipo animal
    @Column(name ="id_tipo_animal")
    private Long idTipoAnimal;
    //Especie
    @Column
    private String especie;
    //Descripcion
    @Column
    private String descripcion;

    public AnimalEntity() {
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(Long idCuidador) {
        this.idCuidador = idCuidador;
    }

    public Long getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(Long idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }
    
    

}
