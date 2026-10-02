package javaLista1;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        int a,b,soma;
        System.out.println("escreva dois numero para a equação: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        soma = a%b;
        System.out.println("o resultado é: ");
        System.out.println(soma);
    }
}
