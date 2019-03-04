/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.ShowEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Show
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class ShowPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<ShowEntity> findAll(){
        Query q = em.createQuery("select p from ShowEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Show por id
 * 
 */
    public ShowEntity find(Long id){
        return em.find(ShowEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Show
 * 
 */
    public ShowEntity create(ShowEntity p){
        em.persist(p);
        return p;
    }
    public ShowEntity update(ShowEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        ShowEntity entity = em.find(ShowEntity.class, id);
        em.remove(entity);
    }
    
}
