package com.mendis.app.Habilidades;
import java.io.Serializable;

public class Habilidade implements Serializable {

    private Habilidade proxima;
    private Habilidade anterior;

    private Object nomeHabilidade;
    private Object descricaoHabilidade;
    
    private final int levelLibera;
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
    
    public Habilidade(Object nomeNovo, Object descricaoNova, int levelLibera) {
        this.levelLibera = levelLibera;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public Habilidade(Object nomeNovo, Object descricaoNova, Habilidade nova, int levelLibera) {
        this.levelLibera = levelLibera;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = nova;

    }

    public int getLevelLibera() {
        return this.levelLibera;
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

    public Object getNome() {
        return nomeHabilidade;
    }

    public Object getDescricao() {
        return descricaoHabilidade;
    }
}
