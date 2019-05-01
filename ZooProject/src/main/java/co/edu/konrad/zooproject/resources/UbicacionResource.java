package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.UbicacionDTO;
import co.edu.konrad.zooproject.entities.UbicacionEntity;
import co.edu.konrad.zooproject.logic.UbicacionLogic;
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
@Path("/ubicaciones")
public class UbicacionResource {
    @EJB
    private UbicacionLogic ubicacionLogic;
    
    @GET
    public List<UbicacionDTO> getUbicacionList(){
        List<UbicacionEntity> Ubicacion = ubicacionLogic.obtenerUbicacion();
        return UbicacionDTO.toUbicacionList(Ubicacion);
    }
    
    @GET
    @Path("{id: \\d+}")
    public UbicacionDTO getUbicacion(@PathParam("id") Long id) throws IllegalAccessException{
        UbicacionEntity Ubicacion = ubicacionLogic.obtenerUbicacionPorId(id);
        if(Ubicacion==null){
            throw new RuntimeException("El Ubicacion solicitado no existe");
        }
        return new UbicacionDTO(Ubicacion);
    }
    
    @POST
    public UbicacionDTO createUbicacion(UbicacionDTO ubicacionDTO){
        return new UbicacionDTO(ubicacionLogic.crearUbicacion(ubicacionDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public UbicacionDTO updateUbicacion(@PathParam("id") Long id, UbicacionDTO Ubicacion) throws IllegalAccessException{
        UbicacionEntity entity = ubicacionLogic.obtenerUbicacionPorId(id);
        if(entity==null){
            throw new RuntimeException("El Ubicacion solicitado no existe");
        }
        return new UbicacionDTO(ubicacionLogic.actualizarUbicacion(Ubicacion.toEntity(), id));
    }
    
    @DELETE
    @Path("{UbicacionId: \\d+}")
    public void deleteUbicacion(@PathParam("UbicacionId") Long id) throws IllegalAccessException{
        UbicacionEntity entity = ubicacionLogic.obtenerUbicacionPorId(id);
        if(entity == null){
            throw new RuntimeException("El Ubicacion solicitado no existe");
        }
        ubicacionLogic.eliminarUbicacion(id);
    }
}