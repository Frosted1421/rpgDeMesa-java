package com.mendis.app.Habilidades;

import java.util.ArrayList;

import com.mendis.app.Proficiencias;
import com.mendis.app.ArmasItens.BolsaItens;

public class InicialPadrao {
    protected BolsaItens bolsaInicial = null;
    protected Proficiencias prof = new Proficiencias();
    protected ArrayList<Habilidade> habPassPadrao = new ArrayList<>();
    protected ArrayList<HabilidadeAtiva> habAtivasPadrao = new ArrayList<>();

    public BolsaItens getBolsaItens(){
        return this.bolsaInicial;
    }
    public ArrayList<Habilidade> getHabilidadesPassivasInicial(){
        return this.habPassPadrao;
    }
    public ArrayList<HabilidadeAtiva> getHabilidadeAtivasInicial(){
        return this.habAtivasPadrao;
    }
    public Proficiencias getProficiencias(){
        return this.prof;
    }
}
