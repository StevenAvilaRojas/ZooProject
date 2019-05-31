package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.AnimalEntity;
import co.edu.konrad.zooproject.entities.EvaluacionAnimalEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class EvaluacionAnimalDTO {

    private Long id_evaluacion;
    private AnimalEntity idAnimal;
    private String observacion;
    private Long calificacion;
    private Date fechaEvaluacionAnimal;

    public EvaluacionAnimalDTO() {
    }

    public EvaluacionAnimalDTO(EvaluacionAnimalEntity evaluacionAnimal) {
        this.id_evaluacion = evaluacionAnimal.getId_evaluacion();
        this.idAnimal = evaluacionAnimal.getIdAnimal();
        this.observacion = evaluacionAnimal.getObservacion();
        this.calificacion = evaluacionAnimal.getCalificacion();
        this.fechaEvaluacionAnimal = evaluacionAnimal.getFechaEvaluacionAnimal();
    }

    public EvaluacionAnimalEntity toEntity() {
        EvaluacionAnimalEntity evaluacionAnimal = new EvaluacionAnimalEntity();
        evaluacionAnimal.setId_evaluacion(this.id_evaluacion);
        evaluacionAnimal.setIdAnimal(this.idAnimal);
        evaluacionAnimal.setObservacion(this.observacion);
        evaluacionAnimal.setCalificacion(this.calificacion);
        evaluacionAnimal.setFechaEvaluacionAnimal(this.fechaEvaluacionAnimal);
        return evaluacionAnimal;
    }

    public static List<EvaluacionAnimalDTO> toEvaluacionAnimalList(List<EvaluacionAnimalEntity> evaluacionAnimal) {

        List<EvaluacionAnimalDTO> listaEvaluacionAnimal = new ArrayList<>();

        for (int i = 0; i < evaluacionAnimal.size(); i++) {

            listaEvaluacionAnimal.add(new EvaluacionAnimalDTO(evaluacionAnimal.get(i)));

        }

        return listaEvaluacionAnimal;

    }

    public Long getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(Long id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public AnimalEntity getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(AnimalEntity idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaEvaluacionAnimal() {
        return fechaEvaluacionAnimal;
    }

    public void setFechaEvaluacionAnimal(Date fechaEvaluacionAnimal) {
        this.fechaEvaluacionAnimal = fechaEvaluacionAnimal;
    }


}
