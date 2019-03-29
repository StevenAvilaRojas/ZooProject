/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.UbicacionEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Ubicacion
 *
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class UbicacionPersistence {

    @PersistenceContext(unitName = "ZooProjectPU")
    protected EntityManager em;

    public List<UbicacionEntity> findAll() {
        Query q = em.createQuery("select p from UbicacionEntity p");
        return q.getResultList();
    }

    /**
     * Metodo para encontrar Ubicacion por id
     *
     * @param id
     * @return 
     */
    public UbicacionEntity find(Long id) {
        return em.find(UbicacionEntity.class, id);
    }

    /**
     * Permite actualizar un objeto de una tabla Ubicacion
     *
     * @param p
     * @return 
     */
    public UbicacionEntity create(UbicacionEntity p) {
        em.persist(p);
        return p;
    }

    public UbicacionEntity update(UbicacionEntity p) {
        return em.merge(p);
    }

    public void delete(Long id) {
        UbicacionEntity entity = em.find(UbicacionEntity.class, id);
        em.remove(entity);
    }

}
