package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.ShowDTO;
import co.edu.konrad.zooproject.entities.ShowEntity;
import co.edu.konrad.zooproject.logic.ShowLogic;
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
@Path("/shows")
public class ShowResource {
    @EJB
    private ShowLogic showLogic;
    
    @GET
    public List<ShowDTO> getShowList(){
        List<ShowEntity> Show = showLogic.obtenerShow();
        return ShowDTO.toShowList(Show);
    }
    
    @GET
    @Path("{id: \\d+}")
    public ShowDTO getShow(@PathParam("id") Long id) throws IllegalAccessException{
        ShowEntity Show = showLogic.obtenerShowPorId(id);
        if(Show==null){
            throw new RuntimeException("El Show solicitado no existe");
        }
        return new ShowDTO(Show);
    }
    
    @POST
    public ShowDTO createShow(ShowDTO showDTO){
        return new ShowDTO(showLogic.crearShow(showDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public ShowDTO updateShow(@PathParam("id") Long id, ShowDTO Show) throws IllegalAccessException{
        ShowEntity entity = showLogic.obtenerShowPorId(id);
        if(entity==null){
            throw new RuntimeException("El Show solicitado no existe");
        }
        return new ShowDTO(showLogic.actualizarShow(Show.toEntity(), id));
    }
    
    @DELETE
    @Path("{ShowId: \\d+}")
    public void deleteShow(@PathParam("ShowId") Long id) throws IllegalAccessException{
        ShowEntity entity = showLogic.obtenerShowPorId(id);
        if(entity == null){
            throw new RuntimeException("El Show solicitado no existe");
        }
        showLogic.eliminarShow(id);
    }
}