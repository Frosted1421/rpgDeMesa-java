package com.mendis.app.ArmasItens;

class Item {
    private Item proxima;
    private Item anterior;

    private final int pesoUnitario;
    private int pesoTotal;
    private int valorUnitario;

    private int qtd;
    private final int hpRestaurada;

    private final String nomeItem;
    private final String tipoItem;
    private final String descricaoItem;


    private final boolean itemVida;
    private final boolean municao;

    public Item(
            int peso, int valor, int qtd, int hpRestaurada, String nomeItem,
            String tipoItem, String descricaoItem, boolean municao, boolean itemVida, Item proxima) {
            
        this.pesoUnitario = peso;
        this.qtd = qtd;
        this.pesoTotal = this.pesoUnitario * this.qtd;
        this.valorUnitario = valor;

        this.nomeItem = nomeItem;
        this.tipoItem = tipoItem;
        this.descricaoItem = descricaoItem;

        this.municao = municao;

        this.itemVida = itemVida;
        this.hpRestaurada = itemVida ? hpRestaurada : 0;
        this.proxima = proxima;
    }

    public Item(
            int peso, int valor, int qtd, int hpRestaurada, String nomeItem,
            String tipoItem, String descricaoItem, boolean municao, boolean itemVida) {

        this.pesoUnitario = peso;
        this.qtd = qtd;
        this.pesoTotal = this.pesoUnitario * this.qtd;
        this.valorUnitario = valor;

        this.nomeItem = nomeItem;
        this.tipoItem = tipoItem;
        this.descricaoItem = descricaoItem;

        this.municao = municao;

        this.itemVida = itemVida;
        this.hpRestaurada = itemVida ? hpRestaurada : 0;
    }

    public boolean itemVida() {
        return this.itemVida;
    }
    public int getValor(){
        return this.valorUnitario;
    }
    public int getHp() {
        if (!itemVida()) {
            throw new IllegalArgumentException("Este item não pode ser usado para restaurar hp");
        } else {
            return this.hpRestaurada;
        }
    }

    public void usarItem(int quantidadeUtilizada) {
        if (this.qtd < quantidadeUtilizada) {
            throw new IllegalArgumentException("Impossivel utilizar uma quantidade maior do que a disponivel");
        } else {
            this.qtd -= quantidadeUtilizada;
        }

    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    public String getNome() {
        return this.nomeItem;
    }

    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public int getQuantidade() {
        return this.qtd;
    }

    public String getTipoItem() {
        return this.tipoItem;
    }

    public void setAnterior(Item anterior) {
        this.anterior = anterior;
    }
    public boolean getIsMunicao(){
        return municao;
    }
    public void setProxima(Item proxima) {
        this.proxima = proxima;
    }

    public Item getProxima() {
        return this.proxima;
    }
   
    public void utilizou(int quantidade) {
        if (this.qtd >= 0 && qtd - quantidade >= 0) {
            this.qtd -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente");
        }

    }
}
