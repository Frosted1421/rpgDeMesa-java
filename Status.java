
class Status {
    private int dadosMaximos;
    private int numeroDeLadosDado;
    private int level;
    private int xp;

    private final int[] XPLEVELUP = {
            0, 300, 900, 2700, 6500, 14000, 23000, 34000, 48000,
            64000, 85000, 10000, 120000, 140000, 165000, 195000, 225000, 265000, 305000,
            355000
    };

    private int forca;
    private int destreza;
    private int resistencia;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    // private boolean rage = false;
    private boolean vivo = true;

    public Status(
            int level, int xp, int forca, int destreza, int resistencia, int inteligencia, int sabedoria,
            int carisma, int dadosMaximos, int numeroDeLadosDado) {
        this.level = level;
        this.xp = xp;
        this.forca = forca;
        this.destreza = destreza;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.dadosMaximos = dadosMaximos;
        this.numeroDeLadosDado = numeroDeLadosDado;
    }

    public void recebeXp(int xp) {
        if (xp < 0) {
            throw new IllegalArgumentException("Impossivel perder xp");
        }
        if (level == 20) {
            System.out.println("Level Maximo Atingido");
            return;
        }

        this.xp += xp;

        if (this.xp + xp >= XPLEVELUP[level]) {
            level++;
        }
    }

    public void morreu() {
        this.vivo = false;
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public void resistenciaAlterar(int qtd) {
        if (this.resistencia + qtd > 20) {
            this.resistencia = 20;
        } else if (this.resistencia + qtd < 0) {
            this.resistencia = 0;
        } else {
            this.resistencia += qtd;
        }
    }

    public void sabedoriaAlterar(int qtd) {
        if (this.sabedoria + qtd > 20) {
            this.sabedoria = 20;
        } else if (this.sabedoria + qtd < 0) {
            this.sabedoria = 0;
        } else {
            this.sabedoria += qtd;
        }
    }

    public int getResitencia() {
        return this.resistencia;
    }

    public void inteligenciaAlterar(int qtd) {
        if (this.inteligencia + qtd > 20) {
            this.inteligencia = 20;
        } else if (this.inteligencia + qtd < 0) {
            this.inteligencia = 0;
        } else {
            this.inteligencia += qtd;
        }
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void carismaAlterar(int qtd) {
        if (this.carisma + qtd > 20) {
            this.carisma = 20;
        } else if (this.carisma + qtd < 0) {
            this.carisma = 0;
        } else {
            this.carisma += qtd;
        }
    }

    public int getCarisma() {
        return this.carisma;
    }

    public void forcaAlterar(int qtd) {
        if (this.forca + qtd > 20) {
            this.forca = 20;
        } else if (this.forca + qtd < 0) {
            this.forca = 0;
        } else {
            this.forca += qtd;
        }
    }

    public int getForca() {
        return this.forca;
    }

    public void destrezaAlterar(int qtd) {
        if (this.destreza + qtd > 20) {
            this.destreza = 20;
        } else if (this.destreza + qtd < 0) {
            this.destreza = 0;
        } else {
            this.destreza += qtd;
        }
    }

    public int getDestreza() {
        return this.destreza;
    }

    public int xpProximoLevel() {
        if (level == 20) {
            return 0;
        }
        int xpProximo = this.XPLEVELUP[this.level] - this.xp;
        return xpProximo;
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(
                "Level:" + level + " XP:" + xp + '\n'
                        + "XP para o proximo level:" + xpProximoLevel() + '\n'
                        + "Dados:" + dadosMaximos + "Faces:" + numeroDeLadosDado + '\n'
                        + "Pontos de Habilidade:" + "\n"
                        + "- Sabedoria:" + sabedoria + '\n'
                        + "- Forca:" + forca + '\n'
                        + "- Inteligencia:" + inteligencia + '\n'
                        + "- Destreza:" + destreza + '\n'
                        + "- Carisma:" + carisma + '\n'
                        + "- Resistencia:" + resistencia + '\n' + '\n' + '\n'
                        + "Personagem Vivo:" + (vivo ? "sim" : "nao")

        );
        return builder.toString();
    }

}
