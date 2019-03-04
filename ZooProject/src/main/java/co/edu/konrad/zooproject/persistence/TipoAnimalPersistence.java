/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.TipoAnimalEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Tipo de Animal
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class TipoAnimalPersistence {

    @PersistenceContext(unitName = "ZooProjectPU")
    protected EntityManager em;

    public List<TipoAnimalEntity> findAll() {
        Query q = em.createQuery("select p from TipoAnimalEntity p");
        return q.getResultList();
    }

    /**
     * Metodo para encontrar Tipo de Animal por id
     *
     */
    public TipoAnimalEntity find(Long id) {
        return em.find(TipoAnimalEntity.class, id);
    }

    /**
     * Permite actualizar un objeto de una tabla Tipo de Animal
     *
     */
    public TipoAnimalEntity create(TipoAnimalEntity p) {
        em.persist(p);
        return p;
    }

    public TipoAnimalEntity update(TipoAnimalEntity p) {
        return em.merge(p);
    }

    public void delete(Long id) {
        TipoAnimalEntity entity = em.find(TipoAnimalEntity.class, id);
        em.remove(entity);
    }

}
