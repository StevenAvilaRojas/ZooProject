package co.edu.konrad.zooproject.resources;

import javax.ws.rs.ApplicationPath;
import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */

@ApplicationPath("/api")
public class ApplicationConfig extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addRestResource(resources);
        return resources;
    }
    
    private void addRestResource(Set<Class<?>> resources){
        resources.add(co.edu.konrad.zooproject.resources.CuidadorResource.class);
//        Resources.add(CuidadorResource.class);
//        Resources.add(AlimentoResource.class);
//        Resources.add(AnimalResource.class);
//        Resources.add(EncargadoShowResource.class);
//        Resources.add(EvaluacionAnimalResource.class);
//        Resources.add(EvaluacionShowResource.class);
//        Resources.add(ShowResource.class);
//        Resources.add(TipoAnimalResource.class);
//        Resources.add(UbicacionResource.class);
    }    
}

