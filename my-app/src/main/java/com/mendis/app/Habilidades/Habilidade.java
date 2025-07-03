package com.mendis.app.Habilidades;
import java.io.Serializable;

public class Habilidade implements Serializable {

    private Habilidade proxima;
    private Habilidade anterior;

    private String nomeHabilidade;
    private String descricaoHabilidade;
    private  int levelLibera;
    
    public Habilidade(Habilidade hab){
        this.nomeHabilidade=hab.getNome();
        this.descricaoHabilidade=hab.getDescricao();
        this.levelLibera=hab.getLevelLibera();
    }
    
    public Habilidade(Habilidade hab,Habilidade nova){
        this.nomeHabilidade=hab.getNome();
        this.descricaoHabilidade=hab.getDescricao();
        this.levelLibera=hab.getLevelLibera();
        this.proxima=nova;
    }
    
    public Habilidade(String nomeNovo, String descricaoNova, int levelLibera) {
        this.levelLibera = levelLibera;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public Habilidade(String nomeNovo, String descricaoNova, Habilidade nova, int levelLibera) {
        this.levelLibera = levelLibera;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = nova;

    }

    public int getLevelLibera() {
        return this.levelLibera;
    }
    public void alteraLevelLibera(int novoLevel){
        this.levelLibera=novoLevel;
    }
    public void setAnterior(Habilidade anterior) {
        this.anterior = anterior;
    }

    public void setProxima(Habilidade proxima) {
        this.proxima = proxima;
    }

    public Habilidade getProxima() {
        return this.proxima;
    }

    public String getNome() {
        return nomeHabilidade;
    }

    public String getDescricao() {
        return descricaoHabilidade;
    }
}
