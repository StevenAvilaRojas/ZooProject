/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;


import co.edu.konrad.zooproject.entities.EvaluacionShowEntity;
import co.edu.konrad.zooproject.persistence.EvaluacionShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class EvaluacionShowLogic {

    @Inject
    private EvaluacionShowPersistence persistence;

    public List<EvaluacionShowEntity> obtenerEvaluacionShow() {
        List<EvaluacionShowEntity> evaluacionShow = persistence.findAll();
        return evaluacionShow;
    }

    /**
     * obtener evalaucionshow por Id
     *
     * @param id
     * @return evaluacionshow
     */
    public EvaluacionShowEntity obtenerEvaluacionShowPorId(Long id) throws IllegalAccessException {
        EvaluacionShowEntity evaluacionShow = persistence.find(id);
        if (evaluacionShow == null) {
            throw new IllegalAccessException("No Se Encontro Evaluacion del Show");
        }
        return evaluacionShow;
    }

    /**
     * @param evaluacionShow crear evaluaciondelShow
     * @return evaluacionShow
     */
    public EvaluacionShowEntity crearEvaluacionShow(EvaluacionShowEntity evaluacionShow) {
        persistence.create(evaluacionShow);
        return evaluacionShow;
    }

    /**
     * @param evaluacionShow
     * @param Id, evaluacionShow actualizar evaluacion del show
     * @return evaluacionShowActualizar
     */
    public EvaluacionShowEntity actualizarEvaluacionShow(EvaluacionShowEntity evaluacionShow, Long Id) {
        EvaluacionShowEntity evaluacionShowActualizar = persistence.update(evaluacionShow);
        return evaluacionShowActualizar;

    }

    /**
     * eliminar evaluacionDelShow
     *
     * @param Id
     *
     */
    public void eliminarEvaluacionShow(Long Id) {
        persistence.delete(Id);

    }

}
