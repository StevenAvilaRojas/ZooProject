package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.CuidadorEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class CuidadorDTO {

    private Long idCuidador;
    private String nomCompleto;
    private Long numeroId;
    private String tipoId;
    private Date fechaNacimiento;
    private Long celular;

    public CuidadorDTO(CuidadorEntity cuidador) {
        this.idCuidador = cuidador.getIdCuidador();
        this.nomCompleto = cuidador.getNomCompleto();
        this.numeroId = cuidador.getNumeroId();
        this.tipoId = cuidador.getTipoId();
        this.fechaNacimiento = cuidador.getFechaNacimiento();
        this.celular = cuidador.getCelular();
    }

    public CuidadorEntity toEntity() {
        CuidadorEntity cuidador = new CuidadorEntity();
        cuidador.setIdCuidador(this.idCuidador);
        cuidador.setNomCompleto(this.nomCompleto);
        cuidador.setNumeroId(this.numeroId);
        cuidador.setTipoId(this.tipoId);
        cuidador.setFechaNacimiento(this.fechaNacimiento);
        cuidador.setCelular(this.celular);
        return cuidador;
    }

    public static List<CuidadorDTO> toCuidadorList(List<CuidadorEntity> cuidador) {

        List<CuidadorDTO> listaCuidador = new ArrayList<>();

        for (int i = 0; i < cuidador.size(); i++) {

            listaCuidador.add(new CuidadorDTO(cuidador.get(i)));

        }

        return listaCuidador;

    }

    public Long getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(Long idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public Long getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(Long numeroId) {
        this.numeroId = numeroId;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
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

   

}
