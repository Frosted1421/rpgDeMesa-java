package com.mendis.app.Habilidades;

import java.util.ArrayList;

public class HabilidadesPassivasRepo {
    private ArrayList<Habilidade> todasHabilidades = new ArrayList<>();
    public HabilidadesPassivasRepo(){
        
        this.todasHabilidades.add(new Habilidade(
            "Defesa sem Armadura",
            "seu CA é igual a 10 + Destreza + Constituição quando não está usando armadura.",
            1
        ));
        this.todasHabilidades.add(new Habilidade(
            "Senso de Perigo",
            "Vantagem em testes de resistência de Destreza contra efeitos visíveis.",
            2
        ));
        this.todasHabilidades.add(new Habilidade(
            "Movimento Rapido",
            "Aumenta a velocidade de movimento em 10 pés se não estiver usando armadura pesada.",
            5
        ));
        this.todasHabilidades.add(new Habilidade(
            "Instinto Selvagem",
            "Vantagem em testes de iniciativa.",
            7
        ));
        this.todasHabilidades.add(new Habilidade(
            "Critico Brutal",
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
            "Campeao Primal",
            "Força e Constituição aumentam em 4, máximo 24.",
            20
        ));
                this.todasHabilidades.add(new Habilidade(
            "Resistência a Dano",
            "Enquanto estiver em fúria, você tem resistência a dano cortante, perfurante e contundente de armas não mágicas.",
            1
        ));
        this.todasHabilidades.add(new Habilidade(
            "Ataque Extra",
            "A partir do 5º nível, você pode atacar duas vezes, ao invés de uma, sempre que realizar a ação de ataque no seu turno.",
            5
        ));
        this.todasHabilidades.add(new Habilidade(
            "Movimento de Combate",
            "Você ignora terreno difícil ao se mover durante o combate.",
            7
        ));
        this.todasHabilidades.add(new Habilidade(
            "Sentido Primitivo",
            "Você pode perceber criaturas invisíveis próximas, mesmo sem vê-las claramente.",
            10
        ));
        this.todasHabilidades.add(new Habilidade(
            "Olhar Intimidante",
            "Você pode usar sua presença ameaçadora para assustar inimigos automaticamente em algumas situações.",
            3
        ));
        this.todasHabilidades.add(new Habilidade(
            "Vigor Selvagem",
            "Você recupera pontos de vida adicionais ao usar dados de vida durante um descanso curto.",
            6
        ));
        this.todasHabilidades.add(new Habilidade(
            "Fôlego de Batalha",
            "Você pode agir normalmente mesmo quando está gravemente ferido.",
            9
        ));
        this.todasHabilidades.add(new Habilidade(
            "Olhos de Caçador",
            "Você tem vantagem em testes de Percepção para rastrear criaturas.",
            2
        ));
        this.todasHabilidades.add(new Habilidade(
            "Tolerância ao Frio",
            "Você sofre metade do dano de frio e ignora efeitos de clima gelado.",
            4
        ));
        this.todasHabilidades.add(new Habilidade(
            "Aparar Instintivo",
            "Você pode reduzir o dano de um ataque corpo a corpo uma vez por rodada.",
            8
        ));
        this.todasHabilidades.add(new Habilidade(
            "Fúria Intensa",
            "Sua fúria dura 2 turnos a mais do que o normal.",
            12
        ));
        this.todasHabilidades.add(new Habilidade(
            "Corpo de Ferro",
            "Você recebe +1 de CA enquanto não estiver usando armadura pesada.",
            13
        ));
        this.todasHabilidades.add(new Habilidade(
            "Determinação Inabalável",
            "Você tem vantagem em testes de resistência contra ser amedrontado.",
            14
        ));
        this.todasHabilidades.add(new Habilidade(
            "Força Avassaladora",
            "Você pode carregar o dobro do peso sem ficar sobrecarregado.",
            8
        ));
        this.todasHabilidades.add(new Habilidade(
            "Rugido de Guerra",
            "Aliados a até 10 metros recebem vantagem em testes de resistência contra medo.",
            16
        ));
         this.todasHabilidades.add(new Habilidade(
        "Resistência a Dano",
        "Enquanto estiver em fúria, você tem resistência a dano cortante, perfurante e contundente de armas não mágicas.",
        1
        ));
        this.todasHabilidades.add(new Habilidade(
        "Ataque Extra",
        "A partir do 5º nível, você pode atacar duas vezes, ao invés de uma, sempre que realizar a ação de ataque no seu turno.",
        5
    ));
    this.todasHabilidades.add(new Habilidade(
        "Movimento de Combate",
        "Você ignora terreno difícil ao se mover durante o combate.",
        7
    ));
    this.todasHabilidades.add(new Habilidade(
        "Sentido Primitivo",
        "Você pode perceber criaturas invisíveis próximas, mesmo sem vê-las claramente.",
        10
    ));
    this.todasHabilidades.add(new Habilidade(
        "Campeão Selvagem",
        "Seus ataques críticos causam ainda mais dano, adicionando dados extras.",
        17
    ));

    }
    public Habilidade getHabilidade(String nome){
        String compara="";
        nome=nome.toLowerCase();
        for (Habilidade habilidade : todasHabilidades) {
           
            if(habilidade.getNome().toLowerCase().equals(nome)){
                return habilidade;
            }
        }
        throw new IllegalArgumentException("Essa Habiliade não existe no repositorio,\n verifique se o nome esta digitado corretamente ou adicione esta habilidade na lista.");
    }
}
