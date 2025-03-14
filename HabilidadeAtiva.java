public class HabilidadeAtiva {

    private HabilidadeAtiva proxima;
    private HabilidadeAtiva anterior;

    private Object nomeHabilidade;
    private Object descricaoHabilidade;

    private int rodadasMaximas;
    private int rodadaContador = 0;
    private Boolean ativa = false;

    private int[] skillsBonusPts = {
            0, // forca
            0, // destreza
            0, // resistencia
            0, // inteligencia
            0, // sabedoria
            0 // carisma
    };

    public boolean excedeuRodadas() {
        return this.rodadaContador >= this.rodadasMaximas;
    }

    public boolean estaAtivada() {
        return this.ativa;
    }

    public HabilidadeAtiva(
            Object nomeNovo, Object descricaoNova, int[] skillsPontos, int rodadasMaximas) {

        if (skillsPontos.length != 6) {
            throw new IllegalArgumentException("Habilidades erradas");

        }
        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public HabilidadeAtiva(
            Object nomeNovo, Object descricaoNova, int[] skillsPontos, int rodadasMaximas, HabilidadeAtiva nova) {

        if (skillsPontos.length != 6 || rodadasMaximas < 0) {
            throw new IllegalArgumentException("Habilidades erradas");
        }

        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = nova;

    }

    public Status ativaHabilidade(Status recebido) {

        Status ativado = recebido;
        this.ativa = true;
        this.rodadaContador = 1;

        recebido.forcaAlterar(skillsBonusPts[0]);
        recebido.destrezaAlterar(skillsBonusPts[1]);
        recebido.resistenciaAlterar(skillsBonusPts[2]);
        recebido.inteligenciaAlterar(skillsBonusPts[3]);
        recebido.sabedoriaAlterar(skillsBonusPts[4]);
        recebido.carismaAlterar(skillsBonusPts[5]);

        return ativado;
    }

    public Status desativaHabilidade(Status recebido) {

        if (estaAtivada()) {
            throw new IllegalArgumentException("HabilidadeAtiva ja desativada");

        }
        if (excedeuRodadas()) {

            this.rodadaContador = 0;
            this.ativa = false;

            recebido.forcaAlterar(-1 * skillsBonusPts[0]);
            recebido.destrezaAlterar(-1 * skillsBonusPts[1]);
            recebido.resistenciaAlterar(-1 * skillsBonusPts[2]);
            recebido.inteligenciaAlterar(-1 * skillsBonusPts[3]);
            recebido.sabedoriaAlterar(-1 * skillsBonusPts[4]);
            recebido.carismaAlterar(-1 * skillsBonusPts[5]);

        } else {
            throw new IllegalArgumentException("HabilidadeAtiva não execeu a quantidade de rodadas ativadas");
        }

        return recebido;
    }

    public void proximaRodada() {

        this.rodadaContador++;
    }

    public void setAnterior(HabilidadeAtiva anterior) {
        this.anterior = anterior;
    }

    public void setProxima(HabilidadeAtiva proxima) {
        this.proxima = proxima;
    }

    public HabilidadeAtiva getProxima() {
        return this.proxima;
    }

    public Object getNome() {
        return nomeHabilidade;
    }

    public Object getDescricao() {
        return descricaoHabilidade;
    }
}
