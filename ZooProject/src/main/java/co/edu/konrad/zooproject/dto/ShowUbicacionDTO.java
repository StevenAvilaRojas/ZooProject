package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.ShowEntity;
import co.edu.konrad.zooproject.entities.ShowUbicacionEntity;
import co.edu.konrad.zooproject.entities.UbicacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class ShowUbicacionDTO {

    private Long id_show_ubicacion;
    private ShowEntity idShow;
    private UbicacionEntity idUbicacion;

    public ShowUbicacionDTO(ShowUbicacionEntity showUbicacion) {
        this.id_show_ubicacion = showUbicacion.getId_show_ubicacion();
        this.idShow = showUbicacion.getIdShow();
        this.idUbicacion = showUbicacion.getIdUbicacion();
    }

    public ShowUbicacionEntity toEntity() {
        ShowUbicacionEntity showUbicacion = new ShowUbicacionEntity();
        showUbicacion.setId_show_ubicacion(this.id_show_ubicacion);
        showUbicacion.setIdShow(this.idShow);
        showUbicacion.setIdUbicacion(this.idUbicacion);
        return showUbicacion;
    }

    public static List<ShowUbicacionDTO> toShowUbicacionList(List<ShowUbicacionEntity> showUbicacion) {

        List<ShowUbicacionDTO> listaShowUbicacion = new ArrayList<>();

        for (int i = 0; i < showUbicacion.size(); i++) {

            listaShowUbicacion.add(new ShowUbicacionDTO(showUbicacion.get(i)));

        }

        return listaShowUbicacion;

    }

    public Long getId_show_ubicacion() {
        return id_show_ubicacion;
    }

    public void setId_show_ubicacion(Long id_show_ubicacion) {
        this.id_show_ubicacion = id_show_ubicacion;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public UbicacionEntity getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(UbicacionEntity idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

   

}
