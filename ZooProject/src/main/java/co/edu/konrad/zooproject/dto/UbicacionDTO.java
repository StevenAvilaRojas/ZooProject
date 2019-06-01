package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.UbicacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class UbicacionDTO {

    private Long idUbicacion;
    private boolean ocupado;

    public UbicacionDTO() {
    }

    public UbicacionDTO(UbicacionEntity ub) {
        this.idUbicacion = ub.getIdUbicacion();
        this.ocupado = ub.isOcupado();
    }

    public UbicacionEntity toEntity() {
        UbicacionEntity ub = new UbicacionEntity();
        ub.setId_ubicacion(this.idUbicacion);
        ub.setOcupado(this.ocupado);
        return ub;
    }

    public static List<UbicacionDTO> toUbicacionList(List<UbicacionEntity> ubicacion) {

        List<UbicacionDTO> listaUbicacion = new ArrayList<>();

        for (int i = 0; i < ubicacion.size(); i++) {

            listaUbicacion.add(new UbicacionDTO(ubicacion.get(i)));

        }

        return listaUbicacion;

    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


}
