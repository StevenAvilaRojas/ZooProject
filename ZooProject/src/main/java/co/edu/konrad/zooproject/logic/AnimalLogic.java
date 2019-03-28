/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.AnimalEntity;
import co.edu.konrad.zooproject.persistence.AnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class AnimalLogic {

    @Inject
    private AnimalPersistence persistence;

    public List<AnimalEntity> obtenerAnimales() {
        List<AnimalEntity> animales = persistence.findAll();
        return animales;
    }

    /**
     * obtener animal
     *
     * @return Id
     */
    public AnimalEntity obtenerAnimal(Long id) throws IllegalAccessException {
        AnimalEntity animal = persistence.find(id);
        if (animal == null) {
            throw new IllegalAccessException("No Se Encontro Animal");
        }
        return animal;
    }

    /**
     * obtener Animal por Id
     *
     * @return animal
     */
    public AnimalEntity obtenerAnimalPorId(Long id) throws IllegalAccessException {
        AnimalEntity animal = persistence.find(id);
        if (animal == null) {
            throw new IllegalAccessException("No Se Encontro Animal ");
        }
        return animal;
    }

    /**
     * @param animal crear Animal
     * @return animal
     */
    public AnimalEntity crearAnimal(AnimalEntity animal) {
        persistence.create(animal);
        return animal;
    }

    /**
     * @param Id,  actualizar animal
     * @return animalActualizar
     */
    public AnimalEntity actualizarAnimal(Long Id, AnimalEntity animal) {
        AnimalEntity animalActualizar = persistence.update(animal);
        return animalActualizar;

    }

    /**
     * eliminar animal
     *
     * @param Id
     *
     */
    public void eliminarAnimal(Long Id) {
        persistence.delete(Id);

    }

}
