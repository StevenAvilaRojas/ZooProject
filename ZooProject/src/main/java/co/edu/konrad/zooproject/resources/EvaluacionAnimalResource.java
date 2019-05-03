package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.EvaluacionAnimalDTO;
import co.edu.konrad.zooproject.entities.EvaluacionAnimalEntity;
import co.edu.konrad.zooproject.logic.EvaluacionAnimalLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/evaluacionAnimales")
public class EvaluacionAnimalResource {
    @EJB
    private EvaluacionAnimalLogic evaluacionAnimalLogic;
    
    @GET
    public List<EvaluacionAnimalDTO> getEvaluacionAnimalList(){
        List<EvaluacionAnimalEntity> EvaluacionAnimal = evaluacionAnimalLogic.obtenerEvaluacionAnimal();
        return EvaluacionAnimalDTO.toEvaluacionAnimalList(EvaluacionAnimal);
    }
    
    @GET
    @Path("{id: \\d+}")
    public EvaluacionAnimalDTO geEvaluacionAnimal(@PathParam("id") Long id) throws IllegalAccessException{
        EvaluacionAnimalEntity EvaluacionAnimal = evaluacionAnimalLogic.obtenerEvaluacionAnimalPorId(id);
        if(EvaluacionAnimal==null){
            throw new RuntimeException("El EvaluacionAnimal solicitado no existe");
        }
        return new EvaluacionAnimalDTO(EvaluacionAnimal);
    }
    
    @POST
    public EvaluacionAnimalDTO createEvaluacionAnimal(EvaluacionAnimalDTO evaluacionAnimalDTO){
        return new EvaluacionAnimalDTO(evaluacionAnimalLogic.crearEvaluacionAnimal(evaluacionAnimalDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public EvaluacionAnimalDTO updateEvaluacionAnimal(@PathParam("id") Long id, EvaluacionAnimalDTO EvaluacionAnimal) throws IllegalAccessException{
        EvaluacionAnimalEntity entity = evaluacionAnimalLogic.obtenerEvaluacionAnimalPorId(id);
        if(entity==null){
            throw new RuntimeException("El EvaluacionAnimal solicitado no existe");
        }
        return new EvaluacionAnimalDTO(evaluacionAnimalLogic.actualizarEvaluacionAnimal(EvaluacionAnimal.toEntity(), id));
    }
    
    @DELETE
    @Path("{EvaluacionAnimalId: \\d+}")
    public void deleteEvaluacionAnimal(@PathParam("EvaluacionAnimalId") Long id) throws IllegalAccessException{
        EvaluacionAnimalEntity entity = evaluacionAnimalLogic.obtenerEvaluacionAnimalPorId(id);
        if(entity == null){
            throw new RuntimeException("El EvaluacionAnimal solicitado no existe");
        }
        evaluacionAnimalLogic.eliminarEvaluacionAnimal(id);
    }
}