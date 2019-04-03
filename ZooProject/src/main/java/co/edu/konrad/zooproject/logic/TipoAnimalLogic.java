/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.TipoAnimalEntity;
import co.edu.konrad.zooproject.persistence.TipoAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class TipoAnimalLogic {

    @Inject
    private TipoAnimalPersistence persistence;

    public List<TipoAnimalEntity> obtenerTipoAnimal() {
        List<TipoAnimalEntity> tipoAnimal = persistence.findAll();
        return tipoAnimal;
    }

    /**
     * obtener TipoAnimal por Id
     *
     * @param id
     * @return Tipo de Animal
     * @throws java.lang.IllegalAccessException
     */
    public TipoAnimalEntity obtenerTipoAnimalPorId(Long id) throws IllegalAccessException {
        TipoAnimalEntity tipoAnimal = persistence.find(id);
        if (tipoAnimal == null) {
            throw new IllegalAccessException("No Se Encontro Tipo de Animal");
        }
        return tipoAnimal;
    }

    /**
     * @param tipoAnimal crear tipoAnimal
     * @return tipo de animal
     */
    public TipoAnimalEntity crearTipoAnimal(TipoAnimalEntity tipoAnimal) {
        persistence.create(tipoAnimal);
        return tipoAnimal;
    }

    /**
     * @param Id, tipoAnimal actualizar tipoAnimal
     * @param tipoAnimal
     * @return tipoAnimalActualizar
     */
    public TipoAnimalEntity actualizarTipoAnimal(TipoAnimalEntity tipoAnimal, Long Id) {
        TipoAnimalEntity tipoAnimalActualizar = persistence.update(tipoAnimal);
        return tipoAnimalActualizar;

    }

    /**
     * eliminar tipoAnimal
     *
     * @param Id
     *
     */
    public void eliminarTipoAnimal(Long Id) {
        persistence.delete(Id);

    }

}
