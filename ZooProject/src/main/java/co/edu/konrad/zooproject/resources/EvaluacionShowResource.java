package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.EvaluacionShowDTO;
import co.edu.konrad.zooproject.entities.EvaluacionShowEntity;
import co.edu.konrad.zooproject.logic.EvaluacionShowLogic;
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
@Path("/evaluacionshows")
public class EvaluacionShowResource {
    @EJB
    private EvaluacionShowLogic evaluacionShowLogic;
    
    @GET
    public List<EvaluacionShowDTO> getEvaluacionShowList(){
        List<EvaluacionShowEntity> EvaluacionShow = evaluacionShowLogic.obtenerEvaluacionShow();
        return EvaluacionShowDTO.toEvaluacionShowList(EvaluacionShow);
    }
    
    @GET
    @Path("{id: \\d+}")
    public EvaluacionShowDTO getEvaluacionShow(@PathParam("id") Long id) throws IllegalAccessException{
        EvaluacionShowEntity EvaluacionShow = evaluacionShowLogic.obtenerEvaluacionShowPorId(id);
        if(EvaluacionShow==null){
            throw new RuntimeException("El EvaluacionShow solicitado no existe");
        }
        return new EvaluacionShowDTO(EvaluacionShow);
    }
    
    @POST
    public EvaluacionShowDTO createEvaluacionShow(EvaluacionShowDTO evaluacionShowDTO){
        return new EvaluacionShowDTO(evaluacionShowLogic.crearEvaluacionShow(evaluacionShowDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public EvaluacionShowDTO updateEvaluacionShow(@PathParam("id") Long id, EvaluacionShowDTO EvaluacionShow) throws IllegalAccessException{
        EvaluacionShowEntity entity = evaluacionShowLogic.obtenerEvaluacionShowPorId(id);
        if(entity==null){
            throw new RuntimeException("El EvaluacionShow solicitado no existe");
        }
        return new EvaluacionShowDTO(evaluacionShowLogic.actualizarEvaluacionShow(EvaluacionShow.toEntity(), id));
    }
    
    @DELETE
    @Path("{EvaluacionShowId: \\d+}")
    public void deleteEvaluacionShow(@PathParam("EvaluacionShowId") Long id) throws IllegalAccessException{
        EvaluacionShowEntity entity = evaluacionShowLogic.obtenerEvaluacionShowPorId(id);
        if(entity == null){
            throw new RuntimeException("El EvaluacionShow solicitado no existe");
        }
        evaluacionShowLogic.eliminarEvaluacionShow(id);
    }
}