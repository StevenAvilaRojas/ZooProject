package co.edu.konrad.zooproject.dto;

import co.edu.konrad.zooproject.entities.AlimentoEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;

/**
 *
 * @author Alexander Nicholls, Diego Cortazar, Steven Avila
 */
public final class AlimentoDTO {

    private Long idAlimento;
    private Long tipoAnimal;
    private String tipoAlimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaAlimento;

    public AlimentoDTO(AlimentoEntity alimento) {
        this.idAlimento = alimento.getIdAlimento();
        this.tipoAnimal = alimento.getTipoAnimal();
        this.tipoAlimento = alimento.getTipoAlimento();
        this.horaAlimento = alimento.getHoraAlimento();
    }

    public AlimentoEntity toEntity() {
        AlimentoEntity alimento = new AlimentoEntity();
        alimento.setIdAlimento(this.idAlimento);
        alimento.setTipoAnimal(this.tipoAnimal);
        alimento.setTipoAlimento(this.tipoAlimento);
        alimento.setHoraAlimento(this.horaAlimento);
        return alimento;
    }

    public static List<AlimentoDTO> toAlimentoList(List<AlimentoEntity> alimento) {

        List<AlimentoDTO> listaAlimento = new ArrayList<>();

        for (int i = 0; i < alimento.size(); i++) {

            listaAlimento.add(new AlimentoDTO(alimento.get(i)));

        }

        return listaAlimento;

    }

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Long getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(Long tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public Date getHoraAlimento() {
        return horaAlimento;
    }

    public void setHoraAlimento(Date horaAlimento) {
        this.horaAlimento = horaAlimento;
    }

}
