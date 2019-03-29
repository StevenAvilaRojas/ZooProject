package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.EncargadoShowEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class EncargadoShowDTO {

    private Long idEncargadoShow;
    private String tipoId;
    private Long numeroId;
    private Date fechaNacimiento;
    private Long celular;
    private String nombre;
    
    public EncargadoShowDTO(EncargadoShowEntity encargadoShow) {
        this.idEncargadoShow = getIdEncargadoShow();
        this.tipoId = getTipoId();
        this.numeroId = getNumeroId();
        this.fechaNacimiento = getFechaNacimiento();
        this.celular = getCelular();
        this.nombre = getNombre();
    }

    public EncargadoShowEntity toEntity() {
        EncargadoShowEntity encargadoShow = new EncargadoShowEntity();
        encargadoShow.setIdEncargadoShow(this.idEncargadoShow);
        encargadoShow.setTipoId(this.tipoId);
        encargadoShow.setNumeroId(this.numeroId);
        encargadoShow.setFechaNacimiento(this.fechaNacimiento);
        encargadoShow.setCelular(this.celular);
        encargadoShow.setNombre(this.nombre);
        return encargadoShow;
    }

    public static List<EncargadoShowDTO> toEncargadoShowList(List<EncargadoShowEntity> encargadoShow) {

        List<EncargadoShowDTO> listaEncargadoShow = new ArrayList<>();

        for (int i = 0; i < encargadoShow.size(); i++) {

            listaEncargadoShow.add(new EncargadoShowDTO(encargadoShow.get(i)));

        }

        return listaEncargadoShow;

    }

    public Long getIdEncargadoShow() {
        return idEncargadoShow;
    }

    public void setIdEncargadoShow(Long idEncargadoShow) {
        this.idEncargadoShow = idEncargadoShow;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public Long getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(Long numeroId) {
        this.numeroId = numeroId;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
