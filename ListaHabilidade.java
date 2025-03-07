class ListaHabilidade {
    private Habilidade primeira;
    private Habilidade ultima;
    private int qtd;

    public void primeiraHabilidade(Object nome, Object descricao) {
        if (this.qtd == 0) {
            Habilidade hab = new Habilidade(nome, descricao);
            this.primeira = hab;
            this.ultima = hab;
        } else {
            Habilidade hab = new Habilidade(nome, descricao, primeira);
            this.primeira.setAnterior(hab);
            this.primeira = hab;
        }
        this.qtd++;
    }

    public void adiciona(Object nome, Object descricao) {
        if (this.qtd == 0) {
            this.primeiraHabilidade(nome, descricao);
        } else {
            Habilidade hab = new Habilidade(nome, descricao);
            this.ultima.setProxima(hab);
            hab.setAnterior(this.ultima);
            this.ultima = hab;
            this.qtd++;
        }
    }

    public int tamanho() {
        return this.qtd;
    }

    public String toString() {
        if (this.qtd == 0) {
            return "Sem habilidades";
        }
        StringBuilder builder = new StringBuilder();
        Habilidade atual = primeira;
        int i = 1;

        while (atual != null) {
            builder.append(i).append("º - ").append(atual.getNome()).append(": ").append(atual.getDescricao());
            builder.append('\n');
            atual = atual.getProxima();
            i++;
        }

        return builder.toString();
    }
}
