package javaLista1;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        double a;
        System.out.println("escreva o numero para o calculo: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        a = Math.pow(a, 2);
        System.out.println(a);

    }


}
