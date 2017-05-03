package io.leonardortlima.aula2.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author leonardortlima
 * @since 2017-05-03
 */
public class DiaSemana implements Serializable {

    private static final long serialVersionUID = -4199774882622012180L;

    private String nome;

    private List<Programa> programas;

    public DiaSemana(String nome, List<Programa> programas) {
        this.nome = nome;
        this.programas = programas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(List<Programa> programas) {
        this.programas = programas;
    }
}
