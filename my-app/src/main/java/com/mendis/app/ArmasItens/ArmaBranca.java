package com.mendis.app.ArmasItens;
import java.io.Serializable;

public class ArmaBranca implements Serializable {

    private int preco;
    private final int danoUmaMao;
    private final int danoDuasMaos;
    private final int peso;

    private final String tipoDano;
    private final String tipoArma;
    private final String nomeArma;

    private final boolean leve;
    private final boolean media;
    private final boolean pesada;

    private final boolean somenteDuasMaos;
    private final boolean permiteDuasMaos;
    private final boolean arremessavel;

    private final boolean precisaProficiencia;
    private final boolean finesse;

    private boolean equipadoDuasMaos;

    public ArmaBranca(
            String nomeArma, 
            String tipoArma, 
            int preco, 
            int danoUmaMao, 
            int danoDuasMaos, 
            int peso, 
            String tipoDano,
            boolean arremessavel,
            boolean duasMaos, 
            boolean leve, 
            boolean media, 
            boolean pesada,
            boolean finesse, 
            boolean precisaProficiencia, 
            boolean somenteDuasMaos) {
        this.nomeArma = nomeArma;
        this.tipoArma = tipoArma;

        this.precisaProficiencia = precisaProficiencia;
        this.finesse = finesse;

        this.danoUmaMao = danoUmaMao;
        this.danoDuasMaos = danoDuasMaos;

        this.peso = peso;
        this.tipoDano = tipoDano;

        this.somenteDuasMaos = somenteDuasMaos;
        this.arremessavel = arremessavel;

        this.permiteDuasMaos = somenteDuasMaos ? false : duasMaos;

        this.leve = leve;
        this.media = media;
        this.pesada = pesada;
    }

    public boolean getProficiencia() {
        return this.precisaProficiencia;
    }

    public boolean getArremessavel() {
        return this.arremessavel;
    }

    public boolean getEquipadoDuasMaos() {
        return this.equipadoDuasMaos;
    }
    public boolean getFinesse(){
        return this.finesse;
    }
     public String getNomeArma() {
        return nomeArma;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public int getPreco() {
        return preco;
    }

    public int getDanoUmaMao() {
        return danoUmaMao;
    }

    public int getDanoDuasMaos() {
        return danoDuasMaos;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public boolean isLeve() {
        return leve;
    }

    public boolean isMedia() {
        return media;
    }

    public boolean isPesada() {
        return pesada;
    }

    public boolean isSomenteDuasMaos() {
        return somenteDuasMaos;
    }

    public boolean isPermiteDuasMaos() {
        return permiteDuasMaos;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setEquipadoDuasMaos(boolean equipadoDuasMaos) {
        this.equipadoDuasMaos = equipadoDuasMaos;
    }
    public void trocaMao() {

        if (permiteDuasMaos && !somenteDuasMaos) {
            this.equipadoDuasMaos = !this.equipadoDuasMaos;
        }

    }

    public String getMaosEquipadas() {
        return equipadoDuasMaos ? "apenas Uma mao" : "duas maos";
    }
}