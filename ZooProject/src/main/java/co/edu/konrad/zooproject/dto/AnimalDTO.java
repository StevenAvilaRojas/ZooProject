package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.AnimalEntity;
import co.edu.konrad.zooproject.entities.CuidadorEntity;
import co.edu.konrad.zooproject.entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class AnimalDTO {

    private Long idAnimal;
    private String nombreAnimal;
    private String nombreCientifico;
    private TipoAnimalEntity idTipoAnimal;
    private CuidadorEntity idCuidador;
    private String especie;
    private String descripcion;

    public AnimalDTO(AnimalEntity animal) {
        this.idAnimal = getIdAnimal();
        this.nombreAnimal = getNombreAnimal();
        this.nombreCientifico = getNombreCientifico();
        this.idTipoAnimal = getIdTipoAnimal();
        this.idCuidador = getIdCuidador();
        this.especie = getEspecie();
        this.descripcion = getDescripcion();
    }

    public AnimalEntity toEntity() {
        AnimalEntity animal = new AnimalEntity();
        animal.setIdAnimal(this.idAnimal);
        animal.setNombreAnimal(this.nombreAnimal);
        animal.setNombreCientifico(this.nombreCientifico);
        animal.setIdTipoAnimal(this.idTipoAnimal);
        animal.setIdCuidador(this.idCuidador);
        animal.setEspecie(this.especie);
        animal.setDescripcion(this.descripcion);
        return animal;
    }

    public static List<AnimalDTO> toAnimalList(List<AnimalEntity> animal) {

        List<AnimalDTO> listaAnimal = new ArrayList<>();

        for (int i = 0; i < animal.size(); i++) {

            listaAnimal.add(new AnimalDTO(animal.get(i)));

        }

        return listaAnimal;

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
