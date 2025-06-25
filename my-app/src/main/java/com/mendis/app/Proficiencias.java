package com.mendis.app;

import java.util.ArrayList;

public class Proficiencias {
    private ArrayList<String> linguas = new ArrayList<String>();
    private int qtdPLinguas = 0;

    private ArrayList<String> armasSimples = new ArrayList<String>();
    private int qtdPArmasSimples = 0;

    private ArrayList<String> armasMarciais = new ArrayList<String>();
    private int qtdPArmasMarciais = 0;

    private ArrayList<String> armaduras = new ArrayList<String>();
    private int qtdPArmaduras = 0;

    private ArrayList<String> fraquezas = new ArrayList<String>();
    private int qtdPFraquezas = 0;

    private ArrayList<String> vantagens = new ArrayList<String>();
    private int qtdPVantagem = 0;

    private ArrayList<String> ferramentas = new ArrayList<String>();
    private int qtdPFerramentas = 0;

    public void novaProficienciaArmadura(String armadura) {
        if (qtdPArmaduras == 0) {
            this.armaduras.add(armadura);
            this.qtdPArmaduras++;
        } else if (armaduras.contains(armadura)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {

            this.armaduras.add(armadura);
            this.qtdPArmaduras++;

        }
    }

    public void novaProficienciaVantagem(String vantagem) {
        if (qtdPVantagem == 0) {
            this.vantagens.add(vantagem);
            this.qtdPVantagem++;
        } else if (vantagens.contains(vantagem)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {

            this.vantagens.add(vantagem);
            this.qtdPVantagem++;

        }
    }

    public void novaProficienciaArmaMarcial(String armaMarcial) {
        if (qtdPArmasMarciais == 0) {
            this.armasMarciais.add(armaMarcial);
            this.qtdPArmasMarciais++;
        } else if (armasMarciais.contains(armaMarcial)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {

            this.armasMarciais.add(armaMarcial);
            this.qtdPArmasMarciais++;

        }
    }

    public void novaProficienciaArma(String arma) {
        if (qtdPArmasSimples == 0) {
            this.armasSimples.add(arma);
            this.qtdPArmasSimples++;
        } else if (armasSimples.contains(arma)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {
            this.armasSimples.add(arma);
            this.qtdPArmasSimples++;
        }
    }

    public void novaProficienciaLinguas(String lingua) {
        if (qtdPLinguas == 0) {
            this.linguas.add(lingua);
            this.qtdPLinguas++;
        } else if (linguas.contains(lingua)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {

            this.linguas.add(lingua);
            this.qtdPLinguas++;

        }
    }

    public void novaProficienciaFerramentas(String ferramenta) {
        if (qtdPFerramentas == 0) {
            this.ferramentas.add(ferramenta);
            this.qtdPFerramentas++;
        } else if (ferramentas.contains(ferramenta)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {
            this.ferramentas.add(ferramenta);
            this.qtdPFerramentas++;
        }
    }

    public void novaProficienciaFraqueza(String fraqueza) {
        if (qtdPFraquezas == 0) {
            this.fraquezas.add(fraqueza);
            this.qtdPFraquezas++;
        } else if (fraquezas.contains(fraqueza)) {

            throw new IllegalArgumentException("Personagem ja possui essa vantagem");

        } else {
            this.fraquezas.add(fraqueza);
            this.qtdPFraquezas++;

        }
    }
}