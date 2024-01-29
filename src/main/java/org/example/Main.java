package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;


        System.out.println("Informe um número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe outro número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Informe a operação que deseja realizar: +,-,*,/ ");
        String operacao = scanner.next();

        switch (operacao){
            case "+":{
                System.out.println(numero1 + numero2);
                break;
            }
            case "-":{
                System.out.println(numero1 - numero2);
                break;
            }
            case "*":{
                System.out.println(numero1 * numero2);
                break;
            }
            case "/":{
                System.out.println(numero1 / numero2);
                break;
            }
        }





    }
}