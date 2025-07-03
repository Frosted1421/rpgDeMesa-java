package com.mendis.app.Classe;
import com.mendis.app.*;
import com.mendis.app.Habilidades.*;
import java.util.ArrayList;
public class Classe {

    private final Atributos atributo;

    private final boolean isBarbaro;
    private final boolean isMago;
    private final boolean isHalfling;
    private final boolean isElfo;
    private final boolean isBardo;
    protected int slotsFeitico;

    
    public Classe(Atributos novo) {
        this.atributo = novo;
        if (atributo instanceof Barbaro barbaro) {
            this.isBarbaro = true;
            this.isMago = false;
            this.isHalfling = false;
            this.isElfo = false;
            this.isBardo = false;
        } else {
            // todo - else somente pro java parar de encher o saco
            this.isBarbaro = false;
            this.isMago = false;
            this.isHalfling = false;
            this.isElfo = false;
            this.isBardo = false;
        }
    }

    public ArrayList<HabilidadeAtiva> getNovasHabilidadeAtivas() {
        return atributo.novoLevelHabilidadesAtivas();

    }
    public int getSlotsFeitico(){
        return this.slotsFeitico;
    }
    public ArrayList<Habilidade> getNovasHabilidadesPassivas() {
        return atributo.novoLevelHabilidadesPassivas();
    }

    public void recebeXP(int xp) {
        this.atributo.recebeXp(xp);
    }

    public int getLevel() {

        return this.atributo.getLevel();
    }

}
