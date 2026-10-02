package javaLista1;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Double num1, num2, div;
        String nome;


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Agora informe dois numeros: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        div = num1 / num2;
        sc.close();
        System.out.println(nome+" " + " "+div);

    }
}
