package com.mendis.app.tcpserv;
import com.mendis.app.*;
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
      // Ficha fichaNova = new Ficha("Mithrandir", "Mago", , 0, 0, 0, null, null, 0, 0, null, null)

      coutputObject.writeObject(null);

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
