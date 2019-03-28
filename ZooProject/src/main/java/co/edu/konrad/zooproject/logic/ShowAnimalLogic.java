/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;


import co.edu.konrad.zooproject.entities.ShowAnimalEntity;
import co.edu.konrad.zooproject.persistence.ShowAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class ShowAnimalLogic {

    @Inject
    private ShowAnimalPersistence persistence;

    public List<ShowAnimalEntity> obtenerShowAnimal() {
        List<ShowAnimalEntity> showAnimal = persistence.findAll();
        return showAnimal;
    }

    /**
     * obtener ShowAnimal
     *
     * @return Id
     */
    public ShowAnimalEntity obtenerShowAnimal(Long id) throws IllegalAccessException {
        ShowAnimalEntity showAnimal = persistence.find(id);
        if (showAnimal == null) {
            throw new IllegalAccessException("No Se Encontro Show Animal");
        }
        return showAnimal;
    }

    /**
     * obtener Show Animal por Id
     *
     * @return Show Animal
     */
    public ShowAnimalEntity obtenerShowAnimalPorId(Long id) throws IllegalAccessException {
        ShowAnimalEntity showAnimal = persistence.find(id);
        if (showAnimal == null) {
            throw new IllegalAccessException("No Se Encontro Show Animal");
        }
        return showAnimal;
    }

    /**
     * @param showAnimal crear showAnimal
     * @return Show Animal
     */
    public ShowAnimalEntity crearShowAnimal(ShowAnimalEntity showAnimal) {
        persistence.create(showAnimal);
        return showAnimal;
    }

    /**
     * @param Id, showAnimal actualizar showAnimal
     * @return showAnimalActualizar
     */
    public ShowAnimalEntity actualizarShowAnimal(Long Id, ShowAnimalEntity showAnimal) {
        ShowAnimalEntity showAnimalActualizar = persistence.update(showAnimal);
        return showAnimalActualizar;

    }

    /**
     * eliminar showAnimal
     *
     * @param Id
     *
     */
    public void eliminarShowAnimal(Long Id) {
        persistence.delete(Id);

    }

}
