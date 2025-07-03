package com.mendis.app.ClassesRacas;
import com.mendis.app.Habilidades.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Raca implements Serializable {
    private final String raca;
    private final int bonusForca;
    private final int bonusDestreza;
    private final int bonusResistencia;
    private final int bonusInteligencia;
    private final int bonusSabedoria;
    private final int bonusCarisma;
    private final String[] linguas;

    ArrayList<HabilidadeAtiva> listaHabiAtiva = new ArrayList<>();
    ArrayList<Habilidade> listaHabiPassiva=new ArrayList<>();

    public Raca(
            String nome, int bonusF, int bonusD, int bonusR, int bonusS, int bonusC, int bonusI,
            ArrayList<Habilidade> listaInicial,  ArrayList<HabilidadeAtiva> listaHabilAtiva,
            String[] linguas) {

        this.raca = nome;
        this.bonusForca = bonusF;
        this.bonusDestreza = bonusD;
        this.bonusResistencia = bonusR;
        this.bonusInteligencia = bonusI;
        this.bonusSabedoria = bonusS;
        this.bonusCarisma = bonusC;
        this.listaHabiPassiva = listaInicial;
        this.listaHabiAtiva = listaHabilAtiva;
        this.linguas = linguas;
    }

    public String[] getLinguas() {
        return this.linguas;
    }

    public String getNomeRaca() {
        return raca;
    }

    public ArrayList<Habilidade> getHabilidadesPassivasIniciais() {
        return this.listaHabiPassiva;
    }

    public ArrayList<HabilidadeAtiva> getHabilidadesAtivasRaca() {
        return this.listaHabiAtiva;
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
