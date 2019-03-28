/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.ShowEntity;
import co.edu.konrad.zooproject.persistence.ShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class ShowLogic {

    @Inject
    private ShowPersistence persistence;

    public List<ShowEntity> obtenerShow() {
        List<ShowEntity> show = persistence.findAll();
        return show;
    }

    /**
     * obtener show
     *
     * @return Id
     */
    public ShowEntity obtenerShow(Long id) throws IllegalAccessException {
        ShowEntity show = persistence.find(id);
        if (show == null) {
            throw new IllegalAccessException("No Se Encontro Show");
        }
        return show;
    }

    /**
     * obtener Show por Id
     *
     * @return Show
     */
    public ShowEntity obtenerShowPorId(Long id) throws IllegalAccessException {
        ShowEntity show = persistence.find(id);
        if (show == null) {
            throw new IllegalAccessException("No Se Encontro Show");
        }
        return show;
    }

    /**
     * @param show crear show
     * @return show
     */
    public ShowEntity crearShow(ShowEntity show) {
        persistence.create(show);
        return show;
    }

    /**
     * @param Id, show actualizar show
     * @return showActualizar
     */
    public ShowEntity actualizarShow(Long Id, ShowEntity show) {
        ShowEntity showActualizar = persistence.update(show);
        return showActualizar;

    }

    /**
     * eliminar show
     *
     * @param Id
     *
     */
    public void eliminarShow(Long Id) {
        persistence.delete(Id);

    }

}
