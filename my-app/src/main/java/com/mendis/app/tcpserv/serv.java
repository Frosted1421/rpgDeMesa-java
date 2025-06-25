package com.mendis.app.tcpserv;
import com.mendis.app.*;
import java.io.*;
import java.net.*;

public class serv {
   int pt;
   ServerSocket ssocket;
   String lercaixa;
   PrintStream soutput;

   // DataInputStream sinput;
   Socket csk, clisoket;

   ObjectOutputStream soutputObject;
   ObjectInputStream sinput;

   public serv() {
      pt = 4321;
      // Excecao
      try 
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

            soutputObject = new ObjectOutputStream(csk.getOutputStream());
            sinput = new ObjectInputStream(csk.getInputStream());
            boolean flag = false;

            Ficha novaFicha = (Ficha) sinput.readObject();

            if (novaFicha != null) {
               System.out.println(novaFicha.toString());
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
