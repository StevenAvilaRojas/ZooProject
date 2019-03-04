package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.EvaluacionAnimalEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Evaluacion-Animal
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class EvaluacionAnimalPersistence {
    @PersistenceContext(unitName="MarketplacePU")
    protected EntityManager em;
    
    public List<EvaluacionAnimalEntity> findAll(){
        Query q = em.createQuery("select p from EvaluacionAnimalEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Evaluacion-Animal por id
 * 
 */
    public EvaluacionAnimalEntity find(Long id){
        return em.find(EvaluacionAnimalEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Evaluacion-Animal
 * 
 */
    public EvaluacionAnimalEntity create(EvaluacionAnimalEntity p){
        em.persist(p);
        return p;
    }
    public EvaluacionAnimalEntity update(EvaluacionAnimalEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        EvaluacionAnimalEntity entity = em.find(EvaluacionAnimalEntity.class, id);
        em.remove(entity);
    }
    
}
