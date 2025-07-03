package com.mendis.app.Raca;
import com.mendis.app.Habilidades.*;
import java.util.ArrayList;

import com.mendis.app.Habilidades.HabilidadeAtiva;

public class Orc extends Raca {
    private ArrayList<Habilidade> habiliadeInicial=new ArrayList<>();
    private ArrayList<HabilidadeAtiva> habilidadeAInicial=new ArrayList<>();
    private void habilidadesIniciais(){
        HabilidadesPassivasRepo habiliLista = new HabilidadesPassivasRepo();
        this.habiliadeInicial.add(habiliLista.getHabilidade("Visao Nortuna"));
    }
    public Raca(){
        super("Orc",2,0,1,0,0,0,)
    }
    
}
