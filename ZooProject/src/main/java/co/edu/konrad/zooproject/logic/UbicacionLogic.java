/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.UbicacionEntity;
import co.edu.konrad.zooproject.persistence.UbicacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class UbicacionLogic {

    @Inject
    private UbicacionPersistence persistence;

    public List<UbicacionEntity> obtenerUbicacion() {
        List<UbicacionEntity> ubicacion = persistence.findAll();
        return ubicacion;
    }

    /**
     * obtener Ubicacion por Id
     *
     * @param id
     * @return Ubicacion
     * @throws java.lang.IllegalAccessException
     */
    public UbicacionEntity obtenerUbicacionPorId(Long id) throws IllegalAccessException {
        UbicacionEntity ubicacion = persistence.find(id);
        if (ubicacion == null) {
            throw new IllegalAccessException("No Se Encontro Ubicacion");
        }
        return ubicacion;
    }

    /**
     * @param ubicacion crear ubicacion
     * @return ubicacion
     */
    public UbicacionEntity crearUbicacion(UbicacionEntity ubicacion) {
        persistence.create(ubicacion);
        return ubicacion;
    }

    /**
     * @param Id, ubicacion actualizar ubicacion
     * @param ubicacion
     * @return ubicacionActualizar
     */
    public UbicacionEntity actualizarUbicacion(UbicacionEntity ubicacion, Long Id) {
        UbicacionEntity ubicacionActualizar = persistence.update(ubicacion);
        return ubicacionActualizar;

    }

    /**
     * eliminar ubicacion
     *
     * @param Id
     *
     */
    public void eliminarUbicacion(Long Id) {
        persistence.delete(Id);

    }

}
