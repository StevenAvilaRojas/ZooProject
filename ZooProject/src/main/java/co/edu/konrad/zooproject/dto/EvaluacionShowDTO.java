package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.EvaluacionShowEntity;
import co.edu.konrad.zooproject.entities.ShowEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class EvaluacionShowDTO {

    private Long idEvaluacionShow;
    private String calificacion;
    private ShowEntity idShow;
    private String observacion;
    private Date fecha;

    public EvaluacionShowDTO() {
    }

    public EvaluacionShowDTO(EvaluacionShowEntity evaluacionShow) {
        this.idEvaluacionShow = evaluacionShow.getIdEvaluacionShow();
        this.calificacion = evaluacionShow.getCalificacion();
        this.idShow = evaluacionShow.getIdShow();
        this.observacion = evaluacionShow.getObservacion();
        this.fecha = evaluacionShow.getFecha();
    }

    public EvaluacionShowEntity toEntity() {
        EvaluacionShowEntity evaluacionShow = new EvaluacionShowEntity();
        evaluacionShow.setIdEvaluacionShow(this.idEvaluacionShow);
        evaluacionShow.setCalificacion(this.calificacion);
        evaluacionShow.setIdShow(this.idShow);
        evaluacionShow.setObservacion(this.observacion);
        evaluacionShow.setFecha(this.fecha);
        return evaluacionShow;
    }

    public static List<EvaluacionShowDTO> toEvaluacionShowList(List<EvaluacionShowEntity> evaluacionShow) {

        List<EvaluacionShowDTO> listaEvaluacionShow = new ArrayList<>();

        for (int i = 0; i < evaluacionShow.size(); i++) {

            listaEvaluacionShow.add(new EvaluacionShowDTO(evaluacionShow.get(i)));

        }

        return listaEvaluacionShow;

    }

    public Long getIdEvaluacionShow() {
        return idEvaluacionShow;
    }

    public void setIdEvaluacionShow(Long idEvaluacionShow) {
        this.idEvaluacionShow = idEvaluacionShow;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public ShowEntity getIdShow() {
        return idShow;
    }

    public void setIdShow(ShowEntity idShow) {
        this.idShow = idShow;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



}
