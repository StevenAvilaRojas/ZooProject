/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.EvaluacionAnimalEntity;
import co.edu.konrad.zooproject.persistence.EvaluacionAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class EvaluacionAnimalLogic {

    @Inject
    private EvaluacionAnimalPersistence persistence;

    public List<EvaluacionAnimalEntity> obtenerEvaluacionAnimal() {
        List<EvaluacionAnimalEntity> evaluacionAnimal = persistence.findAll();
        return evaluacionAnimal;
    }

      /**
     * obtener EvaluacionAnimal por Id
     *
     * @param id
     * @return evaluacionAnimal
     */
    public EvaluacionAnimalEntity obtenerEvaluacionAnimalPorId(Long id) throws IllegalAccessException {
        EvaluacionAnimalEntity evaluacionAnimal = persistence.find(id);
        if (evaluacionAnimal == null) {
            throw new IllegalAccessException("No Se Encontro Evaluacion Animal");
        }
        return evaluacionAnimal;
    }

    /**
     * @param evaluacionAnimal crear EvaluacionAnimal
     * @return evaluacionAnimal
     */
    public EvaluacionAnimalEntity crearEvaluacionAnimal(EvaluacionAnimalEntity evaluacionAnimal) {
        persistence.create(evaluacionAnimal);
        return evaluacionAnimal;
    }

    /**
     * @param evaluacionAnimal
     * @param Id, evaluacionAnimal actualizar evaluacionAnimal
     * @return evaluacionAnimalActualizar
     */
    public EvaluacionAnimalEntity actualizarEvaluacionAnimal(EvaluacionAnimalEntity evaluacionAnimal, Long Id) {
        EvaluacionAnimalEntity evaluacionAnimalActualizar = persistence.update(evaluacionAnimal);
        return evaluacionAnimalActualizar;

    }

    /**
     * eliminar evaluacionAnimal
     *
     * @param Id
     *
     */
    public void eliminarEvaluacionAnimal(Long Id) {
        persistence.delete(Id);

    }

}
