package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.TipoAnimalDTO;
import co.edu.konrad.zooproject.entities.TipoAnimalEntity;
import co.edu.konrad.zooproject.logic.TipoAnimalLogic;
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
@Path("/tipoAnimales")
public class TipoAnimalResource {
    @EJB
    private TipoAnimalLogic tipoAnimalLogic;
    
    @GET
    public List<TipoAnimalDTO> getTipoAnimalList(){
        List<TipoAnimalEntity> TipoAnimal = tipoAnimalLogic.obtenerTipoAnimal();
        return TipoAnimalDTO.toTipoAnimalList(TipoAnimal);
    }
    
    @GET
    @Path("{id: \\d+}")
    public TipoAnimalDTO getTipoAnimal(@PathParam("id") Long id) throws IllegalAccessException{
        TipoAnimalEntity TipoAnimal = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(TipoAnimal==null){
            throw new RuntimeException("El TipoAnimal solicitado no existe");
        }
        return new TipoAnimalDTO(TipoAnimal);
    }
    
    @POST
    public TipoAnimalDTO createTipoAnimal(TipoAnimalDTO tipoAnimalDTO){
        return new TipoAnimalDTO(tipoAnimalLogic.crearTipoAnimal(tipoAnimalDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public TipoAnimalDTO updateTipoAnimal(@PathParam("id") Long id, TipoAnimalDTO TipoAnimal) throws IllegalAccessException{
        TipoAnimalEntity entity = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(entity==null){
            throw new RuntimeException("El TipoAnimal solicitado no existe");
        }
        return new TipoAnimalDTO(tipoAnimalLogic.actualizarTipoAnimal(TipoAnimal.toEntity(), id));
    }
    
    @DELETE
    @Path("{TipoAnimalId: \\d+}")
    public void deleteTipoAnimal(@PathParam("TipoAnimalId") Long id) throws IllegalAccessException{
        TipoAnimalEntity entity = tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(entity == null){
            throw new RuntimeException("El TipoAnimal solicitado no existe");
        }
        tipoAnimalLogic.eliminarTipoAnimal(id);
    }
}