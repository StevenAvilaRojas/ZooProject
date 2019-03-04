/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.AnimalEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Alimento
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class AnimalPersistence {
    @PersistenceContext(unitName="MarketplacePU")
    protected EntityManager em;
    
    public List<AnimalEntity> findAll(){
        Query q = em.createQuery("select p from AnimalEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Animal por id
 * 
 */
    public AnimalEntity find(Long id){
        return em.find(AnimalEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Animal
 * 
 */
    public AnimalEntity create(AnimalEntity p){
        em.persist(p);
        return p;
    }
    public AnimalEntity update(AnimalEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        AnimalEntity entity = em.find(AnimalEntity.class, id);
        em.remove(entity);
    }
    
}
