package javalista1;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Integer a, b, c, d, e, soma;
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

        System.out.println("Informe o quinto número: ");
        e = sc.nextInt();

        sc.close();

        soma = a + b + c + d;
        div = (double) soma / e;

        System.out.println("O resultado da soma dos 4 primeiros dividido pelo quinto numero é: " + div);
    }
}
