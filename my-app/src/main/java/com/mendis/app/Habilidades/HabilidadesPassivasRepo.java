package com.mendis.app.Habilidades;

import java.util.ArrayList;

public class HabilidadesPassivasRepo {
    private ArrayList<Habilidade> todasHabilidades = new ArrayList<>();
    public HabilidadesPassivasRepo(){
        this.todasHabilidades.add(new Habilidade(
            "defesa sem armadura",
            "seu CA é igual a 10 + Destreza + Constituição quando não está usando armadura.",
            1
        ));
        this.todasHabilidades.add(new Habilidade(
            "Senso de Perigo",
            "Vantagem em testes de resistência de Destreza contra efeitos visíveis.",
            2
        ));
        this.todasHabilidades.add(new Habilidade(
            "Movimento Rápido",
            "Aumenta a velocidade de movimento em 10 pés se não estiver usando armadura pesada.",
            5
        ));
        this.todasHabilidades.add(new Habilidade(
            "Instinto Selvagem",
            "Vantagem em testes de iniciativa.",
            7
        ));
        this.todasHabilidades.add(new Habilidade(
            "Crítico Brutal",
            "Ao fazer um ataque critico com arma corpo a corpo, adicione um dado extra de dano.",
            9
        ));
        this.todasHabilidades.add(new Habilidade(
            "Furia Implacavel",
            "Quando cair a 0 pontos de vida, pode fazer um teste de resistencia para não cair inconsciente.",
            11
        ));
        this.todasHabilidades.add(new Habilidade(
            "Furia Persistente",
            "Sua furia só termina se você cair inconsciente ou decidir terminar.",
            15
        ));
        this.todasHabilidades.add(new Habilidade(
            "Poder Indomavel",
            "Se o resultado de um teste de Força for menor que seu valor de Força,\n use o valor de Força.",
            18
        ));
        this.todasHabilidades.add(new Habilidade(
            "Campeão Primal",
            "Força e Constituição aumentam em 4, máximo 24.",
            20
        ));
    }
}
