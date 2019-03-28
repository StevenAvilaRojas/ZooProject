/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.CuidadorEntity;
import co.edu.konrad.zooproject.persistence.CuidadorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class CuidadorLogic {

    @Inject
    private CuidadorPersistence persistence;

    public List<CuidadorEntity> obtenerCuidador() {
        List<CuidadorEntity> cuidador = persistence.findAll();
        return cuidador;
    }

    /**
     * obtener cuidador
     *
     * @return Id
     */
    public CuidadorEntity obtenerCuidador(Long id) throws IllegalAccessException {
        CuidadorEntity cuidador = persistence.find(id);
        if (cuidador == null) {
            throw new IllegalAccessException("No Se Encontro Cuidador");
        }
        return cuidador;
    }

    /**
     * obtener Cuidador por Id
     *
     * @return cuidador
     */
    public CuidadorEntity obtenerCuidadorPorId(Long id) throws IllegalAccessException {
        CuidadorEntity cuidador = persistence.find(id);
        if (cuidador == null) {
            throw new IllegalAccessException("No Se Encontro Cuidador");
        }
        return cuidador;
    }

    /**
     * @param cuidador crear Cuidador
     * @return cuidador
     */
    public CuidadorEntity crearCuidador(CuidadorEntity cuidador) {
        persistence.create(cuidador);
        return cuidador;
    }

    /**
     * @param Id, cuidador actualizar cuidador
     * @param cuidador
     * @return cuidadorActualizar
     */
    public CuidadorEntity actualizarCuidador(Long Id, CuidadorEntity cuidador) {
        CuidadorEntity cuidadorActualizar = persistence.update(cuidador);
        return cuidadorActualizar;

    }

    /**
     * eliminar cuidador
     *
     * @param Id
     *
     */
    public void eliminarCuidador(Long Id) {
        persistence.delete(Id);

    }

}
