
import java.io.Serializable;

public class Ficha implements Serializable {
    private final String nome;
    // private class classe;

    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;
    private float altura;
    private int idade;
    private String[] linguas;
    private Status statusPersonagem;
    private String nomeRaca;

    private ListaHabilidadePassivas habildiadesPassivas = new ListaHabilidadePassivas();
    private ListaHabilidadesAtivas listaHabilAtiva = new ListaHabilidadesAtivas();

    private ListaLog logPersonagem = new ListaLog();
    private final String racaPersonagem;

    // TODO
    // private listaItens bolsa = new listaItens();
    // private listaProficiencias proficiencia = new listaProficiencia();

    public Ficha(
            String nome, String classe, int hp, int manaMax, float altura, int idade, Status statusNovo, Raca raca) {

        this.nome = nome;
        this.manaMax = manaMax;
        this.manaAtual = manaMax;
        this.hpMax = hp;
        this.hpAtual = hp;
        this.statusPersonagem = statusNovo;
        this.altura = altura;
        this.idade = idade;

        this.racaPersonagem = raca.getNomeRaca();
        this.habildiadesPassivas = raca.getHabilidadesPassivasIniciais();
        this.listaHabilAtiva = raca.getHabilidadesAtivasRaca();

        this.statusPersonagem.carismaAlterar(raca.getBonusCarisma());
        this.statusPersonagem.forcaAlterar(raca.getBonusForca());
        this.statusPersonagem.sabedoriaAlterar(raca.getBonusSabedoria());
        this.statusPersonagem.destrezaAlterar(raca.getBonusDestreza());
        this.statusPersonagem.resistenciaAlterar(raca.getBonusResistencia());
        this.statusPersonagem.inteligenciaAlterar(raca.getBonusInteligencia());

    }

    public String getNomeRaca() {
        return this.nomeRaca;
    }

    public void tomouDano(int dano) {
        if (this.hpAtual - dano <= 0) {
            System.out.println(this.nome + " morreu");
            statusPersonagem.morreu();
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
        return this.racaPersonagem;
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
        return this.statusPersonagem.estaVivo();
    }

    public void novoLog(Object autor, Object receptor, Object acao, Object log) {

        this.logPersonagem.adiciona(log, log, log, acao, receptor);
    }

    public void mostrarLogPersonagem() {
        logPersonagem.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nome:").append(this.nome).append('\n').append(statusPersonagem.toString());
        return str.toString();
    }
}