package com.mendis.app.ArmasItens;
import java.io.Serializable;

public class ArmaLongoAlcance implements Serializable {
    public final String nomeArma;
    public final String tipoDano;
    public final String tipoMunicao;
    public final int distanciaMinima;
    public final int distanciaMaxima;

    public final boolean precisaCarregar;
    public boolean carregada;
    public int municao;

    public final int peso;
    public int valor;
    public int dano;

    public ArmaLongoAlcance(
            String nomeArma, String tipoDano, String tipoMunicao, int dano, int distanciaMinima, 
            int distanciaMaxima, boolean precisaCarregar, int peso) {
                
        this.peso = peso;
        this.tipoMunicao = tipoMunicao;
        this.precisaCarregar = precisaCarregar;
        this.nomeArma = nomeArma;
        this.tipoDano = tipoDano;
        this.distanciaMaxima = distanciaMaxima;
        this.distanciaMinima = distanciaMinima;
        this.dano = dano;
    }

    public int getValor() {
        return this.valor;
    }

    public void inflacionou(int valorNovo) {
        this.valor = valorNovo;
    }

    public int getDistanciaMin() {
        return this.distanciaMinima;
    }

    public int getDistanciaMax() {
        return this.distanciaMaxima;
    }

    public String getNome() {

        return this.nomeArma;
    }

    public String getTipoDano() {
        return this.tipoDano;
    }

    @Override
    public String toString() {
        StringBuilder descricaoArma = new StringBuilder();
        descricaoArma.append("Nome da Arma:").append(nomeArma).append('\n')
                .append("Tipo de dano:").append(tipoDano).append(" Dano:").append(dano).append('\n')
                .append("Distancia Maxima:").append(distanciaMaxima).append(" Distancia Minima:")
                .append(distanciaMinima).append('\n')
                .append("Tipo de Munição:").append(tipoMunicao).append('\n')
                .append("Valor em Moedas de Ouro:").append(valor).append("Peso: ").append(peso);

        return descricaoArma.toString();
    }
}
