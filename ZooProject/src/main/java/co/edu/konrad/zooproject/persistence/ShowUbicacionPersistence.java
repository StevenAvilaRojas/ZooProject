/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.ShowUbicacionEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
    * Manejador de la tabla ShowUbicacion
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class ShowUbicacionPersistence {
    @PersistenceContext(unitName="MarketplacePU")
    protected EntityManager em;
    
    public List<ShowUbicacionEntity> findAll(){
        Query q = em.createQuery("select p from ShowUbicacionEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Ubicacion del Show por id
 * 
 */
    public ShowUbicacionEntity find(Long id){
        return em.find(ShowUbicacionEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla ubicacion del show
 * 
 */
    public ShowUbicacionEntity create(ShowUbicacionEntity p){
        em.persist(p);
        return p;
    }
    public ShowUbicacionEntity update(ShowUbicacionEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        ShowUbicacionEntity entity = em.find(ShowUbicacionEntity.class, id);
        em.remove(entity);
    }
    
}
