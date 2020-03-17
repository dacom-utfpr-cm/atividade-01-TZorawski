package Questao04;

/**
 * 17/03/2020
 * @author thais
 */
public class Main {
    public static void main(String[] args) {
        // Criando as threads
        ThreadQ4 t1 = new ThreadQ4();
        ThreadQ4 t2 = new ThreadQ4();
        ThreadQ4 t3 = new ThreadQ4();
        
        // Inicializando as threads
        t1.start();
        t2.start();
        t3.start();
        
        // Verifica estado das threads
        new Thread(
            () -> {
                while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
                    if (t1.isInterrupted()) {
                        System.out.println("T1 interrompida");
                    }
                    System.out.println(t1.isInterrupted());
                    if (t2.isInterrupted()) {
                        System.out.println("T2 interrompida");
                    }
                    
                    if (t3.isInterrupted()) {
                        System.out.println("T3 interrompida");
                    }
                }
            }
        ).start();
        
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
}
