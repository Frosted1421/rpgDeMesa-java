import java.io.*;
import java.net.*;

public class serv {
   int pt;
   ServerSocket ssocket;
   String lercaixa;
   PrintStream soutput;
   DataInputStream sinput;
   Socket csk, clisoket;

   public serv() {
      pt = 4321;
      try // Excecao
      {
         ssocket = new ServerSocket(pt);

      } catch (Exception e) {
         System.err.println(e.getMessage());
         System.exit(0);
      }
      System.out.println("Servidor Ativo ..... ");

      try {
         while (true) {
            clisoket = ssocket.accept();
            csk = clisoket;
            soutput = new PrintStream(csk.getOutputStream());
            sinput = new DataInputStream(csk.getInputStream());

            boolean flag = false;

            String men = sinput.readLine();
            System.out.println("Cliente Enviou : " + men);
            if (!men.isEmpty()) {
               System.out.println("Servidor recebeu:" + men);
            }

         }

      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }

   public static void main(String args[]) {
      new serv();
   }

}
