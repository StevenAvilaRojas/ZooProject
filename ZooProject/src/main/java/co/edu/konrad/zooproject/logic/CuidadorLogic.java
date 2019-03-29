package co.edu.konrad.zooproject.logic;

import co.edu.konrad.zooproject.entities.CuidadorEntity;
import co.edu.konrad.zooproject.persistence.CuidadorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego Cortázar, Steven Avila, Alexander Nicholls
 */
@Stateless
public class CuidadorLogic {

    @Inject
    private CuidadorPersistence persistence;

    public List<CuidadorEntity> obtenerCuidadores() {
        List<CuidadorEntity> cuidadores = persistence.findAll();
        return cuidadores;
    }

    /**
     * obtener Cuidador por Id
     *
     * @param id
     * @return cuidador
     * @throws java.lang.IllegalAccessException
     */
    public CuidadorEntity obtenerCuidadoresPorId(Long id) throws IllegalAccessException {
        CuidadorEntity cuidador = persistence.find(id);
        if (cuidador == null) {
            throw new IllegalAccessException("No Se Encontro Cuidador");
        }
        return cuidador;
    }

    /**
     * @param cuidador crear Cuidador
     * @return cuidador
     */
    public CuidadorEntity crearCuidador(CuidadorEntity cuidador) {
        persistence.create(cuidador);
        return cuidador;
    }

    /**
     * @param cuidador
     * @param id
     * @return cuidadorActualizar
     */
    public CuidadorEntity actualizarCuidador(CuidadorEntity cuidador, Long id) {
        CuidadorEntity cuidadorActualizar = persistence.update(cuidador);
        return cuidadorActualizar;

    }

    /**
     * eliminar cuidador
     *
     * @param Id
     *
     */
    public void eliminarCuidador(Long Id) {
        persistence.delete(Id);

    }

}
