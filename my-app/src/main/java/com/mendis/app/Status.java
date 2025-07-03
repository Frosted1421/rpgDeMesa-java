package com.mendis.app;

import java.io.Serializable;

public class Status implements Serializable {

    private int forca;
    private int destreza;
    private int resistencia;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private boolean campeaoPrimal=false;

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
        int max=20;
        if (this.resistencia + qtd > max) {
            this.resistencia = 20;
        } else if (this.resistencia + qtd < 8) {
            this.resistencia = 8;
        } else {
            this.resistencia += qtd;
        }
    }

    public void sabedoriaAlterar(int qtd) {
        int max=20;
        if (this.sabedoria + qtd > max) {
            this.sabedoria = max;
        } else if (this.sabedoria + qtd < 8) {
            this.sabedoria = 8;
        } else {
            this.sabedoria += qtd;
        }
    }

    public int getResitencia() {
        return this.resistencia;
    }

    public void inteligenciaAlterar(int qtd) {
        int max=20;
        if (this.inteligencia + qtd >max) {
            this.inteligencia = max;
        } else if (this.inteligencia + qtd < 8) {
            this.inteligencia = 8;
        } else {
            this.inteligencia += qtd;
        }
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void carismaAlterar(int qtd) {
        int max=20;
        if (this.carisma + qtd > max) {
            this.carisma = max;
        } else if (this.carisma + qtd < 8) {
            this.carisma = 8;
        } else {
            this.carisma += qtd;
        }
    }

    public int getCarisma() {
        return this.carisma;
    }

    public void forcaAlterar(int qtd) {
        int max=20;
        if(this.campeaoPrimal){
            max=24;
        }
        if (this.forca + qtd > max) {
            this.forca = max;
        } else if (this.forca + qtd < 8) {
            this.forca = 8;
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
        } else if (this.destreza + qtd < 8) {
            this.destreza = 8;
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
