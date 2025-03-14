import java.io.*;
import java.lang.*;
import java.net.*;

class client {

  DataInputStream cinput;
  PrintStream coutput;
  Socket clisoc;

  public client(String mensagem) {
    try {
      clisoc = new Socket("127.0.0.1", 4321);
      cinput = new DataInputStream(clisoc.getInputStream());
      coutput = new PrintStream(clisoc.getOutputStream());

      // System.out.println("Entre com uma Palavra : ");
      // String str = scan.next( );
      String str = mensagem;
      coutput.println(str);

      String str2 = cinput.readLine();
      System.out.println(str2);

    } catch (Exception e) {
      System.err.println(e);
    }

  }

  public static void main(String args[]) {
    new client(args[0]);
  }

}
