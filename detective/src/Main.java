/*Utilizando listas, faça um programa que faça 5 perguntas para uma
        pessoa sobre um crime. As perguntas são:

        "Telefonou para a vítima?"

        "Esteve no local do crime?"

        "Mora perto da vítima?"

        "Devia para a vítima?"

        "Já trabalhou com a vítima?"

        Se a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        "Assassina". Caso contrário, ela será classificado como "Inocente".*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void contabilizarResposta(ArrayList<String> respostas) {
        Scanner scan = new Scanner(System.in);
        respostas.add(scan.nextLine());
    }

    public static void main(String[] args) {
        int respostasSim = 0;

        ArrayList<String> Respostas = new ArrayList<>();
        System.out.println("Telefonou para a vítima?");
        contabilizarResposta(Respostas);
        System.out.println("Esteve no local do crime?");
        contabilizarResposta(Respostas);
        System.out.println("Telefonou para a vítima?");
        contabilizarResposta(Respostas);
        System.out.println("Mora perto da vítima?");
        contabilizarResposta(Respostas);
        System.out.println("Já trabalhou com a vítima?");
        contabilizarResposta(Respostas);

        for (String resposta : Respostas) {
            if (resposta.equals("s")) respostasSim++;
        }

        String output = switch (respostasSim) {
            case 0:
            case 1: yield "Inocente";
            case 2: yield "Suspeita";
            case 3:
            case 4: yield "Cúmplice";
            case 5: yield "Assassina";
            default: yield null;
        };
        System.out.println(output);
    }
}
