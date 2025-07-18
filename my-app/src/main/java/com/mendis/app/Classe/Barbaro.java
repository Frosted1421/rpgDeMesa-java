package com.mendis.app.Classe;
import com.mendis.app.Habilidades.*;
import java.util.ArrayList;


public class Barbaro extends Atributos {

    private boolean rageAtivada = false;
    private int rageAtivadores = 2;
    private int rageDano = 2;
    private boolean forcaAva = false;
    public Barbaro(
        String nome, int forca, int slotsFeitico, int altura, int idade, int pesoAtual, String nomeRaca
        ,ArrayList<Habilidade> habPass,ArrayList<HabilidadeAtiva> habAtiva
        ) {
          super(nome, forca, 0, altura, idade, pesoAtual, nomeRaca, 1, 10,habPass,habAtiva);
            
    }
    public Barbaro(
        String nome, int forca, int slotsFeitico, int altura, int idade, int pesoAtual, String nomeRaca
        ,InicialPadrao inicial
    ){
        super(nome, forca, 0, altura, idade, pesoAtual, nomeRaca, 1, 10,inicial);
            
    
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
    public void ativarForcaAvassaladora(){
        this.forcaAva=true;
    }
    @Override
    public void recebeXp(int xp) {

        int level = super.getLevel();
        super.recebeXp(xp);

        if (super.getLevel() > level) {
            this.novoRaivaDano(super.getLevel());
        }
    }
    public void aumentarPesoMaximo(int forca){
        this.pesoMaximo=forca*15;
        if(this.forcaAva){
            this.pesoMaximo*=2;
        }
    }
}
