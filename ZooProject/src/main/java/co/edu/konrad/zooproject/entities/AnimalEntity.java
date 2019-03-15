package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    //Nombre Animal
    @Column(name ="nombre_animal")
    private String nombreAnimal;
    //Nombre Cientifico
    @Column(name ="nom_cientifico")
    private String nombreCientifico;
    //Id tipo animal
    @JoinColumn
    @ManyToOne
    private TipoAnimalEntity idTipoAnimal;
    //Id Cuidador
    @JoinColumn
    @OneToMany
    private CuidadorEntity idCuidador;
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

    public TipoAnimalEntity getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(TipoAnimalEntity idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public CuidadorEntity getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(CuidadorEntity idCuidador) {
        this.idCuidador = idCuidador;
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
}
