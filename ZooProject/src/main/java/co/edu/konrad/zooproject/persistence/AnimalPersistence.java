/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zooproject.persistence;
import co.edu.konrad.zooproject.entities.AlimentoEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author Steven
 */
@Stateless
public class AnimalPersistence {
    @PersistenceContext(unitName="MarketPlacePU")
    protected EntityManager em;
    
    public List<AnimalEntity> findAll(){
        Query q= em.createQuery("select p from AnimalEntity p")
        return q.getResultList();
    }
    public AlimentoEntity find(Long id){
        return em.find(AnimalEntity.class,id);
    }
    public AnimalEntity create(AnimalEntity p){
        em.persist(p);
        return p;
    } 
    public AnimalEntity update(AlimentoEntity p){
        return em.merge(p);
    }
    public void delete (Long id){
        AnimalEntity entity = em.find(AnimalEntity.class, id);
        em.remove(entity);
    }
}
