package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.ShowEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class ShowDTO {

    private Long idShow;
    private Long idUbicacion;
    private Date horaInicio;
    private Date horaFin;
    private String animales;
    private String nombre;

    public ShowDTO(ShowEntity show) {
        this.idShow = show.getIdShow();
        this.idUbicacion = show.getIdUbicacion();
        this.horaInicio = show.getHoraIncio();
        this.horaFin = show.getHoraFin();
        this.animales = show.getAnimales();
        this.nombre = show.getNombre();
    }

    public ShowEntity toEntity() {
        ShowEntity show = new ShowEntity();
        show.setIdShow(this.idShow);
        show.setIdUbicacion(this.idUbicacion);
        show.setHoraIncio(this.horaInicio);
        show.setHoraFin(this.horaFin);
        show.setAnimales(this.animales);
        show.setNombre(this.nombre);
        return show;
    }

    public static List<ShowDTO> toShowList(List<ShowEntity> show) {

        List<ShowDTO> listaShow = new ArrayList<>();

        for (int i = 0; i < show.size(); i++) {

            listaShow.add(new ShowDTO(show.get(i)));

        }

        return listaShow;

    }

    public Long getIdShow() {
        return idShow;
    }

    public void setIdShow(Long idShow) {
        this.idShow = idShow;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getAnimales() {
        return animales;
    }

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

}
