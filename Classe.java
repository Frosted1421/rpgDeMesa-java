public class Classe {

    private final Atributos atributo;
    private final boolean isBarbaro;
    private final boolean isMago;
    private final boolean isHalfling;
    private final boolean isElfo;
    private final boolean isBardo;

    public Classe(Atributos novo) {
        this.atributo = novo;
        if (atributo instanceof Barbaro barbaro) {
            this.isBarbaro = true;
            this.isMago = false;
            this.isHalfling = false;
            this.isElfo = false;
            this.isBardo = false;
        } else {
            // todo - else somente pro java parar de encher o saco
            this.isBarbaro = false;
            this.isMago = false;
            this.isHalfling = false;
            this.isElfo = false;
            this.isBardo = false;
        }
    }

    // todo
    public void AtivarRaiva(Status status) {
        if (!isBarbaro) {
            throw new IllegalArgumentException("Impossivel ativar Rage, classe não é barbaro");
        } else {

        }
    }
}
