package javaLista1;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("escreva dois numros e vê a magica ai fi ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        a = a*2;
        b = b*3;
        System.out.println("o resultado é: ");
        System.out.println(a);
        System.out.println(b);
    }
}
