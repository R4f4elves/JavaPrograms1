package javaLista1;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Double num1,num2, soma;
        System.out.println("Informe o primeiro numero para a soma: ");
        Scanner sc =new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextDouble();
        soma=num1+num2;
        System.out.println("A soma é: "+soma);

        sc.close();

    }
}
