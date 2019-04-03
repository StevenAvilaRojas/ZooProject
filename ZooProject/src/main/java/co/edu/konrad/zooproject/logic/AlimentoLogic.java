/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.AlimentoEntity;
import co.edu.konrad.zooproject.persistence.AlimentoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class AlimentoLogic {

    @Inject
    private AlimentoPersistence persistence;

    public List<AlimentoEntity> obtenerAlimentos() {
        List<AlimentoEntity> alimentos = persistence.findAll();
        return alimentos;
    }
    
    /**
     * obtener alimento por Id
     * @return alimento
     */
    public AlimentoEntity obtenerAlimentoPorId(Long id) throws IllegalAccessException {
        AlimentoEntity alimento = persistence.encontrarPorId(id);
        if (alimento == null) {
            throw new IllegalAccessException("No Se Encontro Alimento");
        }
        return alimento;
    }
    
    
    /**
 * @param alimento
 *crear alimento
 *@return alimento
 */
    public AlimentoEntity crearAlimento(AlimentoEntity alimento) {
        persistence.create(alimento);
        return alimento;
    }
/**
 * @param Id, alimento
 *actualizar alimento
 *@return alimentoActualizar
 */
    public AlimentoEntity actualizarAlimento(AlimentoEntity alimento, Long Id) {
        AlimentoEntity alimentoActualizar = persistence.update(alimento);
        return alimentoActualizar;

    }
/**
 * eliminar alimento
 *
 * @param Id
 * 
 */
    public void eliminarAlimento(Long Id) {
        persistence.delete(Id);

    }
    
}
