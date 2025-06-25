package com.mendis.app;

import java.io.Serializable;

public class Status implements Serializable {

    private int forca;
    private int destreza;
    private int resistencia;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    public Status(
            int level, int xp, int forca, int destreza, int resistencia, int inteligencia, int sabedoria,
            int carisma) {

        this.forca = forca;
        this.destreza = destreza;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public void resistenciaAlterar(int qtd) {
        if (this.resistencia + qtd > 20) {
            this.resistencia = 20;
        } else if (this.resistencia + qtd < 0) {
            this.resistencia = 0;
        } else {
            this.resistencia += qtd;
        }
    }

    public void sabedoriaAlterar(int qtd) {
        if (this.sabedoria + qtd > 20) {
            this.sabedoria = 20;
        } else if (this.sabedoria + qtd < 0) {
            this.sabedoria = 0;
        } else {
            this.sabedoria += qtd;
        }
    }

    public int getResitencia() {
        return this.resistencia;
    }

    public void inteligenciaAlterar(int qtd) {
        if (this.inteligencia + qtd > 20) {
            this.inteligencia = 20;
        } else if (this.inteligencia + qtd < 0) {
            this.inteligencia = 0;
        } else {
            this.inteligencia += qtd;
        }
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void carismaAlterar(int qtd) {
        if (this.carisma + qtd > 20) {
            this.carisma = 20;
        } else if (this.carisma + qtd < 0) {
            this.carisma = 0;
        } else {
            this.carisma += qtd;
        }
    }

    public int getCarisma() {
        return this.carisma;
    }

    public void forcaAlterar(int qtd) {
        if (this.forca + qtd > 20) {
            this.forca = 20;
        } else if (this.forca + qtd < 0) {
            this.forca = 0;
        } else {
            this.forca += qtd;
        }
    }

    public int getForca() {
        return this.forca;
    }

    public void destrezaAlterar(int qtd) {
        if (this.destreza + qtd > 20) {
            this.destreza = 20;
        } else if (this.destreza + qtd < 0) {
            this.destreza = 0;
        } else {
            this.destreza += qtd;
        }
    }

    public int getDestreza() {
        return this.destreza;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("Pontos de Habilidae").append('\n')
                .append("- Sabedoria:").append(sabedoria).append('\n')
                .append("- Forca:").append(forca).append('\n')
                .append("- Inteligenca:").append(inteligencia).append('\n')
                .append("- Destreza:").append(destreza).append('\n')
                .append("- Resistencia:").append(resistencia).append('\n');

        return builder.toString();
    }

}
