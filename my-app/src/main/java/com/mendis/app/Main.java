package com.mendis.app;
import com.mendis.app.ArmasItens.*;
import com.mendis.app.Classe.*;
import com.mendis.app.Habilidades.*;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        HabilidadesPassivasRepo hab = new HabilidadesPassivasRepo();
        Habilidade teste= hab.getHabilidade("Furia Persistente");
        System.out.println(teste.getNome());
        
    }
}
