package com.mycompany.inverte;

import java.util.Stack;

public class Inverte {

    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        
        String[] frase = "ESTE EXERCICIO E MUITO FACIL".split(" ");
        
        for(int i = 0; i < frase.length; i++){
            String[] palavra = frase[i].split("");
            for(int c = 0; c < palavra.length; c++){
                pilha.push(palavra[c]);
            }
            for(int l = 0; l < palavra.length; l++){
                String palavraInvertida = pilha.pop();
                System.out.print(palavraInvertida);
            }
            System.out.print(" ");
        }
    }
}
