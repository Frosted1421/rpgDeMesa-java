
import java.io.Serializable;

public class Ficha implements Serializable {

    // Nome, Level, xp, vida, mana (slots de feitiço), peso maximo e velocidade de
    // movimento
    private Atributos novo = new Barbaro(null, 0, 0, 0, 0, 0, null);
    // pontos de skill, alterados por habiolidaes ativas
    // todo: Feitiços aplicados como invisibilidade, boost de força, velocidade,
    // cegueira ou envenenamento
    private Status statusPersonagem;

    // listas de habilidades, ativas mudam skills points ou possuem rounds maximos
    // para ficarem ativos

    // passivas sempre estao ativadas
    private ListaHabilidadePassivas habildiadesPassivasPersonagem;
    private ListaHabilidadesAtivas listaHabilAtivaPersonagem;

    // armazena todas as açoes relacioandas ao personagem, criando um historico de
    // ações
    // futuramente sera utilizado para verificar se a ficha de um local esta
    // sincronizada com a ficha de outro.
    private ListaLog logPersonagem = new ListaLog();

    // Armazena os itens como ferramentas, itens de cura, munição e etc;
    private BolsaItens bolsaPersonagem;

    // Armazena as proeficiencias do personagem, como; linguas, ferramentas, armas,
    // armas marciais, armaduras, fraquezas e vantagens
    private Proficiencias proficienciasPersonagem;

    // TODO
    // private Classe classe;

    public Ficha(
            String nome, String classe, int manaMax, int altura, int idade, int pesoPersoangem,
            Status statusNovo, Raca raca, int qtdDados, int numFacesDado) {

        // aplico os bonus que a raça proporciona e descarto o objeto
        this.habildiadesPassivasPersonagem = raca.getHabilidadesPassivasIniciais();
        this.listaHabilAtivaPersonagem = raca.getHabilidadesAtivasRaca();
        this.statusPersonagem.carismaAlterar(raca.getBonusCarisma());
        this.statusPersonagem.forcaAlterar(raca.getBonusForca());
        this.statusPersonagem.sabedoriaAlterar(raca.getBonusSabedoria());
        this.statusPersonagem.destrezaAlterar(raca.getBonusDestreza());
        this.statusPersonagem.resistenciaAlterar(raca.getBonusResistencia());
        this.statusPersonagem.inteligenciaAlterar(raca.getBonusInteligencia());

        // this.atributos = new Atributos(nome, statusPersonagem.getForca(), manaMax,
        // altura, idade, pesoPersoangem,
        // raca.getLinguas(), raca.getNomeRaca(), qtdDados, numFacesDado);
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