/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.AnimalAlimentoEntity;
import co.edu.konrad.zooproject.persistence.AnimalAlimentoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class AnimalAlimentoLogic {

    @Inject
    private AnimalAlimentoPersistence persistence;

    public List<AnimalAlimentoEntity> obtenerAnimalesAlimentos() {
        List<AnimalAlimentoEntity> animalesAlimentos = persistence.findAll();
        return animalesAlimentos;
    }

    /**
     * obtener Animalalimento por Id
     *
     * @return animalalimento
     */
    public AnimalAlimentoEntity obtenerAnimalAlimentoPorId(Long id) throws IllegalAccessException {
        AnimalAlimentoEntity animalAlimento = persistence.encontrarPorId(id);
        if (animalAlimento == null) {
            throw new IllegalAccessException("No Se Encontro Animal Alimento");
        }
        return animalAlimento;
    }

    /**
     * @param animalAlimento crear AnimalPorAlimento
     * @return animalPorAlimento
     */
    public AnimalAlimentoEntity crearAnimalAlimento(AnimalAlimentoEntity animalAlimento) {
        persistence.create(animalAlimento);
        return animalAlimento;
    }

    /**
     * @param Id, alimento actualizar alimento
     * @return alimentoActualizar
     */
    public AnimalAlimentoEntity actualizarAnimalAlimento(AnimalAlimentoEntity animalAlimento, Long Id) {
        AnimalAlimentoEntity animalAlimentoActualizar = persistence.update(animalAlimento);
        return animalAlimentoActualizar;

    }

    /**
     * eliminar alimento
     *
     * @param Id
     *
     */
    public void eliminarAnimalAlimento(Long Id) {
        persistence.delete(Id);

    }

}
