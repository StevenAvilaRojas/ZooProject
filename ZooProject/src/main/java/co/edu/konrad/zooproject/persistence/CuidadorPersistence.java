package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.CuidadorEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Cuidador
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class CuidadorPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<CuidadorEntity> findAll(){
        Query q = em.createQuery("select p from CuidadorEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Cuidador por id
 * 
     * @param id
     * @return 
 */
    public CuidadorEntity find(Long id){
        return em.find(CuidadorEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Cuidador
 * 
     * @param p
     * @return 
 */
    public CuidadorEntity create(CuidadorEntity p){
        em.persist(p);
        return p;
    }
    public CuidadorEntity update(CuidadorEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        CuidadorEntity entity = em.find(CuidadorEntity.class, id);
        em.remove(entity);
    }
    
}
