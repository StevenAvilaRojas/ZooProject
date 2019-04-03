/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;


import co.edu.konrad.zooproject.entities.EncargadoShowEntity;
import co.edu.konrad.zooproject.persistence.EncargadoShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class EncargadoShowLogic {

    @Inject
    private EncargadoShowPersistence persistence;

    public List<EncargadoShowEntity> obtenerEncargadoShow() {
        List<EncargadoShowEntity> encargadoShow = persistence.findAll();
        return encargadoShow;
    }


    /**
     * obtener EncargadoShow por Id
     *
     * @return encargadoShow
     */
    public EncargadoShowEntity obtenerEncargadoShowPorId(Long id) throws IllegalAccessException {
        EncargadoShowEntity encargadoShow = persistence.find(id);
        if (encargadoShow == null) {
            throw new IllegalAccessException("No Se Encontro Encargado Show");
        }
        return encargadoShow;
    }

    /**
     * @param encargadoShow crear EncargadoShow
     * @return encargado show
     */
    public EncargadoShowEntity crearEncargadoShow(EncargadoShowEntity encargadoShow) {
        persistence.create(encargadoShow);
        return encargadoShow;
    }

    /**
     * @param encargadoShow
     * @param Id, encargadoShow actualizar encargadoShow
     * @return encargadoShowActualizar
     */
    public EncargadoShowEntity actualizarEncargadoShow(EncargadoShowEntity encargadoShow,Long Id) {
        EncargadoShowEntity encargadoShowActualizar = persistence.update(encargadoShow);
        return encargadoShowActualizar;

    }

    /**
     * eliminar encargadoShow
     *
     * @param Id
     *
     */
    public void eliminarEncargadoShow(Long Id) {
        persistence.delete(Id);

    }

}
