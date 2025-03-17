
public class Main {

    public static void main(String[] args) {
        // Status status = new Status(1, 0, 8, 8, 8, 8, 8, 8, 2, 8);

        // System.out.println(status.toString());
        /*
         * ----------------testes bobos---------------------------
         * LocalDate dia = LocalDate.now(); // Create a date object
         * System.out.println(dia); // Display the current date
         * LocalTime hora = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
         * System.out.println(hora);
         * String tempoTotal = dia.toString() + ' ' + hora.toString();
         * System.out.println(tempoTotal);
         * 
         * listaLog listinha = new listaLog();
         * 
         * listinha.adiciona("Saybao", "10 dano", "09/03/2025|09:12", "Atacou",
         * "Italo");
         * listinha.adiciona("Saybao", "10 dano", "09/03/2025|09:12", "Deu o butico",
         * "Grupo");
         * 
         * System.out.print(listinha.toString());
         */
        ListaHabilidadePassivas habi = new ListaHabilidadePassivas();
        habi.adiciona("Visão Noturna",
                "O personagem possui a habilidade de ver perfeitamente, mesmo que em ambientes escuros");
        // System.out.println(habi.toString());
        ListaHabilidadesAtivas habiAtiva = new ListaHabilidadesAtivas();
        int[] bonusStatus = { 0, 0, 0, 4, 4, 0 };
        habiAtiva.adiciona("Não Pasasaras", "Não deixa o inimigo passar", bonusStatus, 2);

        Status status1 = new Status(1, 0, 12, 12, 12, 12, 12, 12, 12, 12);
        Raca racaValar = new Raca("Valar", 10, 10, 10, 10, 10, 10, habi, habiAtiva);
        Ficha ficha = new Ficha("Mithrandir", "Mago", 200, 400, 1.9f, 40000, status1, racaValar);
        System.out.println(ficha.toString());
        System.out.println(habiAtiva.toString());
    }
}