import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class main {
    public static void main(String[] args) {
        LocalDate dia = LocalDate.now(); 
        System.out.println(dia);
        LocalTime hora = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println(hora);
        String tempoTotal = dia.toString() + ' ' + hora.toString();
        System.out.println(tempoTotal);
        /*
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