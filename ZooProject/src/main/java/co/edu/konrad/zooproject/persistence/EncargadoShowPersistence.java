package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.EncargadoShowEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Encargado-Show
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class EncargadoShowPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<EncargadoShowEntity> findAll(){
        Query q = em.createQuery("select p from EncargadoShowEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Encargado-Show por id
 * 
     * @param id
     * @return 
 */
    public EncargadoShowEntity find(Long id){
        return em.find(EncargadoShowEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Encargado-Show
 * 
     * @param p
     * @return 
 */
    public EncargadoShowEntity create(EncargadoShowEntity p){
        em.persist(p);
        return p;
    }
    public EncargadoShowEntity update(EncargadoShowEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        EncargadoShowEntity entity = em.find(EncargadoShowEntity.class, id);
        em.remove(entity);
    }
    
}
