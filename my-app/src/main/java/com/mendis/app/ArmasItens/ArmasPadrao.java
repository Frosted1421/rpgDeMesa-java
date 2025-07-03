package com.mendis.app.ArmasItens;

import java.util.ArrayList;
//armas de acordo com o livro de regra do DND 5e
public class ArmasPadrao {
    private ArrayList<ArmaBranca> listaArmas = new ArrayList<>();
    private ArrayList<ArmaLongoAlcance> listArmasLongo = new ArrayList<>();

    public ArmasPadrao() {
        this.listaArmas.add(new ArmaBranca("Adaga", "Simples", 2, 4, 0, 1, "perfurante", true, false, true, false, false, true, true, false));
        this.listaArmas.add(new ArmaBranca("Clava", "Simples", 0, 4, 0, 2, "concussão", false, false, true, false, false, false, false, false));
        this.listaArmas.add(new ArmaBranca("Foice Curta", "Simples", 1, 4, 0, 2, "corte", false, false, true, false, false, true, false, false));
        this.listaArmas.add(new ArmaBranca("Lança", "Simples", 1, 6, 0, 3, "perfurante", true, true, false, false, false, false, false, false));
        this.listaArmas.add(new ArmaBranca("Maça", "Simples", 5, 6, 0, 4, "concussão", false, false, false, false, false, false, false, false));
        this.listaArmas.add(new ArmaBranca("Porrete", "Simples", 0, 6, 0, 2, "concussão", false, true, false, false, false, false, false, false));
        this.listaArmas.add(new ArmaBranca("Cajado", "Simples", 2, 6, 8, 4, "concussão", false, true, false, false, false, false, false, true));
        this.listaArmas.add(new ArmaBranca("Foice", "Simples", 1, 4, 0, 2, "corte", false, false, true, false, false, false, false, false));

        this.listaArmas.add(new ArmaBranca("Alabarda", "Marcial", 20, 10, 0, 6, "corte", false, true, false, false, true, false, false, true));
        this.listaArmas.add(new ArmaBranca("Espada Longa", "Marcial", 15, 8, 10, 3, "corte", false, true, false, false, false, false, false, false));
        this.listaArmas.add(new ArmaBranca("Espada Curta", "Marcial", 10, 6, 0, 2, "corte", false, false, true, false, false, true, true, false));
        this.listaArmas.add(new ArmaBranca("Espada Bastarda", "Marcial", 35, 8, 10, 6, "corte", false, true, false, false, false, false, false, true));
        this.listaArmas.add(new ArmaBranca("Machado Grande", "Marcial", 30, 0, 12, 7, "corte", false, true, false, false, true, false, false, true));
        this.listaArmas.add(new ArmaBranca("Martelo de Guerra", "Marcial", 15, 8, 10, 2, "concussão", false, true, false, false, false, false, false, true));
        this.listaArmas.add(new ArmaBranca("Lança Longa", "Marcial", 10, 12, 0, 6, "perfurante", false, true, false, false, true, false, false, true));
        this.listaArmas.add(new ArmaBranca("Tridente", "Marcial", 5, 6, 8, 4, "perfurante", true, true, false, false, false, false, false, true));
        this.listaArmas.add(new ArmaBranca("Mangual", "Marcial", 10, 8, 0, 2, "concussão", false, true, false, false, false, false, false, false));
        
        
        this.listArmasLongo.add(new ArmaLongoAlcance("Arco Curto", "perfurante", "flecha", 6, 80, 320, false, 2));
        this.listArmasLongo.add(new ArmaLongoAlcance("Arco Longo", "perfurante", "flecha", 8, 150, 600, false, 2));
        this.listArmasLongo.add(new ArmaLongoAlcance("Bestinha Leve", "perfurante", "virote", 8, 80, 320, true, 5));
        this.listArmasLongo.add(new ArmaLongoAlcance("Bestinha Pesada", "perfurante", "virote", 10, 100, 400, true, 18));
        this.listArmasLongo.add(new ArmaLongoAlcance("Funda", "concussão", "pedra", 4, 30, 120, false, 0));
        this.listArmasLongo.add(new ArmaLongoAlcance("Dardo", "perfurante", "dardo", 4, 20, 60, false, 0));
        this.listArmasLongo.add(new ArmaLongoAlcance("Rede", "restrição", "rede", 0, 5, 15, false, 3));
    
       
    }

    public ArrayList<ArmaBranca> getListaArmas() {
         return this.listaArmas;
    }
    public ArrayList<ArmaLongoAlcance> getLitsaArmasAlcance(){
        return this.listArmasLongo;
    }
}