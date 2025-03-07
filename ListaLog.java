public class listaLog {
    private log primeira;
    private log ultima;
    private int logsQtd;

    public void primeiroLog(Object autor, Object log, Object dia, Object acao, Object receptor) {
        if (this.logsQtd == 0) {
            log nova = new log(autor, log, dia, acao, receptor);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            log nova = new log(autor, log, dia, acao, receptor, primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.logsQtd++;
    }

    public void adiciona(Object nome, Object log, Object dia, Object acao, Object receptor) {
        if (this.logsQtd == 0) {
            this.primeiroLog(nome, log, dia, acao, receptor);
        } else {
            log nova = new log(nome, log, dia, acao, receptor);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.logsQtd++;
        }
    }
    /*
     * public boolean contem(Object elemento) {
     * log atual = this.primeira;
     * while (atual != null) {
     * if (atual.getElemento().equals(elemento)) {
     * return true;
     * }
     * atual = atual.getProxima();
     * }
     * return false;
     * }
     */

    public int tamanho() {
        return this.logsQtd;
    }

    private boolean posicaoOcupada(int posicao) {

        return posicao >= 0 && posicao < this.logsQtd;

    }

    private log pegaCelula(int posicao) {

        if (!this.posicaoOcupada(posicao)) {

            throw new IllegalArgumentException("Posição não existe");
        }
        log atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    public void removeDoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        this.primeira = this.primeira.getProxima();
        this.logsQtd--;

        if (this.logsQtd == 0) {
            this.ultima = null;
        }
    }

    public void removeDoFim() {
        if (!this.posicaoOcupada(this.logsQtd - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (this.logsQtd == 1) {
            this.removeDoComeco();
        } else {
            log penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.logsQtd--;
        }
    }

    public String toString() {

        if (this.logsQtd == 0) {
            return "Sem logs";
        }
        StringBuilder builder = new StringBuilder();
        log atual = primeira;
        int i;

        for (i = 0; i < this.logsQtd - 1; i++) {

            builder.append(i + 1 + "º -");
            builder.append(atual.getMensagem());
            builder.append('\n');
            atual = atual.getProxima();

        }

        builder.append(i + 1 + "º -");
        builder.append(atual.getMensagem());

        return builder.toString();

    }

}
