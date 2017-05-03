package io.leonardortlima.aula2.model;

import java.io.Serializable;

/**
 * @author leonardortlima
 * @since 2017-05-03
 */
public class Programa implements Serializable {

    private static final long serialVersionUID = 5700200886260339878L;

    private String horario;

    private String descricao;

    public Programa(String horario, String descricao) {
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
