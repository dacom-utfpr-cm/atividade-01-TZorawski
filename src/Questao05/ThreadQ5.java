package Questao05;

import java.util.Scanner;

/**
 * 17/03/2020
 * @author thais
 */
public class ThreadQ5 extends Thread {
    @Override
    public void run () {
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num1 = scn.nextInt();
        
        System.out.println("Digite outro número inteiro: ");
        int num2 = scn.nextInt();
        
        int soma = num1 + num2;
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
    }
}
