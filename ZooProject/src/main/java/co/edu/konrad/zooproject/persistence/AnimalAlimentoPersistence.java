package co.edu.konrad.zooproject.persistence;

import co.edu.konrad.zooproject.entities.AnimalAlimentoEntity;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Manejador de la tabla Animal-Alimento
 * @author Steven Avila, Diego Cortazar and Alexander Nicholls
 */
@Stateless
public class AnimalAlimentoPersistence {
    @PersistenceContext(unitName="ZooProjectPU")
    protected EntityManager em;
    
    public List<AnimalAlimentoEntity> findAll(){
        Query q = em.createQuery("select p from AnimalAlimentoEntity p");
        return  q.getResultList();      
    }
    /**
 * Metodo para encontrar Animal-Alimento por id
 * 
 */
    public AnimalAlimentoEntity encontrarPorId(Long id){
        return em.find(AnimalAlimentoEntity.class,id);
    }
    
       /**
 * Permite actualizar un objeto de una tabla Animal-Alimento
 * 
 */
    public AnimalAlimentoEntity create(AnimalAlimentoEntity p){
        em.persist(p);
        return p;
    }
    public AnimalAlimentoEntity update(AnimalAlimentoEntity p){
        return em.merge(p);
    }
    
    public void delete(Long id){
        AnimalAlimentoEntity entity = em.find(AnimalAlimentoEntity.class, id);
        em.remove(entity);
    }
    
}
