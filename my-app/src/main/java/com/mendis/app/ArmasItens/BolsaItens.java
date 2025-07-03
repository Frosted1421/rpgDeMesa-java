package com.mendis.app.ArmasItens;
public class BolsaItens {
    /*
     * todas as bolsas possuem um peso maximo
     * 
     * algumas bolsas magicas podem armazenar uma quantidade extrema de items
     * com um peso fixo, podendo ter 90kg de itens dentro mas pesando apenas 6kg
     * 
     */
    
    //todo lista duplamente ligada
    private int pesoAtualBolsa;
    private final int pesoBolsa;
    private final int pesoMaximoBolsa;

    private final String nomeBolsa;
    private final String tipoBolsa;
    private final boolean pesoConstante;

    private Item primeiro;
    private Item ultimo;
    private int qtd;

    public BolsaItens(
            int pesoBolsa, int pesoMaximoBolsa, String nomeBolsa, String tipoBolsa, boolean pesoConstante) {

        this.pesoBolsa = pesoBolsa;
        this.pesoMaximoBolsa = pesoMaximoBolsa;
        this.nomeBolsa = nomeBolsa;
        this.tipoBolsa = tipoBolsa;
        this.pesoConstante = pesoConstante;

        this.pesoAtualBolsa = this.pesoConstante ? this.pesoBolsa : 0;

    }

    private void primeiroItem(Item novoItem) {
        if (this.qtd == 0) {
            this.primeiro = novoItem;
            this.ultimo = novoItem;
            this.pesoAtualBolsa += novoItem.getPesoTotal();
        } else {
            this.primeiro.setAnterior(novoItem);
            this.ultimo = novoItem;
            this.pesoAtualBolsa += novoItem.getPesoTotal();
        }
        this.qtd++;

    }

    public void adiciona(Item novoItem) {
        if (this.pesoAtualBolsa + novoItem.getPesoTotal() > this.pesoMaximoBolsa) {

            throw new IllegalArgumentException("Tentnado adicionar mais peso do que a bolsa aguenta");

        } else {
            if (this.qtd == 0) {
                primeiroItem(novoItem);
            } else {
                this.ultimo.setProxima(novoItem);
                novoItem.setAnterior(this.ultimo);
                this.ultimo = novoItem;
                this.pesoAtualBolsa += novoItem.getPesoTotal();

                this.qtd++;
            }
        }
    }

    public int getPeso() {
        if (pesoConstante) {
            return this.pesoBolsa;
        } else {
            return this.pesoAtualBolsa;
        }
    }

    public String getNomeBolsa() {
        return this.nomeBolsa;
    }

    public String getTipoBolsa() {
        return this.tipoBolsa;
    }

    @Override
    public String toString() {
        StringBuilder bolsa = new StringBuilder();
        bolsa.append("Nome da Bolsa:").append(this.nomeBolsa).append(" Tipo de bolsa:").append(this.tipoBolsa)
                .append("\nPeso maximo da bolsa:").append(this.pesoMaximoBolsa).append("lb \nPeso atual da bolsa:")
                .append(pesoAtualBolsa)
                .append("Peso da Bolsa:").append(pesoBolsa)
                .append(pesoConstante ? "A bolsa possui um peso constante" : "A bolsa não possui um peso constante");
        return bolsa.toString();
    }
}
