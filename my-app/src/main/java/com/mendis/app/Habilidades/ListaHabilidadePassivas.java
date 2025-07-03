package com.mendis.app.Habilidades;

import java.io.Serializable;

public class ListaHabilidadePassivas implements Serializable {
    private Habilidade primeira;
    private Habilidade ultima;
    private int qtd;

    public void primeiraHabilidade(Habilidade hab) {
        if (this.qtd == 0) {
            this.primeira = hab;
            this.ultima = hab;
        } else {
            this.primeira.setAnterior(hab);
            this.primeira = hab;
        }
        this.qtd++;
    }

    public void adiciona(Habilidade hab) {
        if (this.qtd == 0) {

            this.primeiraHabilidade(hab);

        } else {

            this.ultima.setProxima(hab);
            hab.setAnterior(this.ultima);
            this.ultima = hab;
            this.qtd++;

        }
    }

    public int quantidadedHabilidades() {
        return this.qtd;
    }

    public String toString() {
        if (this.qtd == 0) {
            return "Sem habilidades";
        }
        StringBuilder builder = new StringBuilder();
        Habilidade atual = primeira;

        while (atual != null) {
            builder.append("Habilidade:").append(atual.getNome()).append('\n')
                    .append("Descrição: ").append(atual.getDescricao());
            builder.append('\n').append('\n');
            atual = atual.getProxima();
        }

        return builder.toString();
    }
}
