class ListaHabilidadesAtivas {
    private HabilidadeAtiva primeira;
    private HabilidadeAtiva ultima;
    private int qtd;
    private int ativadas;

    private void primeiraHabilidade(Object nome, Object descricao, int[] skillsBonusPts, int rodadasMaximas) {
        if (this.qtd == 0) {

            HabilidadeAtiva hab = new HabilidadeAtiva(nome, descricao, skillsBonusPts, rodadasMaximas);
            this.primeira = hab;
            this.ultima = hab;

        } else {

            HabilidadeAtiva hab = new HabilidadeAtiva(nome, descricao, skillsBonusPts, rodadasMaximas, primeira);
            this.primeira.setAnterior(hab);
            this.primeira = hab;

        }

        this.qtd++;
    }

    public void adiciona(Object nome, Object descricao, int[] skillsBonusPts, int rodadasMaximas) {
        if (this.qtd == 0) {

            this.primeiraHabilidade(nome, descricao, skillsBonusPts, rodadasMaximas);

        } else {

            HabilidadeAtiva hab = new HabilidadeAtiva(nome, descricao, skillsBonusPts, rodadasMaximas);
            this.ultima.setProxima(hab);
            hab.setAnterior(this.ultima);
            this.ultima = hab;
            this.qtd++;

        }
    }

    public boolean possuiAtivadas() {
        return this.ativadas > 0;
    }

    public Status proximaRodada(Status statusPersonagem, String nome) {
        HabilidadeAtiva atual = primeira;

        if (this.ativadas > 0) {

            while (atual != null) {
                if (atual.getNome().equals(nome) && atual.estaAtivada() && atual.excedeuRodadas()) {

                    statusPersonagem = atual.desativaHabilidade(statusPersonagem);
                    this.ativadas--;

                } else if (atual.getNome().equals(nome) && atual.estaAtivada()) {

                    atual.proximaRodada();

                }
            }
        }
        return statusPersonagem;
    }

    public Status ativaHabiliade(Status statusPersonagem, String nome) {
        HabilidadeAtiva atual = primeira;

        while (atual != null) {
            if (atual.getNome().equals(nome) && !atual.estaAtivada()) {
                this.ativadas++;
                return statusPersonagem = atual.ativaHabilidade(statusPersonagem);

            }
        }

        throw new IllegalArgumentException("Habilidade não encontrada");

    }
}
