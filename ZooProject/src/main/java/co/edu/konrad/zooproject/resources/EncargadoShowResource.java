package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.EncargadoShowDTO;
import co.edu.konrad.zooproject.entities.EncargadoShowEntity;
import co.edu.konrad.zooproject.logic.EncargadoShowLogic;
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
@Path("/encargadoShows")
public class EncargadoShowResource {
    @EJB
    private EncargadoShowLogic encargadoShowLogic;
    
    @GET
    public List<EncargadoShowDTO> getEncargadoShowList(){
        List<EncargadoShowEntity> EncargadoShow = encargadoShowLogic.obtenerEncargadoShow();
        return EncargadoShowDTO.toEncargadoShowList(EncargadoShow);
    }
    
    @GET
    @Path("{id: \\d+}")
    public EncargadoShowDTO getEncargadoShow(@PathParam("id") Long id) throws IllegalAccessException{
        EncargadoShowEntity EncargadoShow = encargadoShowLogic.obtenerEncargadoShowPorId(id);
        if(EncargadoShow==null){
            throw new RuntimeException("El EncargadoShow solicitado no existe");
        }
        return new EncargadoShowDTO(EncargadoShow);
    }
    
    @POST
    public EncargadoShowDTO createEncargadoShow(EncargadoShowDTO encargadoShowDTO){
        return new EncargadoShowDTO(encargadoShowLogic.crearEncargadoShow(encargadoShowDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public EncargadoShowDTO updateEncargadoShow(@PathParam("id") Long id, EncargadoShowDTO EncargadoShow) throws IllegalAccessException{
        EncargadoShowEntity entity = encargadoShowLogic.obtenerEncargadoShowPorId(id);
        if(entity==null){
            throw new RuntimeException("El EncargadoShow solicitado no existe");
        }
        return new EncargadoShowDTO(encargadoShowLogic.actualizarEncargadoShow(EncargadoShow.toEntity(), id));
    }
    
    @DELETE
    @Path("{EncargadoShowId: \\d+}")
    public void deleteEncargadoShow(@PathParam("EncargadoShowId") Long id) throws IllegalAccessException{
        EncargadoShowEntity entity = encargadoShowLogic.obtenerEncargadoShowPorId(id);
        if(entity == null){
            throw new RuntimeException("El EncargadoShow solicitado no existe");
        }
        encargadoShowLogic.eliminarEncargadoShow(id);
    }
}