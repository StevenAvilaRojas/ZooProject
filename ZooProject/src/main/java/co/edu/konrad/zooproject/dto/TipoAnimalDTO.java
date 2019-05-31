package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class TipoAnimalDTO {

    private Long idTipoAnimal;
    private String nombreAnimal;

    public TipoAnimalDTO() {
    }

    public TipoAnimalDTO(TipoAnimalEntity tipoAnimal) {
        this.idTipoAnimal = tipoAnimal.getIdTipoAnimal();
        this.nombreAnimal = tipoAnimal.getNombreAnimal();
    }

    public TipoAnimalEntity toEntity() {
        TipoAnimalEntity tipoAnimal = new TipoAnimalEntity();
        tipoAnimal.setIdTipoAnimal(this.idTipoAnimal);
        tipoAnimal.setNombreAnimal(this.nombreAnimal);
        return tipoAnimal;
    }

    public static List<TipoAnimalDTO> toTipoAnimalList(List<TipoAnimalEntity> tipoAnimal) {

        List<TipoAnimalDTO> listaTipoAnimal = new ArrayList<>();

        for (int i = 0; i < tipoAnimal.size(); i++) {

            listaTipoAnimal.add(new TipoAnimalDTO(tipoAnimal.get(i)));

        }

        return listaTipoAnimal;

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
