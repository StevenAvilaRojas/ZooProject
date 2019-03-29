package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.EvaluacionShowEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Evaluacion-Show
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class EvaluacionShowPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<EvaluacionShowEntity> findAll(){
        Query q = em.createQuery("select p from EvaluacionShowEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Evaluacion-Show por id
 * 
     * @param id
     * @return 
 */
    public EvaluacionShowEntity find(Long id){
        return em.find(EvaluacionShowEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Evaluacion-Show
 * 
     * @param p
     * @return 
 */
    public EvaluacionShowEntity create(EvaluacionShowEntity p){
        em.persist(p);
        return p;
    }
    public EvaluacionShowEntity update(EvaluacionShowEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        EvaluacionShowEntity entity = em.find(EvaluacionShowEntity.class, id);
        em.remove(entity);
    }
    
}
