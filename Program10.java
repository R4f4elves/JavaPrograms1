package javaLista1;

import java.util.Scanner;

public class ativade10 {
    public static void main(String[] args) {
        int a,b,soma;
        System.out.println("escreve os numeros ai fi: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        soma = (a*2+b*3)/(2+3);
        System.out.println("o resultado é: ");
        System.out.println(soma);
    }
}
