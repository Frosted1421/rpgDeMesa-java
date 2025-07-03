package com.mendis.app.Habilidades;

import java.util.ArrayList;

import com.mendis.app.*;

public class BarbaroInicial extends InicialPadrao {
    public BarbaroInicial(){
        this.proficienciasPadrao();
        this.habilidadesPadrao();
        this.habilidadeAtivasPadrao();
        
    }
    private void proficienciasPadrao(){
        
        this.prof.novaProficienciaArmadura("leve");
        this.prof.novaProficienciaArmadura("media");
        this.prof.novaProficienciaArmadura("pesada");
        this.prof.novaProficienciaArma("simples");
        this.prof.novaProficienciaArma("maricial");
        
    }
    private void habilidadesPadrao() {
    
        this.habPassPadrao.add(new Habilidade(
            "defesa sem armadura",
            "seu CA é igual a 10 + Destreza + Constituição quando não está usando armadura.",
            1
        ));
        this.habPassPadrao.add(new Habilidade(
            "Senso de Perigo",
            "Vantagem em testes de resistência de Destreza contra efeitos visíveis.",
            2
        ));
        this.habPassPadrao.add(new Habilidade(
            "Movimento Rápido",
            "Aumenta a velocidade de movimento em 10 pés se não estiver usando armadura pesada.",
            5
        ));
        this.habPassPadrao.add(new Habilidade(
            "Instinto Selvagem",
            "Vantagem em testes de iniciativa.",
            7
        ));
        this.habPassPadrao.add(new Habilidade(
            "Crítico Brutal",
            "Ao fazer um ataque critico com arma corpo a corpo, adicione um dado extra de dano.",
            9
        ));
        this.habPassPadrao.add(new Habilidade(
            "Furia Implacavel",
            "Quando cair a 0 pontos de vida, pode fazer um teste de resistencia para não cair inconsciente.",
            11
        ));
        this.habPassPadrao.add(new Habilidade(
            "Furia Persistente",
            "Sua furia só termina se você cair inconsciente ou decidir terminar.",
            15
        ));
        this.habPassPadrao.add(new Habilidade(
            "Poder Indomavel",
            "Se o resultado de um teste de Força for menor que seu valor de Força,\n use o valor de Força.",
            18
        ));
        this.habPassPadrao.add(new Habilidade(
            "Campeão Primal",
            "Força e Constituição aumentam em 4, máximo 24.",
            20
        ));
        
    }
    private void habilidadeAtivasPadrao(){
        
        
        this.habAtivasPadrao.add(new HabilidadeAtiva(
        "Ataque Imprudente",
        "No seu turno, pode atacar com vantagem usando Força, mas ataques contra você também têm vantagem até seu próximo turno.",
        new int[]{0, 0, 0, 0, 0, 0}, 
        1, 
        2  
        ));

        this.habAtivasPadrao.add(new HabilidadeAtiva(
            "Campeão Primal",
            "Força e Constituição aumentam em 4, máximo 24.",
            new int[]{4,0,4,0,0},
            0,
            20
        ));
    }
}