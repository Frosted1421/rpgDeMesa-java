package com.mendis.app;
import com.mendis.app.ArmasItens.*;
import com.mendis.app.Habilidades.*;
import com.mendis.app.ClassesRacas.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Ficha implements Serializable {

    
    
    private Status statusPersonagem;

    private ListaLog logPersonagem = new ListaLog();

    private BolsaItens bolsaPersonagem;

    private Proficiencias proficienciasPersonagem;

    private Classe classe;

    private int level = 1;
    //todo
    public class Ficha(
    )
    
    public void novoXp(int xp) {
        this.classe.recebeXP(xp);
        if (this.classe.getLevel() > this.level) {
            this.level = classe.getLevel();
            ArrayList<Habilidade> novaP = this.classe.getNovasHabilidadesPassivas();

            ArrayList<HabilidadeAtiva> novaA = this.classe.getNovasHabilidadeAtivas();

            for (int x = 0; x <= novaP.size() - 1; x++) {
                this.habilidadesPassivasPersonagem.adiciona(novaP.get(x));
            }

            for (int x = 0; x <= novaA.size() - 1; x++) {
                this.habilidadesAtivasPersonagem.adiciona(novaA.get(x));
            }

        }
    }

    // todo
    // enviar ao log a cada açao
    public void novoLog(log novo) {

        this.logPersonagem.adiciona(novo);
    }
    

    public String mostrarLogPersonagem() {
        return logPersonagem.toString();
    }

}