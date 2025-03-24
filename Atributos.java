public class Atributos {
    private String nome;
    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;
    private int altura;
    private int idade;
    private int pesoDoPersonagem;
    private int pesoMaximo;
    private int pesoAtual;

    private boolean vivo;
    private String[] linguas;
    private String nomeRaca;

    public Atributos(
            String nome, int hpMax, int slotsFeitiço, int altura, int idade, int pesoMaximo,
            int pesoAtualesoDoPersonagem, String[] linguas, String nomeRaca) {

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
