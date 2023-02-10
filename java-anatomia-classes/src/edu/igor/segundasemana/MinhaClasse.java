package edu.igor.segundasemana;
public class MinhaClasse {

    public static void main (String [] args) {
        //System.out.print("Hello World");

        // int ano = 2021;
        // ano = 2022;

        // final String BR = "Brasil";

        String primeiroNome = "Igor";
        String segundoNome = "Pereira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}