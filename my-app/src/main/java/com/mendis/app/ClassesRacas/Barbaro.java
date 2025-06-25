package com.mendis.app.ClassesRacas;
import com.mendis.app.Atributos;
import com.mendis.app.Habilidades.HabilidadeAtiva;
import com.mendis.app.Habilidades.Habilidade;
import java.util.ArrayList;

//todo
public class Barbaro extends Atributos {

    private boolean rageAtivada = false;
    private int rageAtivadores = 2;
    private int rageDano = 2;

    
    public Barbaro(
        String nome, int forca, int slotsFeitico, int altura, int idade, int pesoAtual, String nomeRaca
        ,ArrayList<Habilidade> habPass,ArrayList<HabilidadeAtiva> habAtiva) {
 
            
          super(nome, forca, slotsFeitico, altura, idade, pesoAtual, nomeRaca, 1, 10,habPass,habAtiva);
           
    }

    private void novoRaivaDano(int level) {
        if (level > 8 && level < 16) {
            this.rageDano = 3;
        } else if (level > 16) {
            this.rageDano = 4;
        }
    }

    public int getAtivadoresRaiva() {
        return this.rageAtivadores;
    }

    public int getDanoRaiva() {
        return this.rageDano;
    }

    @Override
    public void recebeXp(int xp) {

        int level = super.getLevel();
        super.recebeXp(xp);

        if (super.getLevel() > level) {
            this.novoRaivaDano(super.getLevel());
        }

    }

}
