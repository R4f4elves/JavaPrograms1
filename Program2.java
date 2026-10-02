package javaLista1;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Integer a, b, c, d, soma;
        Double div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        b = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        c = sc.nextInt();

        System.out.println("Informe o quarto número: ");
        d = sc.nextInt();

        sc.close();

        soma = a + b + c + d;
        div = (double) soma / 4;

        System.out.println("O resultado da equação é " + div);
    }
}
