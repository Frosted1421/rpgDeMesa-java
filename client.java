import java.io.*;
import java.lang.*;
import java.net.*;

class client {

  // DataInputStream cinput;
  PrintStream coutput;

  ObjectInputStream cinput;
  ObjectOutputStream coutputObject;

  Socket clisoc;

  public client() {
    try {
      clisoc = new Socket("127.0.0.1", 4321);
      coutputObject = new ObjectOutputStream(clisoc.getOutputStream());

      cinput = new ObjectInputStream(clisoc.getInputStream());
      /*
       * ListaHabilidadePassivas habi = new ListaHabilidadePassivas();
       * habi.adiciona("Visão Noturna",
       * "O personagem possui a habilidade de ver perfeitamente, mesmo que em ambientes escuros"
       * );
       * ListaHabilidadesAtivas habiAtiva = new ListaHabilidadesAtivas();
       * int[] bonusStatus = { 0, 0, 0, 4, 4, 0 };
       * habiAtiva.adiciona("Não Pasasaras", "Não deixa o inimigo passar",
       * bonusStatus, 2);
       * Status status1 = new Status(1, 0, 12, 12, 12, 12, 12, 12, 12, 12);
       * Raca racaValar = new Raca("Valar", 10, 10, 10, 10, 10, 10, habi, habiAtiva);
       * Ficha ficha = new Ficha("Mithrandir", "Mago", 200, 400, 1.9f, 40000, status1,
       * racaValar);
       */
      coutputObject.writeObject(ficha);

      String str2 = (String) cinput.readObject();
      System.out.println(str2);

    } catch (Exception e) {
      System.err.println(e);
    }

  }

  public static void main(String args[]) {
    new client();
  }

}
