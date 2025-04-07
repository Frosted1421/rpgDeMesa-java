
import java.io.Serializable;
import java.util.ArrayList;

public class Ficha implements Serializable {

    private Status statusPersonagem;

    private ListaHabilidadePassivas habilidadesPassivasPersonagem;
    private ListaHabilidadesAtivas habilidadesAtivasPersonagem;

    private ListaLog logPersonagem = new ListaLog();

    private BolsaItens bolsaPersonagem;

    private Proficiencias proficienciasPersonagem;

    private Classe classe;

    private int level = 1;

    public Ficha(
            String nome, String classe, int manaMax, int altura, int idade, int pesoPersoangem,
            Status statusNovo, Raca raca, int qtdDados, int numFacesDado, Atributos recebeClasse) {

        this.classe = new Classe(recebeClasse);

        this.habilidadesPassivasPersonagem = raca.getHabilidadesPassivasIniciais();
        this.habilidadesAtivasPersonagem = raca.getHabilidadesAtivasRaca();
        this.statusPersonagem.carismaAlterar(raca.getBonusCarisma());
        this.statusPersonagem.forcaAlterar(raca.getBonusForca());
        this.statusPersonagem.sabedoriaAlterar(raca.getBonusSabedoria());
        this.statusPersonagem.destrezaAlterar(raca.getBonusDestreza());
        this.statusPersonagem.resistenciaAlterar(raca.getBonusResistencia());
        this.statusPersonagem.inteligenciaAlterar(raca.getBonusInteligencia());

        // this.atributos = new Atributos(nome, statusPersonagem.getForca(), manaMax,
        // altura, idade, pesoPersoangem,raca.getLinguas(), raca.getNomeRaca(),
        // qtdDados, numFacesDado);
    }

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
    public void novoLog(Object autor, Object receptor, Object acao, Object log) {

        this.logPersonagem.adiciona(log, log, log, acao, receptor);
    }

    public String mostrarLogPersonagem() {
        return logPersonagem.toString();
    }

}