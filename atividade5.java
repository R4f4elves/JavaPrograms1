package javaLista1;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Double num1, num2, sub;
        System.out.println("Informe dois numeros para a subtração: ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextDouble();
        sc.close();
        sub=num1-num2;
        System.out.println(sub);
    }
}
