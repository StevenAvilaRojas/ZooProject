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
     * obtener Show Animal por Id
     *
     * @param id
     * @return Show Animal
     * @throws java.lang.IllegalAccessException
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
     * @param showAnimal
     * @param Id, showAnimal actualizar showAnimal
     * @return showAnimalActualizar
     */
    public ShowAnimalEntity actualizarShowAnimal(ShowAnimalEntity showAnimal, Long Id) {
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
