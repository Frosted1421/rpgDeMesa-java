public class Ficha {
    private String nome;
    // private class classe;

    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;
    private float altura;
    private int idade;
    private String[] linguas;
    private Status statusPersonagem;
    private ListaHabilidade minhasHabilidades = new ListaHabilidade();
    private ListaLog logPersonagem = new ListaLog();
    private Raca racaPersonagem;
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
        this.minhasHabilidades = raca.getHabilidadesIniciais();

        this.statusPersonagem.carismaAlterar(raca.getBonusCarisma());
        this.statusPersonagem.forcaAlterar(raca.getBonusForca());
        this.statusPersonagem.sabedoriaAlterar(raca.getBonusSabedoria());
        this.statusPersonagem.destrezaAlterar(raca.getBonusDestreza());
        this.statusPersonagem.resistenciaAlterar(raca.getBonusResistencia());
        this.statusPersonagem.inteligenciaAlterar(raca.getBonusInteligencia());

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

    public void regeneraGastaMana(int mana) {

        if (this.manaAtual + mana > this.manaMax) {
            manaAtual = manaMax;
        }
        // considerando que podemos drenar a mana do inimigo
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
}