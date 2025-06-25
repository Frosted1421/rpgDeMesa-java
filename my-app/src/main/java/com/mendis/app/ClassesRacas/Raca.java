package com.mendis.app.ClassesRacas;
import com.mendis.app.Habilidades.*;
import java.io.Serializable;

public class Raca implements Serializable {
    private final String raca;
    private final int bonusForca;
    private final int bonusDestreza;
    private final int bonusResistencia;
    private final int bonusInteligencia;
    private final int bonusSabedoria;
    private final int bonusCarisma;
    private final String[] linguas;

    ListaHabilidadePassivas listaHabilRaca = new ListaHabilidadePassivas();

    ListaHabilidadesAtivas listaHabilAtiva = new ListaHabilidadesAtivas();

    public Raca(
            String nome, int bonusF, int bonusD, int bonusR, int bonusS, int bonusC, int bonusI,
            ListaHabilidadePassivas listaInicial, ListaHabilidadesAtivas listaHabilAtiva,
            String[] linguas) {

        this.listaHabilAtiva = listaHabilAtiva;
        this.raca = nome;
        this.bonusForca = bonusF;
        this.bonusDestreza = bonusD;
        this.bonusResistencia = bonusR;
        this.bonusInteligencia = bonusI;
        this.bonusSabedoria = bonusS;
        this.bonusCarisma = bonusC;
        this.listaHabilRaca = listaInicial;
        this.listaHabilAtiva = listaHabilAtiva;
        this.linguas = linguas;
    }

    public String[] getLinguas() {
        return this.linguas;
    }

    public String getNomeRaca() {
        return raca;
    }

    public ListaHabilidadePassivas getHabilidadesPassivasIniciais() {
        return this.listaHabilRaca;
    }

    public ListaHabilidadesAtivas getHabilidadesAtivasRaca() {
        return this.listaHabilAtiva;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public int getBonusDestreza() {
        return bonusDestreza;
    }

    public int getBonusCarisma() {
        return bonusCarisma;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public int getBonusSabedoria() {
        return bonusSabedoria;
    }

    public int getBonusResistencia() {
        return bonusResistencia;
    }

    @Override
    // todo
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(
                "");
        return builder.toString();

    }
}
