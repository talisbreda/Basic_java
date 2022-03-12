import java.util.ArrayList;
import java.util.Arrays;

/* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc). */

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(25d, 24d, 23d, 22d, 21d, 20d));
        double soma = 0, media;

        for (double temp: temperatures) {
            soma += temp;
        }
        
        media = soma / temperatures.size();
        System.out.println(media);
        
        for (double temp: temperatures) {
            if (temp > media) {
                int mes = temperatures.indexOf(temp);
                String stringMes = switch (mes) {
                    case 0: yield "Janeiro";
                    case 1: yield "Fevereiro";
                    case 2: yield "Março";
                    case 3: yield "Abril";
                    case 4: yield "Maio";
                    case 5: yield "Junho";
                    default: yield null;
                };
                System.out.printf("%s: %.1f %n", stringMes, temp);
            }
        }
    }
}
