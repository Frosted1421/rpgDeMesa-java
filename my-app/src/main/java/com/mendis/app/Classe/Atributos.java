package com.mendis.app.Classe;
import com.mendis.app.Status;
import com.mendis.app.Habilidades.*;
import java.util.ArrayList;

public class Atributos {
    private String nome;
    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;

    private int qtdDados;
    private int numLadosDado;
    private int level;

    private int aumentarVida = 0;
    private int aumentarStatus = 0;

    private int xp;

    // aumenta a cada 4 niveis, igual para todos os personagens
    private int bonusProficiencia = 2;

    // pontos de xp necessarios para o proximo nivel são iguais para todos os
    // personagens
    private final int[] XPLEVELUP = {
            0, 300, 900, 2700, 6500, 14000, 23000, 34000, 48000,
            64000, 85000, 10000, 120000, 140000, 165000, 195000, 225000, 265000, 305000,
            355000
    };

    private int altura;
    private int idade;

    private int pesoCorporal;
    private int pesoMaximo;
    private int pesoAtual;

    private int velocidadeMovimento;

    private boolean vivo = true;

    private String nomeRaca;

    private ArrayList<HabilidadeAtiva> habilidadeAtivas = new ArrayList<>();
    private ArrayList<Habilidade> habilidadesPassivas = new ArrayList<>();

    public Atributos(
            String nome, int forca, int slotsFeitiço, int altura, int idade,
            int pesoAtualDoPersonagem, String nomeRaca, int qtdDados, int numLadosDado,
            ArrayList<Habilidade> habilidadesPassivas,ArrayList<HabilidadeAtiva> habilidadeAtivas) {

        this.nome = nome;
        this.pesoCorporal = pesoAtualDoPersonagem;
        this.idade = idade;
        this.nomeRaca = nomeRaca;
        this.qtdDados = qtdDados;
        this.numLadosDado = numLadosDado;

        this.manaMax = slotsFeitiço;
        this.manaAtual = this.manaMax;
        this.hpMax = numLadosDado + forca;
        this.hpAtual = this.hpMax;

        this.altura = altura;
        this.level = 1;
        this.xp = 0;

        this.pesoMaximo = forca * 15;
        this.pesoAtual = 0;

        this.habilidadeAtivas=ordenaHabAtiva(habilidadeAtivas);
        this.habilidadesPassivas=ordenaHabPass(habilidadesPassivas);
    }
    public Atributos(
                String nome, int forca, int slotsFeitiço, int altura, int idade,
            int pesoAtualDoPersonagem, String nomeRaca, int qtdDados, int numLadosDado,
            InicialPadrao inicial) {

        this.nome = nome;
        this.pesoCorporal = pesoAtualDoPersonagem;
        this.idade = idade;
        this.nomeRaca = nomeRaca;
        this.qtdDados = qtdDados;
        this.numLadosDado = numLadosDado;

        this.manaMax = slotsFeitiço;
        this.manaAtual = this.manaMax;
        this.hpMax = numLadosDado + forca;
        this.hpAtual = this.hpMax;

        this.altura = altura;
        this.level = 1;
        this.xp = 0;

        this.pesoMaximo = forca * 15;
        this.pesoAtual = 0;

        this.habilidadeAtivas=ordenaHabAtiva(inicial.getHabilidadeAtivasInicial());
        this.habilidadesPassivas=ordenaHabPass(inicial.getHabilidadesPassivasInicial());
    }

    public int getBonusProficiencia() {
        return this.bonusProficiencia;
    }
    
    private ArrayList<HabilidadeAtiva> ordenaHabAtiva(ArrayList<HabilidadeAtiva>habArray){
            ArrayList<HabilidadeAtiva> habAtiva = habArray;
             boolean trocou;
             HabilidadeAtiva temp;
             int i, j;
             int n=habAtiva.size();
            for (i = 0; i < n - 1; i++) {
                trocou = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (habAtiva.get(j).getLevelLibera() > habAtiva.get(j+1).getLevelLibera()) {        
                        temp = new HabilidadeAtiva(habAtiva.get(j));
                        habAtiva.set(j,habAtiva.get(j+1));
                        habAtiva.set(j+1,temp);
                        trocou = true;
                    }
                }
                    if (trocou == false)
                        break;
            }  
            return habAtiva;
    }
    private ArrayList<Habilidade> ordenaHabPass(ArrayList<Habilidade>habArray){
            ArrayList<Habilidade> habPass=habArray;
             boolean trocou;
             Habilidade temp;
             int i, j;
             int n=habPass.size();
            for (i = 0; i < n - 1; i++) {
                trocou = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (habPass.get(j).getLevelLibera() > habPass.get(j+1).getLevelLibera()) {        
                        temp = new Habilidade(habPass.get(j));
                        habPass.set(j,habPass.get(j+1));
                        habPass.set(j+1,temp);
                        trocou = true;
                    }
                }
                    if (trocou == false)
                        break;
            }  
            return habPass;
    }
    private void novoBonusProficiencia() {
        if ((this.level - 1) % 4 == 0) {
            this.bonusProficiencia += 1;
        }
    }

    public int getLevel() {
        return this.level;
    }

    public void recebeXp(int xp) {
        if (xp < 0) {
            throw new IllegalArgumentException("Impossivel perder xp");
        }
        if (level == 20) {
            System.out.println("Level Maximo Atingido");
            return;
        }

        this.xp += xp;

        if (this.xp + xp >= XPLEVELUP[level]) {
            this.passouNivel();
        }
    }

    private void passouNivel() {
        this.level += 1;
        this.aumentarVida += 1;
        if (this.level % 4 == 0 || this.level == 19) {
            this.aumentarStatus += 1;
        }

        this.novoBonusProficiencia();

        if (this.xp >= XPLEVELUP[level]) {
            this.passouNivel();
        }

    }

    public ArrayList<HabilidadeAtiva> novoLevelHabilidadesAtivas() {

        ArrayList<HabilidadeAtiva> retorno = new ArrayList<>();
        // todo dando problema com o loop
        for (int x = 0; x < this.habilidadeAtivas.size(); x++) {

            HabilidadeAtiva comparar = this.habilidadeAtivas.get(x);

            if (comparar.getLevelLibera() <= this.level) {
                retorno.add(comparar);
            }

        }

        return retorno;
    }

    public ArrayList<Habilidade> novoLevelHabilidadesPassivas() {

        ArrayList<Habilidade> retorno = new ArrayList<>();
        int adicionadas=0;
        for (int x = 0; x < this.habilidadesPassivas.size(); x++) {

            Habilidade comparar = this.habilidadesPassivas.get(x);

            if (comparar.getLevelLibera() <= this.level) {
                retorno.add(comparar);
            }

        }

        return retorno;
    }

    public int xpProximoLevel() {
        if (level == 20) {
            return 0;
        }
        int xpProximo = this.XPLEVELUP[this.level] - this.xp;
        return xpProximo;
    }

    public int getNumLadosDados() {
        return numLadosDado;
    }

    public void aumentarVida(int dado, boolean padrao) {
        if (this.aumentarVida > 0) {
            if (padrao) {
                int vida = this.numLadosDado / 2;
                this.hpMax += vida;
            } else if (dado > this.numLadosDado || dado < 0) {
                throw new IllegalArgumentException("Dado maior/menor do que permitido no personagem");
            } else {
                this.hpMax += dado;
            }
        }
    }

    public void aumentarStatus(Status status, String status1) {
        if (this.aumentarStatus > 0) {
            switch (status1) {
                case "dex":
                    status.destrezaAlterar(2);
                    break;
                case "for":
                    status.forcaAlterar(2);
                    break;
                case "res":
                    status.resistenciaAlterar(2);
                    break;
                case "inte":
                    status.inteligenciaAlterar(2);
                    break;
                case "sabe":
                    status.sabedoriaAlterar(2);
                    break;
                case "cari":
                    status.carismaAlterar(2);
                    break;
            }

            this.aumentarStatus -= 1;
        } else {
            throw new IllegalArgumentException("Impossivel alterar status no momento");
        }

    }

    public void aumentarStatus(Status status, String status1, String status2) {
        if (this.aumentarStatus > 0) {
            switch (status1) {
                case "dex":
                    status.destrezaAlterar(1);
                    break;
                case "for":
                    status.forcaAlterar(1);
                    break;
                case "res":
                    status.resistenciaAlterar(1);
                    break;
                case "inte":
                    status.inteligenciaAlterar(1);
                    break;
                case "sabe":
                    status.sabedoriaAlterar(1);
                    break;
                case "cari":
                    status.carismaAlterar(1);
                    break;
            }
            switch (status2) {
                case "dex":
                    status.destrezaAlterar(1);
                    break;
                case "for":
                    status.forcaAlterar(1);
                    break;
                case "res":
                    status.resistenciaAlterar(1);
                    break;
                case "inte":
                    status.inteligenciaAlterar(1);
                    break;
                case "sabe":
                    status.sabedoriaAlterar(1);
                    break;
                case "cari":
                    status.carismaAlterar(1);
                    break;
            }

            this.aumentarStatus -= 1;
        } else {
            throw new IllegalArgumentException("Impossivel alterar status no momento");
        }

    }

    public void aumentarNumLadosDados(int aumenta) {
        this.numLadosDado += aumenta;
    }

    public int getDadosQuantidade() {
        return this.qtdDados;
    }

    public void aumentarDados(int aumenta) {
        this.qtdDados += aumenta;

    }

    public String getNomeRaca() {
        return this.nomeRaca;
    }

    public void morreu() {
        if (this.hpAtual > 0) {

            hpAtual = 0;
            this.vivo = false;

        } else {

            this.vivo = false;

        }
    }

    public void tomouDano(int dano) {
        if (this.hpAtual - dano <= 0) {
            System.out.println(this.nome + " morreu");
            morreu();
        } else {
            this.hpAtual -= dano;
        }
    }

    public void regenerarVida(int heal) {
        if (this.hpAtual + heal > hpMax) {
            hpAtual = hpMax;
        } else {
            hpAtual += heal;
        }
    }

    public int getMana() {
        return manaAtual;
    }

    public String getRaca() {
        return this.nomeRaca;
    }

    public void regeneraGastaMana(int mana) {

        if (this.manaAtual + mana > this.manaMax) {
            manaAtual = manaMax;
        }
        // considerando que podemos drenar a mana
        else if (manaAtual + mana > 0) {
            this.manaAtual += mana;
        } else if (this.manaAtual + mana < 0) {
            this.manaAtual = 0;
        }
    }

    public boolean estaVivo() {
        return this.vivo;
    }

}
