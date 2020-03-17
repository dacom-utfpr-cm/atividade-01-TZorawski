package Questao03;

import java.util.Random;

/**
 * 17/03/2020
 * @author thais
 */
public class Q1 extends Thread {
    @Override
    public void run () {
        Random gerador = new Random(); // Criando gerador de inteiro
        int num = gerador.nextInt(15) * 1000; // Gerando tempo de execução eleatório
        System.out.println("Thread q1 iniciando... time -> " + num);
        try {
            Thread.sleep(num); // Dormindo
        } catch (InterruptedException ex) {
            System.out.println("A thread q1 foi interrompida.");
        }
        System.out.println("Thread q1 finalizando...");
    }
}
