/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;


import co.edu.konrad.zooproject.entities.ShowUbicacionEntity;
import co.edu.konrad.zooproject.persistence.ShowUbicacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class ShowUbicacionLogic {

    @Inject
    private ShowUbicacionPersistence persistence;

    public List<ShowUbicacionEntity> obtenerShowUbicacion() {
        List<ShowUbicacionEntity> showUbicacion = persistence.findAll();
        return showUbicacion;
    }

    /**
     * obtener showUbicacion por Id
     *
     * @param id
     * @return show por ubicacion
     * @throws java.lang.IllegalAccessException
     */
    public ShowUbicacionEntity obtenerShowUbicacionPorId(Long id) throws IllegalAccessException {
        ShowUbicacionEntity showUbicacion = persistence.find(id);
        if (showUbicacion == null) {
            throw new IllegalAccessException("No Se Encontro Show Por Ubicacion");
        }
        return showUbicacion;
    }

    /**
     * @param showUbicacion crear showUbicacion
     * @return showUbicacion
     */
    public ShowUbicacionEntity crearCuidador(ShowUbicacionEntity showUbicacion) {
        persistence.create(showUbicacion);
        return showUbicacion;
    }

    /**
     * @param Id, showUbicacion actualizar showUbicacion
     * @return showUbicacionActualizar
     */
    public ShowUbicacionEntity actualizarCuidador(ShowUbicacionEntity showUbicacion, Long Id) {
        ShowUbicacionEntity showUbicacionActualizar = persistence.update(showUbicacion);
        return showUbicacionActualizar;

    }

    /**
     * eliminar showUbicacion
     *
     * @param Id
     *
     */
    public void eliminarShowUbicacion(Long Id) {
        persistence.delete(Id);

    }

}
