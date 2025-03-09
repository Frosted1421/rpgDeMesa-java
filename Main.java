
class Main {

    public static void main(String[] args) {
        Status status = new Status(1, 0, 8, 8, 8, 8, 8, 8, 2, 8);

        System.out.println(status.toString());
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
    }
}