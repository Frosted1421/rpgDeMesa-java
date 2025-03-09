class Raca {
    private String raca;
    private int bonusForca;
    private int bonusDestreza;
    private int bonusResistencia;
    private int bonusInteligencia;
    private int bonusSabedoria;
    private int bonusCarisma;
    ListaHabilidade listaHabilRaca = new ListaHabilidade();

    public Raca(
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

    public ListaHabilidade getHabilidadesIniciais() {
        return listaHabilRaca;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public int getBonusDestreza() {
        return bonusDestreza;
    }

    public int getBonusCarisma() {
        return bonusCarisma;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public int getBonusSabedoria() {
        return bonusSabedoria;
    }

    public int getBonusResistencia() {
        return bonusResistencia;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(
                "");
        return builder.toString();

    }
}
