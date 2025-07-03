package com.mendis.app;
import java.io.Serializable;

public class ListaLog implements Serializable {
    private log primeira;
    private log ultima;
    private int logsQtd;

    // todo filtrar logs

    public void primeiroLog(log nova) {
        if (this.logsQtd == 0) {
            this.primeira = nova;
            this.ultima = nova;
        } else {
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.logsQtd++;
    }

    public void adiciona(log nova) {
        if (this.logsQtd == 0) {
            this.primeiroLog(nova);
        } else {
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.logsQtd++;
        }
    }

    public int tamanho() {
        return this.logsQtd;
    }


    private log pegaCelula() {

        if (this.logsQtd == 0) {

            throw new IllegalArgumentException("Não existe logs");
        } else {
            return this.ultima;
        }
    }

    public ListaLog ultimosDez() {
        ListaLog retorno = new ListaLog();

        if (logsQtd> 0) {
            log anterior = new log(ultima);
            int cont = 0;
            int maximo = 9;
            if (logsQtd < 10) {
                maximo = logsQtd;
            }
            retorno.adiciona(anterior);
            while (anterior.getAnterior() != null && cont < maximo) {
                log controle = new log(anterior.getAnterior());
                retorno.adiciona(controle);
                anterior = new log(anterior.getAnterior());
                cont++;
            }
        }
        System.out.println(retorno.toString());
        return retorno;
    }

    @Override
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
