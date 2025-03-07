public class habilidade {
    private Object nomeHabilidade;
    private Object descricaoHabilidade;
    private habilidade proxima;
    private habilidade anterior;

    public habilidade(Object nomeNovo, Object descricaoNova) {

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;

    }

    public habilidade(Object nomeNovo, Object descricaoNova, habilidade nova) {

        this.nomeHabilidade = nomeNovo;
        this.descricaoHabilidade = descricaoNova;
        this.proxima = proxima;

    }

    public void setAnterior(habilidade anterior) {
        this.anterior = anterior;
    }

    public void setProxima(habilidade proxima) {
        this.proxima = proxima;
    }

    public habilidade getProxima() {
        return this.proxima;
    }

    public Object getNome() {
        return nomeHabilidade;
    }

    public Object getDescricao() {
        return descricaoHabilidade;
    }
}
