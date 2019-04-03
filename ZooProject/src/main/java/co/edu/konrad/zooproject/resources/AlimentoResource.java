package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.AlimentoDTO;
import co.edu.konrad.zooproject.entities.AlimentoEntity;
import co.edu.konrad.zooproject.logic.AlimentoLogic;
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
@Path("/alimentos")
public class AlimentoResource {
    @EJB
    private AlimentoLogic alimentoLogic;
    
    @GET
    public List<AlimentoDTO> getAlimentoList(){
        List<AlimentoEntity> Alimento = alimentoLogic.obtenerAlimentos();
        return AlimentoDTO.toAlimentoList(Alimento);
    }
    
    @GET
    @Path("{id: \\d+}")
    public AlimentoDTO getAlimento(@PathParam("id") Long id) throws IllegalAccessException{
        AlimentoEntity Alimento = alimentoLogic.obtenerAlimentoPorId(id);
        if(Alimento==null){
            throw new RuntimeException("El Alimento solicitado no existe");
        }
        return new AlimentoDTO(Alimento);
    }
    
    @POST
    public AlimentoDTO createAlimento(AlimentoDTO alimentoDTO){
        return new AlimentoDTO(alimentoLogic.crearAlimento(alimentoDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public AlimentoDTO updateAlimento(@PathParam("id") Long id, AlimentoDTO Alimento) throws IllegalAccessException{
        AlimentoEntity entity = alimentoLogic.obtenerAlimentoPorId(id);
        if(entity==null){
            throw new RuntimeException("El Alimento solicitado no existe");
        }
        return new AlimentoDTO(alimentoLogic.actualizarAlimento(Alimento.toEntity(), id));
    }
    
    @DELETE
    @Path("{AlimentoId: \\d+}")
    public void deleteAlimento(@PathParam("AlimentoId") Long id) throws IllegalAccessException{
        AlimentoEntity entity = alimentoLogic.obtenerAlimentoPorId(id);
        if(entity == null){
            throw new RuntimeException("El Alimento solicitado no existe");
        }
        alimentoLogic.eliminarAlimento(id);
    }
}