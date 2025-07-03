package com.mendis.app.Habilidades;
import com.mendis.app.*;
import java.io.Serializable;

public class HabilidadeAtiva implements Serializable {

    private HabilidadeAtiva proxima;
    private HabilidadeAtiva anterior;

    private final Object nomeHabilidade;
    private final Object descricaoHabilidade;

    private int rodadasMaximas;
    private int rodadaContador = 0;
    private final int levelLibera;

    private Boolean ativa = false;

    private int[] skillsBonusPts = {
            0, // forca
            0, // destreza
            0, // resistencia
            0, // inteligencia
            0, // sabedoria
            0 // carisma
    };
    public HabilidadeAtiva(HabilidadeAtiva habAti){
        this.rodadasMaximas=habAti.getRodadasMaximas();
        this.skillsBonusPts=habAti.getSkillBonusPts();
        this.nomeHabilidade=habAti.getNome();
        this.descricaoHabilidade=habAti.getDescricao();
        this.levelLibera=habAti.getLevelLibera();
    }

    public HabilidadeAtiva(HabilidadeAtiva habAti,HabilidadeAtiva nova){
        
        this.rodadasMaximas=habAti.getRodadasMaximas();
        this.skillsBonusPts=habAti.getSkillBonusPts();
        
        this.nomeHabilidade=habAti.getNome();
        this.descricaoHabilidade=habAti.getDescricao();
        this.levelLibera=habAti.getLevelLibera();
        this.proxima=nova;
    }
    
    public HabilidadeAtiva(
            Object nomeNovo, Object descricaoNova, int[] skillsPontos, int rodadasMaximas, int levelLibera) {

        if (skillsPontos.length != 6) {
            throw new IllegalArgumentException("Habilidades erradas");

        }
        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.levelLibera = levelLibera;
    }

    public HabilidadeAtiva(
            Object nomeNovo, Object descricaoNova, int[] skillsPontos, 
            int rodadasMaximas,HabilidadeAtiva nova, int levelLibera
        ) {

        if (skillsPontos.length != 6 || rodadasMaximas < 0) {
            throw new IllegalArgumentException("Habilidades erradas");
        }

        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = nova;
        this.levelLibera = levelLibera;
    }

    public Status ativaHabilidade(Status recebido) {

        Status ativado = recebido;
        this.ativa = true;
        this.rodadaContador = 1;

        recebido.forcaAlterar(skillsBonusPts[0]);
        recebido.destrezaAlterar(skillsBonusPts[1]);
        recebido.resistenciaAlterar(skillsBonusPts[2]);
        recebido.inteligenciaAlterar(skillsBonusPts[3]);
        recebido.sabedoriaAlterar(skillsBonusPts[4]);
        recebido.carismaAlterar(skillsBonusPts[5]);

        return ativado;
    }

    public Status ativaHabilidade(Status recebido, int rodadasMaximas) {

        Status ativado = recebido;
        this.ativa = true;
        this.rodadaContador = 1;
        this.rodadasMaximas=rodadasMaximas;

        recebido.forcaAlterar(skillsBonusPts[0]);
        recebido.destrezaAlterar(skillsBonusPts[1]);
        recebido.resistenciaAlterar(skillsBonusPts[2]);
        recebido.inteligenciaAlterar(skillsBonusPts[3]);
        recebido.sabedoriaAlterar(skillsBonusPts[4]);
        recebido.carismaAlterar(skillsBonusPts[5]);

        return ativado;
    }
    public void prorrogaHabilidade(){
        this.rodadaContador=1;
    }

    public Status desativaHabilidade(Status recebido) {

        if (estaAtivada()) {
            throw new IllegalArgumentException("HabilidadeAtiva ja desativada");

        }
        if (excedeuRodadas()) {

            this.rodadaContador = 0;
            this.ativa = false;

            recebido.forcaAlterar(-skillsBonusPts[0]);
            recebido.destrezaAlterar(-skillsBonusPts[1]);
            recebido.resistenciaAlterar(-skillsBonusPts[2]);
            recebido.inteligenciaAlterar(-skillsBonusPts[3]);
            recebido.sabedoriaAlterar(-skillsBonusPts[4]);
            recebido.carismaAlterar(-skillsBonusPts[5]);

        } else {
            throw new IllegalArgumentException("HabilidadeAtiva não execeu a quantidade de rodadas ativadas");
        }

        return recebido;
    }

    public boolean excedeuRodadas() {
        return this.rodadaContador >= this.rodadasMaximas;
    }

    public int getLevelLibera() {
        return this.levelLibera;
    }

    public boolean estaAtivada() {
        return this.ativa;
    }

    public int[] getSkillBonusPts() {
        return this.skillsBonusPts;
    }

    public void proximaRodada() {

        this.rodadaContador++;
    }
    public void setAnterior(HabilidadeAtiva hab){
        this.anterior=hab;
    }
    public void setProxima(HabilidadeAtiva proxima) {
        this.proxima = proxima;
    }

    public HabilidadeAtiva getProxima() {
        return this.proxima;
    }

    public Object getNome() {
        return nomeHabilidade;
    }

    public Object getDescricao() {
        return descricaoHabilidade;
    }
    public int getRodadasMaximas(){
        return this.rodadasMaximas;
    }
}
