package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.AlimentoEntity;
import co.edu.konrad.zooproject.entities.AnimalAlimentoEntity;
import co.edu.konrad.zooproject.entities.AnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class AnimalAlimentoDTO {

    private Long idAnimalAlimento;
    private AnimalEntity animal;
    private AlimentoEntity alimento;

    public AnimalAlimentoDTO(AnimalAlimentoEntity animalAlimento) {
        this.idAnimalAlimento = animalAlimento.getIdAnimalAlimento();
        this.animal = animalAlimento.getAnimal();
        this.alimento = animalAlimento.getAlimento();
    }

    public AnimalAlimentoEntity toEntity() {
        AnimalAlimentoEntity animalAlimento = new AnimalAlimentoEntity();
        animalAlimento.setIdAnimalAlimento(this.idAnimalAlimento);
        animalAlimento.setAnimal(this.animal);
        animalAlimento.setAlimento(this.alimento);
        return animalAlimento;
    }

    public static List<AnimalAlimentoDTO> toAnimalAlimentoList(List<AnimalAlimentoEntity> animalAlimento) {

        List<AnimalAlimentoDTO> listaAnimalAlimento = new ArrayList<>();

        for (int i = 0; i < animalAlimento.size(); i++) {

            listaAnimalAlimento.add(new AnimalAlimentoDTO(animalAlimento.get(i)));

        }

        return listaAnimalAlimento;

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
