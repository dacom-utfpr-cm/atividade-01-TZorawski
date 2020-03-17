package Questao04;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thais
 */
public class ThreadQ4 extends Thread {
    @Override
    public void run () {
        System.out.println("Thread iniciando...");
        try {
            Thread.sleep(10000); // Dormindo
        } catch (InterruptedException ex) {
            System.out.println("A thread foi interrompida.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex1) {
                // nada
            }
        }
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.out.println("A thread foi interrompida novamente.");
        }
        
        System.out.println("Thread finalizando...");
    }
}
