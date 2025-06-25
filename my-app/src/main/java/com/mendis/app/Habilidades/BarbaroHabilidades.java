package com.mendis.app.Habilidades;
import java.lang.reflect.Array;
import java.util.ArrayList;

import com.mendis.app.*;

public class BarbaroHabilidades {
    private Proficiencias profBarbaro = new Proficiencias();
    public ArrayList<Habilidade> habilidadesPadrao() {
    ArrayList<Habilidade> habPassPadrao = new ArrayList<>();
        habPassPadrao.add(new Habilidade(
            "Defesa sem Armadura",
            "Sua CA é igual a 10 + Destreza + Constituição quando não está usando armadura.",
            1
        ));
        habPassPadrao.add(new Habilidade(
            "Senso de Perigo",
            "Vantagem em testes de resistência de Destreza contra efeitos visíveis.",
            2
        ));
        habPassPadrao.add(new Habilidade(
            "Movimento Rápido",
            "Aumenta a velocidade de movimento em 10 pés se não estiver usando armadura pesada.",
            5
        ));
        habPassPadrao.add(new Habilidade(
            "Instinto Selvagem",
            "Vantagem em testes de iniciativa.",
            7
        ));
        habPassPadrao.add(new Habilidade(
            "Crítico Brutal",
            "Ao fazer um ataque crítico com arma corpo a corpo, adicione um dado extra de dano.",
            9
        ));
        habPassPadrao.add(new Habilidade(
            "Fúria Implacável",
            "Quando cair a 0 pontos de vida, pode fazer um teste de resistência para não cair inconsciente.",
            11
        ));
        habPassPadrao.add(new Habilidade(
            "Fúria Persistente",
            "Sua fúria só termina se você cair inconsciente ou decidir terminar.",
            15
        ));
        habPassPadrao.add(new Habilidade(
            "Poder Indomável",
            "Se o resultado de um teste de Força for menor que seu valor de Força, use o valor de Força.",
            18
        ));
        habPassPadrao.add(new Habilidade(
            "Campeão Primal",
            "Força e Constituição aumentam em 4, máximo 24.",
            20
        ));
        return habPassPadrao;
    }
    public ArrayList<HabilidadeAtiva> habilidadeAtivasPadrao(){
        ArrayList<HabilidadeAtiva> habAtivas = new ArrayList<>();
        
        habAtivas.add(new HabilidadeAtiva(
        "Ataque Imprudente",
        "No seu turno, pode atacar com vantagem usando Força, mas ataques contra você também têm vantagem até seu próximo turno.",
        new int[]{0, 0, 0, 0, 0, 0}, 
        1, 
        2  
        ));
    }
}