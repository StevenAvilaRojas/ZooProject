package co.edu.konrad.zooproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Definicion Tabla-Animal-Alimento
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Entity
public class AnimalAlimentoEntity  implements Serializable{
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnimalAlimento;
    //Atrr Id Animal
    @JoinColumn
    @ManyToOne
    private AnimalEntity animal;
    //Atrr Alimento
    @JoinColumn
    @ManyToOne
    private AlimentoEntity alimento;

    public AnimalAlimentoEntity() {
       }

    public Long getIdAnimalAlimento() {
        return idAnimalAlimento;
    }

    public void setIdAnimalAlimento(Long idAnimalAlimento) {
        this.idAnimalAlimento = idAnimalAlimento;
    }

    public AnimalEntity getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalEntity animal) {
        this.animal = animal;
    }

    public AlimentoEntity getAlimento() {
        return alimento;
    }

    public void setAlimento(AlimentoEntity alimento) {
        this.alimento = alimento;
    }




}
