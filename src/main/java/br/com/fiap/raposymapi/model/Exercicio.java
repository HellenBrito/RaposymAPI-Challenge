package br.com.fiap.raposymapi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Exercicio {
    

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nmExercicio;

    @NotBlank
    @Size(min = 20)
    private String dsExercicio;

    private int score = 100;
    private int status = 0;

    public Exercicio(String nmExercicio, String dsExercicio){
        this.nmExercicio = nmExercicio;
        this.dsExercicio = dsExercicio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmExercicio() {
        return nmExercicio;
    }

    public void setNmExercicio(String nmExercicio) {
        this.nmExercicio = nmExercicio;
    }

    public String getDsExercicio() {
        return dsExercicio;
    }

    public void setDsExercicio(String dsExercicio) {
        this.dsExercicio = dsExercicio;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
