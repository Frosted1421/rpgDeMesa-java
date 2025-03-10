public class Habilidade {

    private Habilidade proxima;
    private Habilidade anterior;

    private Object nomeHabilidade;
    private Object descricaoHabilidade;
    private int rodadasMaximas;
    private int rodadaContador = 0;
    private boolean ativa = false;
    private boolean precisaAtivacao;

    private int[] skillsBonusPts = {
            0, // forca
            0, // destreza
            0, // resistencia
            0, // inteligencia
            0, // sabedoria
            0 // carisma
    };

    public Habilidade(Object nomeNovo, Object descricaoNova) {

        this.precisaAtivacao = false;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public Habilidade(Object nomeNovo, Object descricaoNova, Habilidade nova) {
        this.precisaAtivacao = false;
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = proxima;

    }

    public Habilidade(Object nomeNovo, Object descricaoNova, int[] skillsPontos, int rodadasMaximas) {
        if (skillsPontos.length != 6) {
            throw new IllegalArgumentException("Habilidades erradas");
        }
        this.precisaAtivacao = true;

        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public Habilidade(Object nomeNovo, Object descricaoNova, int[] skillsPontos, int rodadasMaximas, Habilidade nova) {
        if (skillsPontos.length != 6) {
            throw new IllegalArgumentException("Habilidades erradas");
        }
        this.precisaAtivacao = true;

        this.rodadasMaximas = rodadasMaximas;
        this.skillsBonusPts = skillsPontos;

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = proxima;

    }

    public Status ativaHabilidade(Status recebido) {
        if (precisaAtivacao == false) {
            throw new IllegalArgumentException("Habilidade não precisa de ativação");
        }

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
        if (precisaAtivacao == false) {
            throw new IllegalArgumentException("Habilidade não precisa de desativação");
        }
        if (ativa == false) {
            throw new IllegalArgumentException("Habilidade ja desativada");

        }
        if (this.rodadaContador >= this.rodadasMaximas) {

            this.rodadaContador = 0;

            recebido.forcaAlterar(-1 * skillsBonusPts[0]);
            recebido.destrezaAlterar(-1 * skillsBonusPts[1]);
            recebido.resistenciaAlterar(-1 * skillsBonusPts[2]);
            recebido.inteligenciaAlterar(-1 * skillsBonusPts[3]);
            recebido.sabedoriaAlterar(-1 * skillsBonusPts[4]);
            recebido.carismaAlterar(-1 * skillsBonusPts[5]);

            this.ativa = false;

        } else {
            throw new IllegalArgumentException("Habilidade não execeu a quantidade de rodadas ativadas");
        }

        return recebido;
    }

    public Status proximaRodada(Status checaHabilidade) {
        if (rodadaContador >= rodadasMaximas && precisaAtivacao) {
            desativaHabilidade(checaHabilidade);
            return checaHabilidade;
        } else {
            rodadaContador++;
            return checaHabilidade;
        }
    }

    public boolean getPrecisaAtivacao() {
        return precisaAtivacao;
    }

    public void setAnterior(Habilidade anterior) {
        this.anterior = anterior;
    }

    public void setProxima(Habilidade proxima) {
        this.proxima = proxima;
    }

    public Habilidade getProxima() {
        return this.proxima;
    }

    public Object getNome() {
        return nomeHabilidade;
    }

    public Object getDescricao() {
        return descricaoHabilidade;
    }
}
