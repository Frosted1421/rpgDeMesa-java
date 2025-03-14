class Habilidade {

    private Habilidade proxima;
    private Habilidade anterior;

    private Object nomeHabilidade;
    private Object descricaoHabilidade;

    public Habilidade(Object nomeNovo, Object descricaoNova) {

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public Habilidade(Object nomeNovo, Object descricaoNova, Habilidade nova) {
        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = nova;

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
