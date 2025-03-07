class raca {
    private String raca;
    private int bonusForca;
    private int bonusDestreza;
    private int bonusResistencia;
    private int bonusInteligencia;
    private int bonusSabedoria;
    private int bonusCarisma;
    ListaHabilidade listaHabilRaca = new ListaHabilidade();

    public raca(
            String nome, int bonusF, int bonusD, int bonusR, int bonusS, int bonusC, int bonusI,
            ListaHabilidade listaInicial) {
        this.raca = nome;
        this.bonusForca = bonusF;
        this.bonusDestreza = bonusD;
        this.bonusResistencia = bonusR;
        this.bonusInteligencia = bonusI;
        this.bonusSabedoria = bonusS;
        this.bonusCarisma = bonusC;
        this.listaHabilRaca = listaInicial;

    }
}
