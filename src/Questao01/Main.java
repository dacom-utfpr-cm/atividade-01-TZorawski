package Questao01;
import java.util.Random;
/**
 * 17/03/2020
 * @author thais
 */
public class Main {
    public static void main(String[] args) {
        Random gerador = new Random(); // Criando gerador de inteiro
        
        // ############### Criando threads ###############
        // Thread 01
        new Thread( () -> {
            int num = gerador.nextInt(15) * 1000; // Gerando tempo de execução eleatório
            System.out.println("Thread 01 iniciando... time -> " + num);
            try {
                Thread.sleep(num); // Dormindo
            } catch (InterruptedException ex) {
                System.out.println("Erro sleep thread 01");
            }
            System.out.println("Thread 01 finalizando...");
        }).start();
        
        // Thread 02
        new Thread( () -> {
            int num = gerador.nextInt(15) * 1000; // Gerando tempo de execução eleatório
            System.out.println("Thread 02 iniciando... time -> " + num);
            try {
                Thread.sleep(num); // Dormindo
            } catch (InterruptedException ex) {
                System.out.println("Erro sleep thread 01");
            }
            System.out.println("Thread 02 finalizando...");
        }).start();
        
        // Thread 03
        new Thread( () -> {
            int num = gerador.nextInt(15) * 1000; // Gerando tempo de execução eleatório
            System.out.println("Thread 03 iniciando... time -> " + num);
            try {
                Thread.sleep(num); // Dormindo
            } catch (InterruptedException ex) {
                System.out.println("Erro sleep thread 01");
            }
            System.out.println("Thread 03 finalizando...");
        }).start();
    }
}
