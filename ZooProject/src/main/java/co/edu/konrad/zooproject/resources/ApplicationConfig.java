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
    
    private void addRestResource(Set<Class<?>> Resources){
        Resources.add(CuidadorResource.class);
    }
}

