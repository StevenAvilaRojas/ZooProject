package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.CuidadorDTO;
import co.edu.konrad.zooproject.entities.CuidadorEntity;
import co.edu.konrad.zooproject.logic.CuidadorLogic;
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
@Path("/cuidadores")
public class CuidadorResource {
    @EJB
    private CuidadorLogic cuidadorLogic;
    
    @GET
    public List<CuidadorDTO> getCuidadorList(){
        List<CuidadorEntity> Cuidador = cuidadorLogic.obtenerCuidadores();
        return CuidadorDTO.toCuidadorList(Cuidador);
    }
    
    @GET
    @Path("{id: \\d+}")
    public CuidadorDTO getCuidador(@PathParam("id") Long id) throws IllegalAccessException{
        CuidadorEntity Cuidador = cuidadorLogic.obtenerCuidadoresPorId(id);
        if(Cuidador==null){
            throw new RuntimeException("El Producto solicitado no existe");
        }
        return new CuidadorDTO(Cuidador);
    }
    
    @POST
    public CuidadorDTO createCuidador(CuidadorDTO cuidadorDTO){
        return new CuidadorDTO(cuidadorLogic.crearCuidador(cuidadorDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public CuidadorDTO updateCuidador(@PathParam("id") Long id, CuidadorDTO Cuidador) throws IllegalAccessException{
        CuidadorEntity entity = cuidadorLogic.obtenerCuidadoresPorId(id);
        if(entity==null){
            throw new RuntimeException("El Cuidador solicitado no existe");
        }
        return new CuidadorDTO(cuidadorLogic.actualizarCuidador(Cuidador.toEntity(), id));
    }
    
    @DELETE
    @Path("{CuidadorId: \\d+}")
    public void deleteCuidador(@PathParam("CuidadorId") Long id) throws IllegalAccessException{
        CuidadorEntity entity = cuidadorLogic.obtenerCuidadoresPorId(id);
        if(entity == null){
            throw new RuntimeException("El Cuidador solicitado no existe");
        }
        cuidadorLogic.eliminarCuidador(id);
    }
}