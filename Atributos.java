public class Atributos {
    private String nome;
    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;

    private int qtdDados;
    private int numLadosDado;
    private int level;

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

    public Atributos(
            String nome, int forca, int slotsFeitiço, int altura, int idade,
            int pesoAtualDoPersonagem, String nomeRaca, int qtdDados, int numLadosDado) {

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

    // todo
    private void passouNivel() {
        level++;
        this.novoBonusProficiencia();

    }

    public int xpProximoLevel() {
        if (level == 20) {
            return 0;
        }
        int xpProximo = this.XPLEVELUP[this.level] - this.xp;
        return xpProximo;
    }

    public int numLadosDados() {
        return numLadosDado;
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
