
import java.io.Serializable;

public class Ficha implements Serializable {
    private final String nome;
    // private class classe;

    private Atributos atributos;
    private Status statusPersonagem;
    private ListaHabilidadePassivas habildiadesPassivas;
    private ListaHabilidadesAtivas listaHabilAtiva;

    private ListaLog logPersonagem = new ListaLog();

    // TODO
    // private listaItens bolsa = new listaItens();
    // private listaProficiencias proficiencia = new listaProficiencia();

    public Ficha(
            String nome, String classe, int hp, int manaMax, int altura, int idade, int pesoPersoangem,
            Status statusNovo,
            Raca raca) {
        this.nome = nome;

        this.habildiadesPassivas = raca.getHabilidadesPassivasIniciais();
        this.listaHabilAtiva = raca.getHabilidadesAtivasRaca();

        this.statusPersonagem.carismaAlterar(raca.getBonusCarisma());
        this.statusPersonagem.forcaAlterar(raca.getBonusForca());
        this.statusPersonagem.sabedoriaAlterar(raca.getBonusSabedoria());
        this.statusPersonagem.destrezaAlterar(raca.getBonusDestreza());
        this.statusPersonagem.resistenciaAlterar(raca.getBonusResistencia());
        this.statusPersonagem.inteligenciaAlterar(raca.getBonusInteligencia());

        int pesoMaximo = this.statusPersonagem.getForca() * 15;

        this.atributos = new Atributos(nome, hp, manaMax, altura, idade, pesoMaximo, pesoPersoangem, raca.getLinguas(),
                raca.getNomeRaca());
    }

    // todo
    // enviar ao log a cada açao
    public void novoLog(Object autor, Object receptor, Object acao, Object log) {

        this.logPersonagem.adiciona(log, log, log, acao, receptor);
    }

    public String mostrarLogPersonagem() {
        return logPersonagem.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nome:").append(this.nome).append('\n').append(statusPersonagem.toString());
        return str.toString();
    }
}