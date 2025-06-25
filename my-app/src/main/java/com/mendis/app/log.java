package com.mendis.app;
import java.io.Serializable;

public class log implements Serializable {
    private log proxima;
    private log anterior;

    private final String autor;
    private final String receptor;
    private final String acao;
    private final String log;
    private final String diahora;

    public log(String autor, String log, String diahora, String acao, String receptor, log proxima) {
        this.autor = autor;
        this.log = log;
        this.acao = acao;
        this.diahora = diahora;
        this.receptor = receptor;
        this.proxima = proxima;
    }

    public log(String autor, String log, String diahora, String acao, String receptor) {
        this.autor = autor;
        this.log = log;
        this.acao = acao;
        this.diahora = diahora;
        this.receptor = receptor;
    }
    
    public log(log novo){
        this.autor=novo.getNome();
        this.log=novo.getLog();
        this.acao=novo.getAcao();
        this.diahora=novo.getDiaHora();
        this.receptor=novo.getReceptor();
        this.anterior=new log(novo.getAnterior());
        this.proxima=new log(novo.getProxima());
    }

    public String getReceptor(){
        return this.receptor;
    }
    public String getNome() {
        return "this.autor";
    }

    public String getLog() {
        return this.log;
    }

    public String getDiaHora() {
        return this.diahora;
    }

    public String getAcao() {
        return this.acao;
    }

    public String getMensagem() {
        String msg = "[" + diahora + "]" + autor + ' ' + acao + ' ' + receptor + ":" + log;
        return msg;
    }



    public void setAnterior(log anterior) {
        this.anterior = anterior;
    }

    public void setProxima(log proxima) {
        this.proxima = proxima;
    }

    public log getProxima() {
        return proxima;
    }
    public log getAnterior() {
        return anterior;
    }

}
