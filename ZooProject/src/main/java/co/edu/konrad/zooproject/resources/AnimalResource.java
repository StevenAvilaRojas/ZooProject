package co.edu.konrad.zooproject.resources;


import co.edu.konrad.zooproject.dto.AnimalDTO;
import co.edu.konrad.zooproject.entities.AnimalEntity;
import co.edu.konrad.zooproject.logic.AnimalLogic;
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
@Path("/animales")
public class AnimalResource {
    @EJB
    private AnimalLogic animalLogic;
    
    @GET
    public List<AnimalDTO> getAnimalList(){
        List<AnimalEntity> Animal = animalLogic.obtenerAnimales();
        return AnimalDTO.toAnimalList(Animal);
    }
    
    @GET
    @Path("{id: \\d+}")
    public AnimalDTO getAnimal(@PathParam("id") Long id) throws IllegalAccessException{
        AnimalEntity Animal = animalLogic.obtenerAnimalPorId(id);
        if(Animal==null){
            throw new RuntimeException("El Animal solicitado no existe");
        }
        return new AnimalDTO(Animal);
    }
    
    @POST
    public AnimalDTO createAnimal(AnimalDTO animalDTO){
        return new AnimalDTO(animalLogic.crearAnimal(animalDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public AnimalDTO updateAnimal(@PathParam("id") Long id, AnimalDTO Animal) throws IllegalAccessException{
        AnimalEntity entity = animalLogic.obtenerAnimalPorId(id);
        if(entity==null){
            throw new RuntimeException("El Animal solicitado no existe");
        }
        return new AnimalDTO(animalLogic.actualizarAnimal(Animal.toEntity(), id));
    }
    
    @DELETE
    @Path("{AnimalId: \\d+}")
    public void deleteAnimal(@PathParam("AnimalId") Long id) throws IllegalAccessException{
        AnimalEntity entity = animalLogic.obtenerAnimalPorId(id);
        if(entity == null){
            throw new RuntimeException("El Animal solicitado no existe");
        }
        animalLogic.eliminarAnimal(id);
    }
}