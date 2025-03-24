public class BolsaItens {
    /*
     * todas as bolsas possuem um peso maximo
     * 
     * algumas bolsas magicas podem armazenar uma quantidade extrema de items
     * com um peso fixo, podendo ter 90kg de itens dentro mas pesando apenas 6kg
     * 
     * 
     */

    private final int pesoBolsa;
    private int pesoAtualBolsa;
    private final int pesoMaximoBolsa;

    private final String nomeBolsa;
    private final String tipoBolsa;
    private final boolean pesoConstante;

    public BolsaItens(
            int pesoBolsa, int pesoMaximoBolsa, String nomeBolsa, String tipoBolsa, boolean pesoConstante) {
        this.pesoBolsa = pesoBolsa;
        this.pesoMaximoBolsa = pesoMaximoBolsa;
        this.nomeBolsa = nomeBolsa;
        this.tipoBolsa = tipoBolsa;
        this.pesoConstante = pesoConstante;

        this.pesoAtualBolsa = this.pesoConstante ? this.pesoBolsa : 0;
    }
}
