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
        resources.add(co.edu.konrad.zooproject.resources.AlimentoResource.class);
        resources.add(co.edu.konrad.zooproject.resources.AnimalResource.class);
        resources.add(co.edu.konrad.zooproject.resources.EncargadoShowResource.class);
        resources.add(co.edu.konrad.zooproject.resources.EvaluacionAnimalResource.class);
        resources.add(co.edu.konrad.zooproject.resources.EvaluacionShowResource.class);
        resources.add(co.edu.konrad.zooproject.resources.ShowResource.class);
        resources.add(co.edu.konrad.zooproject.resources.TipoAnimalResource.class);
        resources.add(co.edu.konrad.zooproject.resources.UbicacionResource.class);
    }    
}

