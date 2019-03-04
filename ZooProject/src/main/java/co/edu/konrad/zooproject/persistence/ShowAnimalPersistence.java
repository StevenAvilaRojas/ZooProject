/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.ShowAnimalEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla ShowAnimal
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class ShowAnimalPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<ShowAnimalEntity> findAll(){
        Query q = em.createQuery("select p from ShowAnimalEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Animal por id
 * 
 */
    public ShowAnimalEntity find(Long id){
        return em.find(ShowAnimalEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Animal
 * 
 */
    public ShowAnimalEntity create(ShowAnimalEntity p){
        em.persist(p);
        return p;
    }
    public ShowAnimalEntity update(ShowAnimalEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        ShowAnimalEntity entity = em.find(ShowAnimalEntity.class, id);
        em.remove(entity);
    }
    
}
