package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.AnimalEntity;
import co.edu.konrad.zooproject.entities.ShowAnimalEntity;
import co.edu.konrad.zooproject.entities.ShowEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class ShowAnimalDTO {

    private Long id_show_animal;
    private ShowEntity idShow;
    private AnimalEntity idAnimal;

    public ShowAnimalDTO(ShowAnimalEntity showAnimal) {
        this.id_show_animal = showAnimal.getId_show_animal();
        this.idShow = showAnimal.getIdShow();
        this.idAnimal = showAnimal.getIdAnimal();
    }

    public ShowAnimalEntity toEntity() {
        ShowAnimalEntity showAnimal = new ShowAnimalEntity();
        showAnimal.setId_show_animal(this.id_show_animal);
        showAnimal.setIdShow(this.idShow);
        showAnimal.setIdAnimal(this.idAnimal);
        return showAnimal;
    }

    public static List<ShowAnimalDTO> toShowAnimalList(List<ShowAnimalEntity> showAnimal) {

        List<ShowAnimalDTO> listaShowAnimal = new ArrayList<>();

        for (int i = 0; i < showAnimal.size(); i++) {

            listaShowAnimal.add(new ShowAnimalDTO(showAnimal.get(i)));

        }

        return listaShowAnimal;

    }

    public Long getId_show_animal() {
        return id_show_animal;
    }

    public void setId_show_animal(Long id_show_animal) {
        this.id_show_animal = id_show_animal;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public AnimalEntity getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(AnimalEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

  
}
