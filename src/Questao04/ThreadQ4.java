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
        int j = 0;
        for (int i = 0; i < 50000; i++) {
            System.out.print(" ");
        }
        
        if (Thread.interrupted()) {
            System.out.println("Thread interrompida.");
        }
        
        System.out.println("Thread finalizando...");
    }
}
