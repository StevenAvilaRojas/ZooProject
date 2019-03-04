package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.AlimentoEntity;
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
public class AlimentoPersistence {
    @PersistenceContext(unitName="MarketplacePU")
    protected EntityManager em;
    
    public List<AlimentoEntity> findAll(){
        Query q = em.createQuery("select p from AlimentoEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Alimento por id
 * 
 */
    public AlimentoEntity find(Long id){
        return em.find(AlimentoEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Alimento
 * 
 */
    public AlimentoEntity create(AlimentoEntity p){
        em.persist(p);
        return p;
    }
    public AlimentoEntity update(AlimentoEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        AlimentoEntity entity = em.find(AlimentoEntity.class, id);
        em.remove(entity);
    }
    
}
