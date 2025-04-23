import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException {
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
                 * 
                 * 
                 *
                 * ListaHabilidadePassivas habi = new ListaHabilidadePassivas();
                 * habi.adiciona("Visão Noturna",
                 * "O personagem possui a habilidade de ver perfeitamente, mesmo que em ambientes escuros"
                 * );
                 * ListaHabilidadesAtivas habiAtiva = new ListaHabilidadesAtivas();
                 * int[] bonusStatus = { 0, 0, 0, 4, 4, 0 };
                 * habiAtiva.adiciona("Não Pasasaras", "Não deixa o inimigo passar",
                 * bonusStatus, 2);
                 * 
                 * Status status1 = new Status(1, 0, 12, 12, 12, 12, 12, 12, 12, 12);
                 * Raca racaValar = new Raca("Valar", 10, 10, 10, 10, 10, 10, habi, habiAtiva);
                 * Ficha ficha = new Ficha(
                 * "Mithrandir", "Mago", 200, 400, 190, 40000, status1, racaValar);
                 * System.out.println(ficha.toString());
                 * 
                 * ArmaBranca arma = new ArmaBranca("Claymore", "Espadao",
                 * 1, 7, 8, 1, "cortante", false, false, false, false, false, false, false,
                 * true);
                 * System.out.println(arma.maosEquipadas());
                 * arma.trocaMao();
                 * System.out.println(arma.maosEquipadas());
                 
                Atributos novoAtributo = new Barbaro("Mac", 1, 3, 2, 3, 1, "Barbaro");

                if (novoAtributo instanceof Barbaro barbaro) {
                        System.out.println(barbaro.getLevel());
                        barbaro.recebeXp(1000);

                        System.out.println(barbaro.getLevel());

                        System.out.println(barbaro.getBonusProficiencia());
                }
                
                ListaLog listinha = new ListaLog();

                for(int x=1;x<=10;x++){
                        String nsei=String.valueOf(x);
                        log loginho = new log(nsei,nsei,nsei,nsei,nsei);       
                        listinha.adiciona(loginho);
                }
                System.out.println(listinha.toString());
                listinha.ultimosDez();
                */
        }
         

}