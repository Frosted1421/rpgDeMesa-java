package com.mendis.app.Habilidades;
import com.mendis.app.*;
import java.io.Serializable;

public class ListaHabilidadesAtivas implements Serializable {
    private HabilidadeAtiva primeira;
    private HabilidadeAtiva ultima;
    private int qtd;
    private int ativadas;

    private void primeiraHabilidade(HabilidadeAtiva hab) {
        if (this.qtd == 0) {

            this.primeira = hab;
            this.ultima = hab;

        } else {

            this.primeira.setAnterior(hab);
            this.primeira = hab;

        }

        this.qtd++;
    }

    public void adiciona(HabilidadeAtiva hab) {
        if (this.qtd == 0) {

            this.primeiraHabilidade(hab);

        } else {

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

    public void prorrogaHabilidade(String nome) {
        HabilidadeAtiva atual = primeira;
        while (atual != null) {
            if (atual.getNome().equals(nome) && !atual.estaAtivada()) {
                primeira.prorrogaHabilidade();
            }
        }
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

    public Status ativaHabiliade(Status statusPersonagem, String nome, int rodadasMaximas) {

        HabilidadeAtiva atual = primeira;

        while (atual != null) {
            if (atual.getNome().equals(nome) && !atual.estaAtivada()) {

                this.ativadas++;
                return statusPersonagem = atual.ativaHabilidade(statusPersonagem, rodadasMaximas);

            }
        }

        throw new IllegalArgumentException("Habilidade não encontrada");

    }

    /*
     * private int[] skillsBonusPts = {
     * 0, // forca
     * 0, // destreza
     * 0, // resistencia
     * 0, // inteligencia
     * 0, // sabedoria
     * 0 // carisma
     * };
     * 
     */

    @Override
    public String toString() {

        StringBuilder ativasToString = new StringBuilder();
        ativasToString.append("Habiliades Ativas:").append(this.qtd).append('\n')
                .append("Habiliades Ativadas:").append(this.ativadas).append('\n').append('\n');

        HabilidadeAtiva atual = primeira;
        int i;
        ativasToString.append("Habilidades do personagem:").append('\n');
        for (i = 0; i < this.qtd - 1; i++) {
            int statusbonus[] = atual.getSkillBonusPts();

            ativasToString.append("Nome:").append(atual.getNome()).append('\n')
                    .append("Descrição:").append(atual.getDescricao()).append('\n')
                    .append("Bonus de skills:").append('\n')
                    .append("Força:").append(statusbonus[0]).append(" - Destreza:").append(statusbonus[1])
                    .append(" - Resistencia:").append(statusbonus[2]).append("Inteligencia:").append(statusbonus[3])
                    .append(" - Sabedoria:").append(statusbonus[4]).append(" - Carisma:").append(statusbonus[5])
                    .append('\n');
            atual = atual.getProxima();

        }

        int statusbonus[] = atual.getSkillBonusPts();

        ativasToString.append("Nome:").append(atual.getNome()).append('\n')
                .append("Descrição:").append(atual.getDescricao()).append('\n')
                .append("Bonus de skills:").append('\n')
                .append("Força:").append(statusbonus[0]).append(" - Destreza:").append(statusbonus[1])
                .append(" - Resistencia:").append(statusbonus[2]).append(" - Inteligencia:").append(statusbonus[3])
                .append(" - Sabedoria:").append(statusbonus[4]).append(" - Carisma:").append(statusbonus[5])
                .append('\n');

        return ativasToString.toString();
    }
}
